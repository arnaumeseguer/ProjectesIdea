from pathlib import Path
import os

def demanaDirectori():
    while True:
        nom = input("Directori: ").strip()
        p = Path(nom)
        if p.exists() and p.is_dir():
            return p
        print("Directori inexistent. Torna-ho a provar.")

def llistaOs(path: Path):
    print(f"[os.listdir] Contingut de {path}:")
    for nom in os.listdir(path):
        print(" -", nom)


def llistaPathlib(path: Path):
    print(f"[pathlib] Contingut de {path}:")
    for entry in path.iterdir():
        print(" -", entry.name)

llistaOs(demanaDirectori())
llistaPathlib(demanaDirectori())

