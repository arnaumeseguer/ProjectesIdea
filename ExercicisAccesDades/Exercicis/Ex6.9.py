from pathlib import Path
import shutil

def demanaDirectori():
    while True:
        nom = input("Directori: ").strip()
        p = Path(nom)
        if p.exists() and p.is_dir():
            return p
        print("Directori inexistent. Torna-ho a provar.")

def demo_fs_ops(base: Path):
    dir = base / "nivell1" / "nivell2"
    dir.mkdir(parents=True, exist_ok=True)
    print("Creat directori:", dir)

    fitxer = dir / "prova.txt"
    with fitxer.open("w", encoding="utf-8") as f:
        f.write("Hola món!\n")
    print("Creat fitxer:", fitxer)

    try:
        fitxer.unlink()
        print("Esborrat fitxer:", fitxer)
    except IsADirectoryError:
        print("No es pot esborrar un directori amb unlink().")


    try:
        dir.rmdir()
    except OSError as e:
        print("No es pot esborrar directori no buit amb rmdir:", e)

    for p in sorted(dir.glob("**/*"), reverse=True):
        if p.is_file():
            p.unlink()
        else:
            try:
                p.rmdir()
            except OSError:
                pass
    for p in [dir, dir.parent, dir.parent.parent]:
        try:
            p.rmdir()
            print("Esborrat directori:", p)
        except OSError as e:
            print("No s'ha pogut esborrar:", p, "-", e)

    arbre = base / "arbre_demo"
    (arbre / "a" / "b").mkdir(parents=True, exist_ok=True)
    (arbre / "a" / "b" / "fitxer.txt").write_text("demo", encoding="utf-8")
    print("Creat arbre:", arbre)
    shutil.rmtree(arbre)
    print("Esborrat arbre amb rmtree:", arbre)

demo_fs_ops(demanaDirectori())