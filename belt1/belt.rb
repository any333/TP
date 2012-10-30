#Училище - Технологично училище "Електронни системи" към ТУ-София{ www.elsys-bg.org }
#Клас - 11Б клас
#Номер - 3
#Име - Анна-Мария Верева Матейна

#Задача - Да се открие сбора на първите 10

require 'csv'

sum = 0
i = 0
input_file = "feature_scenarios_times.csv"
output_file = "output_file.csv"
CSV.open(output_file, "w") do |csv|
	CSV.foreach(input_file) do |row|
		status = row[0]
		if i<10 
			status = status.to_f
			sum += status
			i +=1
		end	
	end
	csv << [sum]
end

