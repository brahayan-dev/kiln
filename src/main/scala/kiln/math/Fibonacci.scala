package kiln.math

import scala.collection.mutable.ArrayBuffer
import scala.annotation.tailrec

object Fibonacci:
  val cache = ArrayBuffer(1, 1)

  @tailrec
  private def extend(n: Int, k: Int): Int =
    if n < k then cache(n)
    else
      val a = cache(k - 1)
      val b = cache(k)
      cache.append(a + b)
      extend(n, k + 1)

  def count(n: Int) =
    val k = cache.length
    if n < k then cache(k) else extend(n, k)
