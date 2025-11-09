linies = int(input())

cadenaSplit = []

for i in range(linies):
    cadena = input()
    cadenaSplit.append(cadena)

for linia in cadenaSplit:
    resultat = ""
    for posicio, lletra in enumerate(linia):
        if posicio % 2 == 0:
            resultat += lletra.lower()
        else:
            resultat += lletra.upper()
    print(resultat)
