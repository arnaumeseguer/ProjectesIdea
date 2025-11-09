def comptador(c, n):
    t = 0
    for i in range(len(c)):
        if c[i] == n:
            t += 1

    return t
print(comptador(input(), input()))
