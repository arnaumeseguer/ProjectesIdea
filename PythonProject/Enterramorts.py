dades = input()
dadesSplit = dades.split(" ")

lapidesQuant = int(dadesSplit[0])
pesMax = int(dadesSplit[1])

prioritatMax = 0
lapides = {}

for i in range(lapidesQuant):

    dades = input().strip()
    pes, prioritat = dades.split(" ")
    pes = int(pes)
    prioritat = int(prioritat)
    lapides[i] = (pes, prioritat)

# for lapida in lapides:
#     print(lapides[lapida])

pes = 0
prioritat = 0

for lapida in sorted(reversed(lapides)):
    if pes + lapides[lapida][0] <= pesMax:
        pes += lapides[lapida][0]
        prioritat += lapides[lapida][1]

print(prioritat)




    # pes = int(dadesSplit[0])
    # prioritat = int(dadesSplit[1])
    #
    # if prioritat > prioritatMax:
    #     prioritatMax = prioritat





