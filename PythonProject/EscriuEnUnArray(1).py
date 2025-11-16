arrayTamany = int(input())
arrayTextSplit = input().split(" ")
accedir = int(input())

arrayFinal = []
for i in range(arrayTamany):
    arrayFinal.append(arrayTextSplit[i])
    print(arrayTextSplit[i], end=" ")

print("")
print(arrayFinal[accedir])