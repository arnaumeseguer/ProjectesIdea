prestatges = int(input())
capacitat = int(input())
llibres = int(input())
if prestatges * capacitat - llibres >= 0:
    print(0)
else:
    print((prestatges * capacitat - llibres) * -1)
