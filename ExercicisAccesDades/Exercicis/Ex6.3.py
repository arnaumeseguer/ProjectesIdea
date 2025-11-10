from pathlib import Path

def demanaArxiu():
    while True:
        nom = input("Nom de l'arxiu: ").strip()
        p = Path(nom)
        if p.exists() and p.is_file():
            return p
        print("No es pot obrir (no existix o no és un fitxer). Torna-ho a provar.")

def comptaLiniesCaracters(path):
    with open(path, "r", encoding="utf-8") as f:
        linies = f.readlines()

    total = len(linies)
    llargaries = [len(l.strip("\n")) for l in linies]

    return total, llargaries



print(comptaLiniesCaracters(demanaArxiu()))


