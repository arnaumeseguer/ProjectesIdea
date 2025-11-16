casos = int(input())
for i in range (casos):
    text = input()
    text2 = input()

    text = text.replace(" ","")
    text2 = text2.replace(" ","")


    if sorted(text) == sorted(text2):
        print("SI")
    else: print("NO")