def cadInvers():
    cadena = input()
    cadenaLlarg = len(cadena)
    for i in range (len(cadena)):
        print(cadena[i], end="")
    while cadenaLlarg > 0:
        print(cadena[cadenaLlarg - 1], end="")
        cadenaLlarg -= 1

cadInvers()