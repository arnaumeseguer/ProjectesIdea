notes = 0
deus = 0
while True:
    nota = int(input())
    if nota == -1:
        break
    if 0 <= nota <= 10:
        notes += 1
    if nota == 10:
        deus += 1

print(f"TOTAL NOTES: {notes} NOTES10: {deus}")