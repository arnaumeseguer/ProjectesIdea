nombre = input()
apocalipsi = 0

for i in range(len(nombre)):
    if nombre[i] == "6":
        apocalipsi += 1
    else:
        apocalipsi = 0

    if apocalipsi == 3:
        print(f"{nombre} és un nombre del apocalipsi")
        break
if apocalipsi < 3:
    print(f"{nombre} NO és un nombre del apocalipsi")