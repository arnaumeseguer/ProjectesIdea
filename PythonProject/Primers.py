import math

def esPrimer(n):
    if n <= 1:
        return "NO"
    if n <= 3:
        return "SI"
    if n % 2 == 0:
        return "NO"

    limit = int(math.sqrt(n))
    for i in range(3, limit + 1, 2):  # només imparells
        if n % i == 0:
            return "NO"
    return "SI"

while True:
    n = int(input())
    if n == -1:
        break
    print(esPrimer(n))