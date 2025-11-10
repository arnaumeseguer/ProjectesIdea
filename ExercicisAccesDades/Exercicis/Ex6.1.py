from pathlib import Path

def demanaArxiu():
    while True:
        nom = input("Nom de l'arxiu: ").strip()
        p = Path(nom)
        if p.exists() and p.is_file():
            return p
        print("No es pot obrir (no existix o no és un fitxer). Torna-ho a provar.")

def comptaLinies(path: Path) -> int:
    with path.open("r", encoding="utf-8") as f:
        return sum(1 for _ in f)


print(comptaLinies(demanaArxiu()))