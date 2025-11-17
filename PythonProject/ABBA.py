accent = "àèéíòóúAÈÉÍÒÓÚ"
noaccent = "aeeioouAEEIOOU"
casos = int(input())
index = 0
for i in range(casos):
    index = 0
    grup = input()
    pos = grup.rfind(" i ")
    if pos == -1:
        arr = grup.split(", ")
    else:
        left = grup[:pos]
        last = grup[pos + 3:]
        if left.strip() == "":
            arr = [last.strip()]
        else:
            arr = left.split(", ")
            arr.append(last.strip())
    for nom in arr:
        if nom[0] in accent:
            print(noaccent[accent.index(nom[0])], end="")
        else:
            print(nom[0], end="")



