dataAct = input().split("/")


while True:
    dataProducte = input().split("/")
    if int(dataProducte[0]) > int(dataAct[0]) + 2:
        print("SI")
    else:
        print("NO")
        break