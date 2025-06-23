$tasks = []

$options = <<~TEXT
  ==========================================================
  TODO LIST
  ---------
  Pick one of the following options (enter the number):

  1. View tasks.
  2. Create a task.
  3. Remove a task.
  4. Exit CLI.
  ==========================================================
TEXT

def create_task
  puts 'Describe the task to create:'
  description = gets.chomp

  $tasks << description
end

def remove_task
  puts 'Select the task to remove:'
  index = gets.chomp.to_i

  $tasks.delete_at(index)

  # NOTE: Handle exception is not needed!
  # begin
  #   $tasks.delete_at(index)
  # rescue StandardError => e
  #   puts "#{e.class} - #{e.message}"
  # end
end

def view_tasks
  puts 'Tasks:'
  $tasks.each_with_index { |task, i| puts "#{i}. #{task}" }
end

def select_flow(option)
  case option
  when 1
    view_tasks
  when 2
    create_task
  when 3
    remove_task
  when 4
    puts 'Exiting.'
    exit
  else
    puts 'Invalid option.'
  end
end

def main
  loop do
    print $options
    option = gets.chomp.to_i

    print '--------- '
    select_flow option
  end
end

main
