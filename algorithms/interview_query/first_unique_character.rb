# frozen_string_literal: true

word = 'concussion'

def create_schemas(characters)
  characters.map.with_index { |character, index| { index: index, character: character } }
end

def count_characters(schemas)
  schemas.group_by { |schema| schema[:character] }
end

def filter_by_lower_frequency(grouped_schemas)
  grouped_schemas.values.filter { |group| group.length == 1 }
end

def sort_by_index(filtered_schemas)
  filtered_schemas.flatten.sort_by { |schema| schema[:index] }
end

def get_index(sorted_schemas)
  sorted_schemas.first[:index]
end

def first_unique_character(word)
  word
    .chars
    .then { |characters| create_schemas(characters) }
    .then { |schemas| count_characters(schemas) }
    .then { |grouped_schemas| filter_by_lower_frequency(grouped_schemas) }
    .then { |filtered_schemas| sort_by_index(filtered_schemas) }
    .then { |sorted_schemas| get_index(sorted_schemas) }
end

puts first_unique_character(word)
