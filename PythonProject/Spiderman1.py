filescol = input().split(" ")
files = filescol[0]
columnes = filescol[1]
matriu = ""

for i in range(int(files)-1):
    for j in range(int(columnes)-1):
        matriu += input()

print(matriu)