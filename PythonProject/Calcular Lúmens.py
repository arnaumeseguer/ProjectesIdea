dades = input().split(",")
hab = dades[0]
m2 = int(dades[1])

habs = ["salo", "menjador", "dormitori", "cuina", "lavabo", "passadis"]

salo = [100, 250]
menjador = [350, 500]
dormitori = [50, 150]
cuina = [200, 300]
lavabo = [150, 200]
passadis = [100, 200]

while True:
    if hab not in habs and m2 <= 0:
        print("ERROR: Habitacio i mides no reconegudes")
        break
    if hab not in habs:
        print("ERROR: Habitacio no reconeguda")
        break
    if m2 <= 0:
        print("ERROR: Mida incorrecta")
        break
    if hab == "salo":
        print(f"La quantitat de lumens per el salo es de {salo[0]*m2} a {salo[1]*m2} lumens")
    if hab == "menjador":
        print(f"La quantitat de lumens per el menjador es de {menjador[0]*m2} a {menjador[1]*m2} lumens")
    if hab == "dormitori":
        print(f"La quantitat de lumens per el dormitori es de {dormitori[0]*m2} a {dormitori[1]*m2} lumens")
    if hab == "cuina":
        print(f"La quantitat de lumens per la cuina es de {cuina[0]*m2} a {cuina[1]*m2} lumens")
    if hab == "lavabo":
        print(f"La quantitat de lumens per el lavabo es de {lavabo[0]*m2} a {lavabo[1]*m2} lumens")
    if hab == "passadis":
        print(f"La quantitat de lumens per el passadis es de {passadis[0] * m2} a {passadis[1] * m2} lumens")
    break