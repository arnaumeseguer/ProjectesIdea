import numbers
import random

print("Es generarà una clau aleatòria")

clau = random.randint(1000, 9999)
resultat = f"la seva clau és {clau}"

for i in range(len(resultat)):
    if resultat[i].isnumeric():
        print("X", end="")
    else:
        print(resultat[i], end="")

print(f"\nla clau era: {clau}")