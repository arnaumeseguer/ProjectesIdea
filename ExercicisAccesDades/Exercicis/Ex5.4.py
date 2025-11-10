def producteEscalar(a, b):
    if a == '' or b == '':
        return 0
    n = min(len(a), len(b))
    total = 0.0
    for i in range(n):
        total += float(a[i]) * float(b[i])
    return total

print(producteEscalar([1,3,5,7], [2,4,6,8]))