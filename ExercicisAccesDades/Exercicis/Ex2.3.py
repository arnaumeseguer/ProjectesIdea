import sys

print("Escriu una puntuació entre 0.0 i 1.0")

try:
    puntuacio = float(input())

    if puntuacio < 0.0 or puntuacio > 1.0:
        raise Exception()

    if puntuacio >= 0.0 and puntuacio < 0.6:
        print("insuficient")
    elif puntuacio >= 0.6 and puntuacio < 0.7:
        print("suficient")
    elif puntuacio >= 0.7 and puntuacio < 0.8:
        print("bé")
    elif puntuacio >= 0.8 and puntuacio < 0.9:
        print("notable")
    elif puntuacio >= 0.9 and puntuacio <= 1.0:
        print("excel·lent")

except ValueError:
    print("Error: Has d’introduir un número vàlid.")
except Exception:
    print("Error: El valor ha de ser entre 0.0 i 1.0")
