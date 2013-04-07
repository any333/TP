class Array

	def to_hash
		Hash[*self.flatten]
	end
	
	def index_by
		Hash[self.map {|x| [yield(x), x]}]
	end
	
	def subarray_count(subarray)
		count = 0
		self.each_cons(subarray.length) {|x| (x == subarray)? (count = count + 1) : ()}
		count
	end
	
	def occurences_count
		Hash.new(0).tap do |res| each { |item| res[item] += 1 }
                end
	end
	
	def densities
		map {|item| count item }
	end

end
