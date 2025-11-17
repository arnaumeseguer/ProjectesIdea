from fractions import Fraction

platspinyons = input().split()
plats = int(platspinyons[0])
pinyons = int(platspinyons[1])

dentsPlats = [int(x) for x in input().split()]
dentsPinyons = [int(x) for x in input().split()]

resultat = []
for dentPl in dentsPlats:
    for dentPi in dentsPinyons:
        resultat.append((Fraction(dentPl, dentPi), dentPl, dentPi))

resultat.sort(key=lambda x: x[0])

for _, dentPl, dentPi in resultat:
    print(f"({dentPl},{dentPi})")

for _, dentPl, dentPi in resultat:
    print((Fraction(dentPl, dentPi), dentPl, dentPi))