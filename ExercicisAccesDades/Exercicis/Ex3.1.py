from pickle import STRING
nombre = input("Introdueix un nombre: ")

operacions = 0
total = 0
mitjana = 0.0


while nombre != "fi":
    try:
        total += int(nombre)
        operacions += 1
        nombre = input("Introdueix un nombre: ")
    except ValueError:
        print("Error: dada errònia")
        nombre = input("Introdueix un nombre: ")

mitjana = total / operacions
print(f"{total} {operacions} {mitjana}")