class US01

    def get_results(left, right, sum)
        if(left + right != sum)
            return [left, right, sum]
        end
        return []
    end

    def print_results(lst)
        puts "ERROR US01: #{lst[0]} and #{lst[1]} do not sum to #{lst[2]}"
    end

end