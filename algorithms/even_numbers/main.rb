# frozen_string_literal: true

def main(limit)
  (2..limit).step(2) do |value|
    puts value
  end
end

print 'Select an integer number:'
main(gets.chomp.to_i)
