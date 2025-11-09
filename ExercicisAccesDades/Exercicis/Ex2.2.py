import sys
print("Escriu el teu salari brut per hora")

try:
    salari = float(input())
except ValueError:
    print("Error: Escriu un nombre")
    sys.exit(1)

print("Escriu les hores treballades")
try:
    hores = float(input())
except ValueError:
    print("Error: Escriu un nombre")
    sys.exit(1)

horesExtra = hores - 40

if hores > 40.0 :
    resultat = (salari * 40) + ((salari * 1.5) * horesExtra)

else:
    resultat = salari * hores

print(f"El teu salari brut per hora és {resultat}")