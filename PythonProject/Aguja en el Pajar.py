subcadena = input().strip()
cadena = input().strip()

m = len(subcadena)
n = len(cadena)

if m > n:
    print(0)
else:
    def idx(c):
        return ord(c) - ord('a')

    cnt_sub = [0] * 26
    cnt_win = [0] * 26

    for c in subcadena:
        cnt_sub[idx(c)] += 1

    res = 0
    for i in range(n):

        cnt_win[idx(cadena[i])] += 1


        if i >= m:
            cnt_win[idx(cadena[i - m])] -= 1

        
        if i >= m - 1 and cnt_win == cnt_sub:
            res += 1

    print(res)
