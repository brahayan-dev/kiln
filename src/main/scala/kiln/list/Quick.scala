package kiln.list

object Quick:
  def sort(items: Seq[Int]): Seq[Int] =
    if items.length < 1 then items
    else
      val pivot = items.head
      val tail = items.tail
      val smaller = tail.filter(pivot >= _)
      val larger = tail.filter(pivot < _)
      sort(smaller) ++ Seq(pivot) ++ sort(larger)
