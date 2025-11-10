from pathlib import Path
import fnmatch
import os

def demanaDirectori():
    while True:
        nom = input("Directori: ").strip()
        p = Path(nom)
        if p.exists() and p.is_dir():
            return p
        print("Directori inexistent. Torna-ho a provar.")

def cercaGlob(root: Path, pattern: str):
    if "**" in pattern:
        for p in root.rglob(pattern.replace("**/", "")) if pattern.startswith("**/") else root.rglob(pattern):
            print(p)
    else:
        for p in root.glob(pattern):
            print(p)

def cercaNom(root: Path, pattern: str):
    for dirpath, dirnames, filenames in os.walk(root):
        for name in dirnames + filenames:
            if fnmatch.fnmatch(name, pattern):
                print(Path(dirpath) / name)

cercaGlob(demanaDirectori(), input("Quin patró vols seguir? (Ex: *.py): "))
cercaNom(demanaDirectori(), input("Quin patró vols seguir? (Ex: *.py): "))