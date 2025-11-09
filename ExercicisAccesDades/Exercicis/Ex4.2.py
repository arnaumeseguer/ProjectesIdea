cadena = input("Introdueix una cadena de caracters: ")
cadenaLlarg = len(cadena)
while cadenaLlarg > 0:
    print(cadena[cadenaLlarg - 1])
    cadenaLlarg -= 1