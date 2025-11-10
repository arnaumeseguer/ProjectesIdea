def ordreAlfabetic():
    cadena1 = input()
    cadena2 = input()

    if cadena1 < cadena2:
        return cadena1
    else:
        return cadena2

print(ordreAlfabetic())