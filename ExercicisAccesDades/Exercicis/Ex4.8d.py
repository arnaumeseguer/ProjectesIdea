cadena = input("Introduir cadena: ")
caracter = input("Introduir caracter: ")
state = 0
i = 0

while i < len(cadena):
    if state != 3:
        print(cadena[i], end="")
        i += 1
        state += 1
    else:
        print(caracter, end="")
        state = 0
