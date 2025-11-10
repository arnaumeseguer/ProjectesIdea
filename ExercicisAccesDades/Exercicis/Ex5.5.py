def esPrimer(n):
    if n < 2:
        return False
    if n % 2 == 0:
        return n == 2
    i = 3
    while i * i <= n:
        if n % i == 0:
            return False
        i += 2
    return True

def filtraPrimers(llista):
    return [x for x in llista if isinstance(x, int) and esPrimer(x)]

print(filtraPrimers([1,2,3,4,5,6,7,8,9,10,11]))