casos = int(input())

for i in range(casos):
    suma = 0
    nombres = input().split(" ")
    for i in range(1, int(nombres[0]) + 1):
        if i % 3 == 0:
            suma += int(nombres[i])
    print(suma)