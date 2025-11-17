casos = int(input())
for i in range(casos):
    parells = 0
    senars = 0
    nombre = int(input())
    for i in range(1, nombre + 1):
        if i % 2 == 0:
            parells += i
        else:
            senars += i
    print(f"PARELLS: {parells} SENARS: {senars}")