cad = 'X-DSPAM-Confidence: 0.8475 Km'

pos = cad.find(':')
num_str = cad[pos+1:].strip().split()[0]
num = float(num_str)

print(f"{num}, {type(num)}")