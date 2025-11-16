numero = 1
positius = 0
negatius = 0
iguals = 0
while numero != 0:
    numero = int(input())
    if numero == 0:
        break
    if numero > 0:
        positius += 1
    else: negatius += 1

if positius == negatius:
    print("IGUALS")
elif positius > negatius:
    print("POSITIUS")
else:
    print("NEGATIUS")