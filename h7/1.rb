#Училище - Технологично училище "Електронни системи" към ТУ-София{ www.elsys-bg.org }
#Клас - 11Б клас
#Номер - 3
#Име - Анна-Мария Верева Матейна

#Задача - Трябва да се открие:
# - Кой е най-свързаният номер в клас - всеки ученик получава листа от друг. Написва си номера на него. Човекът,който е получил лист най-много пъти е най-свързаният номер в клас
# - Кой е най-малко свързаният номер в клас - аналогично на горната, човекът написал най-малко пъти номера си е най-малко свързаният.
# - За всеки номер да се намери на кой номер е предал листа най-много пъти - ако на даден лист поредния номер е 4, а следващият е 7 то номер 4 е предал листа на номер 7. Номер 4 е предал листа и на много други номера. Да се намери кой е номерът на който номер 4 е предал листа най-много пъти. Аналогично да се намери и за останалите номера.
# - За всеки номер да се намери кой номер му е предал листа най-много пъти - ако на даден лист поредния номер е 4, а следващият е 7 то номер 4 е предал листа на номер 7. Номер 7 е получил листа и от много други номера. Да се намери кой е номерът, който най-много пъти е дал листа на номер 7. Аналогично да се намери за всеки един номер.
# - За точки c и d да се намерят стойностите на най-малко предадените и получените листове.

require 'csv'

def count_csv_numbers
	counter = Array.new(29)
	for i in 0...30 do
		counter[i] = 0
	end	
	all_csv_files = Dir.glob "*.csv" 
	all_csv_files.each do |filename|
	CSV.foreach(filename) do |row|
		index= row[0].to_i
  		counter[index-1]+=1
	end	
	end
	for i in 0...29 do
		if counter[i] == counter.max
			print "Max popular is #", i+1, " => ", counter[i], " times", "\n";
		end
		if counter[i] == counter.min
			print "Min popular is #", i+1, " => ", counter[i], " times", "\n";
		end		
	end 
end
count_csv_numbers
