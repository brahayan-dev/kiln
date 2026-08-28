package kiln.math

import scala.collection.mutable.ArrayBuffer
import scala.annotation.tailrec

object Permutation:
  private val cache = ArrayBuffer(1, 1)

  @tailrec
  private def extend(n: Int, k: Int): Int =
    if k > n then cache(n)
    else
      cache.append(cache(k - 1) * k)
      extend(n, k + 1)

  def count(n: Int): Int =
    require(n >= 0, "`n` should be a positive integer")

    val k = cache.length
    if n < k then cache(n) else extend(n, k)
