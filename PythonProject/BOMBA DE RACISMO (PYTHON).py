paisos = int(input())
if paisos == 0:
    while True:
        pais = input()
        if pais == "Llarga vida al President":
            break
        print("Bomba de racimo")

else:
    arrayP = input().split(", ")
    llistaNegra = []

    for i in range (len(arrayP)):
        llistaNegra.append(arrayP[i])
    while True:
        pais = input()
        if pais == "Llarga vida al President":
            break
        if pais in llistaNegra:
            print("Bomba de racismo")
        else:
            print("Bomba de racimo")


