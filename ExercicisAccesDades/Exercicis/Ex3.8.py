import random

def moendaDau():
    cara = 0
    senar = 0
    for i in range (0, 100):
        valorM = random.randint(0, 1)
        ValorD = random.randint(0, 6)

        if valorM == 0:
            cara += 1
        if ValorD % 2 != 0:
            senar += 1
    print(f"Cara ha sortit {cara} vegades \nUn nombre senar ha sortit {senar} vegades")
moendaDau()



