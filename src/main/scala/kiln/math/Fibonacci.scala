package kiln.math

import scala.collection.mutable.ArrayBuffer
import scala.annotation.tailrec

object Fibonacci:
  private val cache = ArrayBuffer(1, 1)

  @tailrec
  private def extend(n: Int, k: Int): Int =
    if n < k then cache(n)
    else
      val a = cache(k - 2)
      val b = cache(k - 1)
      cache.append(a + b)
      extend(n, k + 1)

  def count(n: Int) =
    require(n >= 0, "`n` should be a positive integer")
    extend(n, cache.length)
