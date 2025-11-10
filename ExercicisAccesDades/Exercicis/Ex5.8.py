def invertirLlista(llista):
    i, j = 0, len(llista) - 1
    while i < j:
        llista[i], llista[j] = llista[j], llista[i]
        i += 1
        j -= 1
    return llista
print(invertirLlista([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))