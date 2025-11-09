from pickle import STRING

print("Introdueix una llista de nombres (de un en un): ")

nombreG = None
nombreP = None
try:
    while True:
        nombre = int(input())
        if nombreP is None or nombre < nombreP:
            nombreP = nombre
        if nombreG is None or nombre > nombreG:
            nombreG = nombre
        print(f"Nombre gran = {nombreG} \nNombre petit = {nombreP}")
        if nombre == "fi":
            print(f"Nombre gran = {nombreG} \nNombre petit = {nombreP}")
            break

except ValueError:
    print("Fi del programa")
