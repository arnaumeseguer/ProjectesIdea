top = 0
bot = 0
daño = 0
atakhan = "Negre"
while True:
    dades = input()

    dadesSplit = dades.split(" ")

    minut = int(dadesSplit[0])

    if minut >= 20:
        break

    linia = dadesSplit[1]
    if linia == "Top":
        top += 1
    if linia == "Bot":
        bot += 1

    if minut < 14:
        daño += int(dadesSplit[2])


if daño >= 10000:
    atakhan = "Vermell"
if bot > top:
    print(f"Tot el món a Top que ha sortit Atakhan {atakhan}.")
else:
    print(f"Tot el món a Top que ha sortit Atakhan {atakhan}.")


