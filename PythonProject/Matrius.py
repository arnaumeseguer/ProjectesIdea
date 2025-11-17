inp = input().split(" ")
files = int(inp[0])
columnes = int(inp[1])
matriu = [ ]


for i in range(files):
    for j in range(columnes):
        nombre = int(input())
        print(nombre, end=" ")

    print(" ")