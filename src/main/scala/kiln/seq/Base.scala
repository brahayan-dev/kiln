package kiln.seq

object Base:
  def isMember[T](item: T, items: Seq[T]): Boolean =
    items.contains(item)

  def hasDuplicates[T](items: Seq[T]): Boolean =
    items.distinct.lengthCompare(items.length) < 0

  def sort(items: Seq[Int]): Seq[Int] =
    items.sorted

  def search(items: Seq[Int], item: Int): Int =
    items.indexWhere(_ == item)
