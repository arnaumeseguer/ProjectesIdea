from pathlib import Path
from datetime import datetime

def demanaDirectori():
    while True:
        nom = input("Directori: ").strip()
        p = Path(nom)
        if p.exists() and p.is_dir():
            return p
        print("Directori inexistent. Torna-ho a provar.")

def mostraStat(path: Path):
    state = path.stat()
    tipus = "Directori" if path.is_dir() else "Arxiu"
    mtime = datetime.fromtimestamp(state.st_mtime)
    print(f"{tipus:4} {state.st_size:>10} bytes  mtime={mtime}  -> {path.name}")

def llistaFiltrat(path, mode):
    for i in (0,2):
        mode = input("Vols veure fitxers (\"files\") o directoris (\"dirs\")? ")
        for entry in path.iterdir():

            if mode == "files" and not entry.is_file():
                continue

            if mode == "dirs" and not entry.is_dir():
                continue

            mostraStat(entry)




llistaFiltrat(demanaDirectori(), "files")