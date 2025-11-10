from pathlib import Path
import shutil

def demanaDirectori():
    while True:
        nom = input("Directori: ").strip()
        p = Path(nom)
        if p.exists() and p.is_dir():
            return p
        print("Directori inexistent. Torna-ho a provar.")

def demo_compress_uncompress(base: Path):
    carpeta = base / "carpeta_zip"
    carpeta.mkdir(parents=True, exist_ok=True)
    (carpeta / "a.txt").write_text("A", encoding="utf-8")
    (carpeta / "b.txt").write_text("B", encoding="utf-8")

    # Crear arxiu .zip (també admet 'gztar', 'tar', 'xztar', etc.)
    zip_base = str(base / "arxiu")
    arxiu_zip = shutil.make_archive(zip_base, "zip", root_dir=carpeta)
    print("Creat ZIP:", arxiu_zip)

    # Descomprimir a una carpeta 'unpack'
    dest = base / "unpack"
    dest.mkdir(parents=True, exist_ok=True)
    shutil.unpack_archive(arxiu_zip, extract_dir=dest)
    print("Descomprimit a:", dest)


demo_compress_uncompress(demanaDirectori())