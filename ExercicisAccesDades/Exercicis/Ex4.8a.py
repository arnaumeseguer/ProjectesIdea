cadena = input()
caracter = input()
for i in range(len(cadena)):
    if i == len(cadena) - 1:
        print(cadena[i])
    else:
        print(f"{cadena[i]}{caracter}", end="")