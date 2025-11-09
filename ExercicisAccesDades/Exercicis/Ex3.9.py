import math

def esPrimer(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def esPerfecte(n):
    temp = (2 ** n) - 1
    if esPrimer(temp):
        perfecte = ((2 ** (n - 1)) * temp)
        print(f"{perfecte} és un nombre perfecte")
        return True

esPerfecte(int(input("Introdueix un nombre: ")))