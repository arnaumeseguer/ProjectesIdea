accent = "àèéíòóúAÈÉÍÒÓÚ"
noaccent = "aeeioouAEEIOOU"
casos = int(input())
index = 0
for i in range(casos):
    index = 0
    grup = input()
    split1 = grup.split(", ")
    remain = split1[len(split1) - 1]
    split2 = remain.split(" i ")
    arr = []
    for i in range(len(split1)- 1):
        arr.append(split1[i])
    arr.append(split2[0])
    arr.append(split2[1])


    for nom in arr:
        if nom[0] in accent:
            print(noaccent[accent.index(nom[0])])
        else:
            print(nom[0])



