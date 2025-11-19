mov = int(input())
estat = ""
cat = ""
est = 0
pro = 0
vis = 0

for i in range(mov):
    dades = input().split(" ")
    cat = dades[0]
    estat = dades[1]
    if estat == "IN":
        if cat == "PRO":
            pro += int(dades[2])
        elif cat == "EST":
            est += int(dades[2])
        elif cat == "VIS":
            vis += int(dades[2])
    if estat == "OUT":
        if cat == "PRO":
            pro -= int(dades[2])
        elif cat == "EST":
            est -= int(dades[2])
        elif cat == "VIS":
            vis -= int(dades[2])

sospitosos = 0
if pro == 0:
    sospitosos = est + vis
else:

    sobr_est = est - 5 * pro
    sobr_vis = vis - pro

    if sobr_est > 0:
        sospitosos += sobr_est
    if sobr_vis > 0:
        sospitosos += sobr_vis

if sospitosos == 0:
    print("OK")
else:
    print(f"ALARMA {sospitosos}")