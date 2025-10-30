import math

def maxFiles(n):
    return int((-1 + math.sqrt(1 + 8*n)) // 2)
casos = int(input())
for i in range(casos):
    print(maxFiles(int(input())))