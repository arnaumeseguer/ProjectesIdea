casos = int(input())
for i in range(casos):
    text = input()
    espais = text.count(" ")
    index = 0
    for i in range(len(text)):
        if text[i] == " ":
            print(" ", end="")
            continue
        print(text[i].upper(), end="") if index % 2 != 0 else print(text[i].lower(), end="")
        index += 1