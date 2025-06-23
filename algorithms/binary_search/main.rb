# frozen_string_literal: true

def main(array, target)
  lower_limit = 0
  upper_limit = array.length - 1

  while lower_limit <= upper_limit
    index = (lower_limit + upper_limit) / 2
    value = array[index]

    if target > value
      lower_limit = index + 1
    elsif target < value
      upper_limit = index - 1
    elsif target == value
      return index
    end
  end

  nil
end

# It needs an ordered array!
puts main([10, 11, 12, 20, 22], 11)
