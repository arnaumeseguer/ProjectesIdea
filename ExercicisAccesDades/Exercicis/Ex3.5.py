def pilesTriangulars():

    llaunes = 0
    necessaries = 0
    while True:
        necessaries = 0
        llaunes = int(input())
        if llaunes == 0:
            break
        if llaunes == 2:
            print(f"{llaunes} No és un nombre vàlid")

        if llaunes == 1:
            print(f"{llaunes} és un nombre vàlid")

        for i in range(0,llaunes - 1):
            necessaries += i + 1
            if necessaries == llaunes:
                print(f"{llaunes} és un nombre vàlid")
                break

            elif necessaries > llaunes:
                print(f"{llaunes} No és un nombre vàlid")
                break
pilesTriangulars()