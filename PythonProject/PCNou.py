import math

sencer = input()
temp = sencer.split(" ")
preu = float(temp[0])
sou = float(temp[1])

print(f"En Pere ha d'estalviar durant {math.ceil(preu/sou*30)} dies")
