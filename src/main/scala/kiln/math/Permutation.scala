package kiln.math

import scala.collection.mutable.ArrayBuffer

case class Permutation(n: Int):
  require(n >= 0, "`n` should be a positive integer")

  private val cache = ArrayBuffer(1, 1)

  private def extend(n: Int, acc: Int): Int =
    if cache.length < n then
      val newAcc = acc * n
      cache.append(newAcc)
      extend(n - 1, newAcc)
    else
      cache(this.n)

  def count: Int =
    if n <= 1 then cache(n) else extend(n, 1)
