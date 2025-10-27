import math
def esPrimer(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

while True:
    n = int(input("Introdueix un nombre: (0 per sortir): "))
    if n == 0:
        break
    print("Es primer") if esPrimer(int(n)) else print("No es primer")

