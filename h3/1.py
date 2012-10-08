#Училище - Технологично училище "Електронни системи" към ТУ-София 
#Клас - 11Б клас
#Номер - 3
#Име - Анна-Мария Верева Матейна
#Задача - Да се разработи програма, която да чете даден csv документ и да сумира стойности в дадена колона, като имаме съдържанието на друга колона.

import csv

file = open( 'a.csv' , 'r' ,)
reader = csv.reader(file)
reader.next()
sum = 0
for row in reader:
	sum = sum + int(row[4])
	if row in reader:
		if row[5] == languagePython:
			py = 0;
			languagePython = py + row[2]
		if row[5] == languageRuby:
			rb = 0;
			languageRuby = rb + row[2]

print sum
print "Sum:"
file.close()
