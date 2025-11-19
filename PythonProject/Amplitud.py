casos = int(input())
for _ in range(casos):
    dades = input().split()
    medicions = int(dades[0])

    nums = []
    for dada in dades[1:]:
        nums.append(int(dada))

    nums.sort()

    mins = []
    maxs = []


    meitat = (len(nums) + 1) // 2

    for dad in nums[:meitat]:
        mins.append(dad)

    for dad in nums[meitat:]:
        maxs.append(dad)

    mins.reverse()


    for i in range(len(maxs)):
        print(mins[i], maxs[i], end=" ")


    if len(mins) > len(maxs):
        print(mins[-1], end=" ")

    print()
