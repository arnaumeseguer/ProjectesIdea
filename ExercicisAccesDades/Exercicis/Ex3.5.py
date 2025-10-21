def pilesTriangulars(n):
    llaunes = n
    necessaries = 0
    for i in range(0,n - 1):
        necessaries += i + 1
        if necessaries == llaunes:
            print(f"{llaunes} és un nombre vàlid")
            break

        elif necessaries > llaunes:
            print(f"{llaunes} No és un nombre vàlid")
            break
pilesTriangulars(int(input()))