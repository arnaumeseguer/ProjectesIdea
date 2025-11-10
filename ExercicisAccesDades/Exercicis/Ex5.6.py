def separa(llista, k):
    menors = []
    iguals = []
    majors = []
    for x in llista:
        if x < k:
            menors.append(x)
        elif x > k:
            majors.append(x)
        else:
            iguals.append(x)
    return (f"menors = {menors}"), (f"majors = {majors}"), (f"iguals = {iguals}")


print(separa([1,2,3,4,5,6,7,8,9,10,], 5))