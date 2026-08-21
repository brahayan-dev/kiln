package kiln.list

object Base:
  def isMember[T](item: T, items: Seq[T]): Boolean =
    items.contains(item)

  def hasDuplicates[T](items: Seq[T]): Boolean =
    items.distinct.lengthCompare(items.length) < 0
