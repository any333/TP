class AirPlane

@@seats = Array.new(6) {Array.new(27)}

def initialize
	i = 0; c = 0
	while (i < 6 and c < 27)
		@@seats[i][c] = 0
		i += 1
		if(i == 6)
			c += 1; i = 0
		end
	end
end

def printSeats
	i = 0; c = 0
	while (i < 6 and c < 27)
		print @@seats[i][c]
		i += 1                        
		if(i == 6)
			c += 1; i = 0
			printf "\n"
		end
		if(i == 3)
			print "  "
		end
	end
end

def add(value)
	bool = [true, false]
	free = false
	i = 0; c = 0; flag = 0
	while(free == false and i < 27)
		if(@@seats[c][i] == 0)
			if(c+value <= 6)
				t = 0
				while(t < value)
					if(@@seats[c+t][i] != 0)
						i += 1; c = 0
						break;
					else
						free = true
						if(c < 3)
							flag = 1
						end
					end
					t += 1
				end
			else
				i += 1; c = 0;
				if(i >= 27)
					break;
				end
			end
		else
			c += 1
			if(c == 6)
				i += 1; c = 0
			end
			if(i > 27)
				break;
			end
		end
	end
	if(flag == 1 and c+value > 3)
		c += (3 - c)
	end
	t = 0
	while(t < value)
		@@seats[c+t][i] = value;
		t += 1
	end
end

def freeSeats
	i = 0; c = 0; counter = 0
	while(i < 27)
		while(c < 6)
			if(@@seats[c][i] == 0)
				counter += 1
			end
			c += 1
		end
		i += 1; c = 0
	end
	return counter
end

end


plane = AirPlane.new
printf "Free seats before : "
print plane.freeSeats
printf "\n"
	while(plane.freeSeats != 0)
		randNum = rand(3) + 1
		plane.add(randNum)
	end
plane.printSeats
printf "Free seats after : "
print plane.freeSeats
printf "\n"

