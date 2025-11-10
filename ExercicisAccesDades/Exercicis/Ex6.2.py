from pathlib import Path

def creaArxiu():
    while True:
        nom = input("Nom de l'arxiu a crear: ").strip()
        p = Path(nom)
        p.parent.mkdir(parents=True, exist_ok=True)
        return p


def escriuAlArxiu(path: Path):
    print("Escriu línies. Escriu 'fi' per acabar.")
    with path.open("w", encoding="utf-8") as f:
        while True:
            linea = input()
            if linea.strip().lower() == "fi":
                break
            f.write(linea + "\n")


escriuAlArxiu(creaArxiu())