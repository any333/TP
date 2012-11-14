# Училище - Технологично училище "Електронни системи" към ТУ-София
# Клас - 11Б клас
# Номер - 3
# Име - Анна-Мария Верева Матейна

# Задача - Да се създаде програма, с която да може да се пресмята в стил обратен полски запис.

args = gets.chomp.split(" ")
numbers = Hash.new;
c = 1;
result = 0;


for i in 0..(args.length-1)
	case args[i]
	when (/[0-9.]/)
		if numbers.length == 0
			result = args[i].to_f
			numbers[numbers.length] = args[i]
		else 
			numbers[numbers.length] = args[i] 
		end
	
	when "-" 
		result = result-numbers[c].to_f
		c = c+1
	when "+"
		result = result+numbers[c].to_f
		c = c+1
	end
end

print "The result is ", result.to_f, "\n";

