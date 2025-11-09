def cadaDos():
    cadena = input()
    for i in range (len(cadena)):
        if i % 2 == 0:
            print(cadena[i], end="")
cadaDos()

