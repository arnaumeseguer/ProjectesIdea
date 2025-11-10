from pathlib import Path
import os

def demanaDirectori():
    while True:
        nom = input("Directori: ").strip()
        p = Path(nom)
        if p.exists() and p.is_dir():
            return p
        print("Directori inexistent. Torna-ho a provar.")

def recorrer(root: Path, stop: str | None = None):
    for dirpath, dirnames, filenames in os.walk(root):
        if stop and (stop in dirnames or stop in filenames):
            print(f"Trobat: {stop} a {dirpath}, Aturant...")
            return
        print(f"No s'ha trobat el directori o fitxer \"{stop}\"")
        break

for i in (0,2):
    recorrer(demanaDirectori(), input("Indica el directory o fitxer a trobar: "))
