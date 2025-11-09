while True:
    parkings = 0
    resultat = 0
    apte = False
    index = 0
    coche = int(input())
    if coche == 0:
        break

    millor_mida = None
    millor_forat = 0

    while True:
        valors = input()
        if valors == "0":
            break

        index += 1
        split = valors.split(" ")
        inici = int(split[0])
        fi = int(split[1])

        mida = fi - inici

        # Condició correcta: mínim 150% de la mida del cotxe
        if mida >= coche * 1.5:
            parkings += 1
            apte = True
