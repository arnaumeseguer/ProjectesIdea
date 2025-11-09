cadena = input("Introdueix una cadena de caracters:")
caracter = input("Introdueix un caracter:")

for i in range(len(cadena)):
    if cadena[i] == " ":
        cadena = cadena.replace(cadena[i], caracter)

print(cadena)