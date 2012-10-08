#Училище - Технологично училище "Електронни системи" към ТУ-София 
#Клас - 11Б клас
#Номер - 3
#Име - Анна-Мария Верева Матейна
#Задача - Да се разработи програма, която да чете даден csv документ и да сумира стойности в дадена колона.

import csv

file = open( 'a.csv' , 'r' ,)
reader = csv.reader(file)
reader.next()
sum = 0
for row in reader:
	print row
	i = 0
	for iterator in row:
		i+=1
		if(i == 7):
			sum = sum + int(iterator)
	i = 0
	
print sum
print "Sum:"
file.close()
