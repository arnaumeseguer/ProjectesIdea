casos = int(input())


for i in range(casos):
    suma = 0
    producte = 1
    nombre = int(input())
    if nombre <= 0:
        print("ELS NOMBRES NATURALS COMENCEN EN 1")
        continue

    for nombres in range (1, nombre + 1):
        suma += nombres
        producte *= nombres
    print(f"SUMA: {suma}  PRODUCTE: {producte}")