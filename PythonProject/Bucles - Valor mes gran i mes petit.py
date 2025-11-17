nombre = int(input())
g = nombre
p = nombre
while True:
    nombre = int(input())
    if nombre == 0:
        break
    if nombre > g:
        g = nombre
    if nombre < p:
        p = nombre

print(g, p)