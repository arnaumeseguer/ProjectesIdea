numeros = input().split()
accedir = int(input())
arrayF = []
print("[", end="")
for i in range(len(numeros)-1):
    arrayF.append(numeros[i])
    if numeros[i + 1] == "-1":
        print(numeros[i],end="")
        break
    else: print(numeros[i], end=", ")
print("]")
print(arrayF[accedir])