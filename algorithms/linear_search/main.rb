# frozen_string_literal: true

def main(array, target)
  i = 0
  while i <= array.length
    return i if target == array[i]

    i += 1
  end
  nil
end

# It doesn't need an ordered array!
puts main([12, 22, 20, 10, 11], 11)
