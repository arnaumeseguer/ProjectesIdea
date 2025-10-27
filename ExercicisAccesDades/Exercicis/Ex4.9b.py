def isVowel(n):
    if n in "aeiouAEIOU":
        return True

cadena = input("Introduir cadena: ")

for i in range(len(cadena)):
    if isVowel(cadena[i]):
        print(cadena[i], end="")

    else:
        continue
