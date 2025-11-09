def Walis(m):
    result = 1
    for n in range(1,m+1):
        a = (2*n)/(2*n-1)
        b = (2*n)/(2*n+1)
        c = a * b

    result += 2 * c
    print(f"{result}")
Walis(10)
