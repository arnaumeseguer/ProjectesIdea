print("Escriu el teu salari brut per hora")
salari = float(input())
print("Escriu les hores treballades")
hores = float(input())
horesExtra = hores - 40

if hores > 40.0 :
    resultat = (salari * 40) + ((salari * 1.5) * horesExtra)

else:
    resultat = salari * hores

print(f"El teu salari brut per hora és {resultat}")