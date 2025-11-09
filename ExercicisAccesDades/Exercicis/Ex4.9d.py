cadena = input("Introdueix una cadena de caracters: ")
final = cadena.replace(" ", "").lower()
print("Es palindrom" if final == final[::-1] else "No es palindrom")
