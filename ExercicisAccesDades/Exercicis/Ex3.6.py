import math

def pilesTriangulars2():
    llaunes = 0
    necessaries = 0
    while True:
        necessaries = 0
        llaunes = int(input())
        if llaunes == 0:
            break


        r = math.isqrt(llaunes)
        es_quadrat = (r * r == llaunes)

        if llaunes == 2:
            print(f"{llaunes} No és un nombre vàlid")

        if llaunes == 1:
            print(f"{llaunes} és un nombre vàlid")

        for i in range(0, llaunes - 1):
            necessaries += i + 1
            print("*" * (i + 1))


            if necessaries == llaunes and es_quadrat:
                print(f"{llaunes} és un nombre vàlid")
                break

            elif necessaries > llaunes:
                print(f"{llaunes} No és un nombre vàlid")
                break

pilesTriangulars2()
