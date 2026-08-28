package kiln.math

import scala.collection.mutable.ArrayBuffer
import scala.annotation.tailrec

case class Permutation(n: Int):
  require(n >= 0, "`n` should be a positive integer")

  private val cache = ArrayBuffer(1, 1)

  @tailrec
  private def extend(k: Int): Int =
    if k > n then cache(n)
    else
      cache.append(cache(k - 1) * k)
      extend(k + 1)

  def count: Int =
    val k = cache.length
    if n < k then cache(n) else extend(k)
