word_1 = "concussion"
word_2 = "helloworld"

def to_string(characters)
  characters.map(&:to_s)
end

def to_schema(index, character)
  { index: index, character: character }
end

def create_schema(characters)
  characters.map.with_index { |char, index| to_schema(index, char) }
end

def count_characters(schemas)
  schemas.group_by { |schema| schema[:character] }
end

def filter_by_lower_frequency(grouped_schemas)
  grouped_schemas.values.filter { |group| group.length == 1 }
end

def sort_by_index(schemas)
  schemas.sort_by { |schema| schema[:index] }
end

def get_index(first_schema)
  first_schema[0][:index]
end

def first_unique_character(word)
  word
    .chars
    .then { |chars| to_string(chars) }
    .then { |str_chars| create_schema(str_chars) }
    .then { |schemas| count_characters(schemas) }
    .then { |grouped| filter_by_lower_frequency(grouped) }
    .then { |filtered| sort_by_index(filtered.flatten) }
    .then { |sorted| get_index([sorted.first]) }
end

puts first_unique_character(word_1) 