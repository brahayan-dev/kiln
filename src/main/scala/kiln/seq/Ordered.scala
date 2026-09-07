package kiln.seq

object Ordered:
  def linearSearch(items: Seq[Int], item: Int): Option[Int] =
    items.zipWithIndex
      .find(_.head == item)
      .map(_.last)

  def binarySearch(items: Seq[Int], item: Int): Int =
    100

  def insert(items: Seq[Int], item: Int): Seq[Int] =
    val smaller = items.filter(_ < item)
    val larger = items.filter(_ >= item)
    smaller ++ Seq(item) ++ larger
