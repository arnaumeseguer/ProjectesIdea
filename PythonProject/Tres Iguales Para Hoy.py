from itertools import count
casos = int(input())
nombreR = "NO"

for i in range(casos):
    nombres = input().split(" ")
    nombresArr = []
    for nombre in nombres:
        nombreR = "NO"
        if nombres.count(nombre) >= 3:
            nombreR = int(nombre)
            break
    print(nombreR)