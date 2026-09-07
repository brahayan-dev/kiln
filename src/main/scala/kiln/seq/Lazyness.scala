package kiln.list

import scala.util.Random

object Lazyness:
  def generateRandom(qty: Int): Seq[Int] =
    val items = LazyList.continually(Random.nextInt(100))
    items.take(qty).toList
