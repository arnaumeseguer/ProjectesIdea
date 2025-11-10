from tempfile import NamedTemporaryFile


# Create a temporary file and write some data to it


while True:
   fp = NamedTemporaryFile('w+t')
   tfName = fp.name
   fp.write('Hello universe!')
   print(tfName)