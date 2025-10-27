cadena = input("Introdueix cadena: ")
vocals = "aeiouAEIOU"
seguent = "eiouaEIOUA"

nova_cadena = ""

for lletra in cadena:
    if lletra in vocals:
        index = vocals.index(lletra)
        nova_cadena += seguent[index]
    else:
        nova_cadena += lletra

print(nova_cadena)