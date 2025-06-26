# frozen_string_literal: true

numbers = [10, 9, 2, 5, 3, 3, 7, 101, 18]

def longest_increasing_subsequence(items, cache = [])
  retun nill if items.empty?
  cache << items.first
end

puts longest_increasing_subsequence numbers
