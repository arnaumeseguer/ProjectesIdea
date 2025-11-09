import math
def pastissos(n, m):
    print(int(math.factorial(m+n-1)/(math.factorial(n)*math.factorial(m-1))))

for i in range(0, int(input())):
    pastissos(int(input()), int(input()))
