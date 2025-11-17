lletres = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
paraules = int(input())
if paraules == 0:
    print("NO")
else:
    lletraAnt = ''
    paraula = input()
    abecegrama = True
    for i in range(paraules):

        if lletraAnt == '':
            lletraAnt = paraula[0]
            continue
        paraula = input()
        if paraula == '':
            continue
        if paraula[0] == 'a' and lletraAnt == 'z':
            lletraAnt = paraula[0]
            continue
        if (lletres.index(paraula[0])) == (lletres.index(lletraAnt) + 1):
            lletraAnt = paraula[0]
            continue
        else:
            abecegrama = False
            continue

    if abecegrama:
        print("SI")
    else:
        print("NO")
