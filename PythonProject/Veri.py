from os.path import split

casos = int(input())

for i in range(casos):
    tot = input()
    div = tot.split(" ")
    vida = int(div[0])
    rammus = int(div[1])
    twitch = int(div[2])
    ronda = 0

    while vida > 0:
        ronda += 1
        vida -= rammus
        if vida <= 0:
            print(f"RAMMUS {ronda}")
            break
        vida -= twitch
        if vida <= 0:
            print(f"TWITCH {ronda}")
            break