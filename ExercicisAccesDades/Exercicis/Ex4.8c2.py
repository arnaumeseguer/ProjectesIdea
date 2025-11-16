clau = input("Introdueix la teva clau: ")
caracter = input("Caracter per remplaçar:")
caracter = caracter*len(clau)

print(clau.replace(clau, caracter))