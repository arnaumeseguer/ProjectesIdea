dia = int(input())
any = int(input())
bixest = False

if (any % 400 == 0) or (any % 4 == 0 and any % 100 != 0):
    bixest = True

if dia < 1 or dia > 366:
    print("Incorrecte per qualsevol any!")
elif not bixest and dia == 366:
    print("Incorrecte per any no bixest!")
elif bixest and dia <= 366:
    print("Correcte i any bixest!")
elif dia <= 365:
    print("Correcte i any qualsevol!")
