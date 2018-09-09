from time import time
import matplotlib.pyplot as plt
import numpy as np
lista1 = np.array([])
lista2 = np.array([])


x = 0
y = 1
tem = 0
contador = 0
n = input("Ingresa un numero: ")

while contador < int(n):
  
    contador = contador + 1
    temp = y
    y = y+x
    x= temp
    print(y)
    tiempo_final = time()
    lista1 = np.hstack((lista1,tiempo_final));
   
print(lista1)
plt.plot(lista1)
plt.title("Fibonacci")  
plt.xlabel("iteracion")   
plt.ylabel("tiempo")   

plt.show()
