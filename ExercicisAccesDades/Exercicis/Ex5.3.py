def minMax():
    numeros = []
    while True:
        nombre = input("Introdueix un número: ")
        if nombre.strip().lower() == "fi":
            break

        numeros.append(float(nombre))


    print(f"Màxim: {max(numeros)}")
    print(f"Mínim: {min(numeros)}")

minMax()