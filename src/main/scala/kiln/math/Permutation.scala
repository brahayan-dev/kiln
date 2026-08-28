package kiln.math

import scala.collection.mutable.ArrayBuffer

case class Permutation(n: BigInt):
  require(n >= 0, "`n` should be a positive integer")

  private val cache = ArrayBuffer(1, 1)

  private def extend(n: BigInt, acc: BigInt): BigInt =
    if n == 0 then
      acc
    else
      val newAcc = acc * n
      cache.append(newAcc)
      extend(n - 1, newAcc)

  def count: BigInt =
    if n == 0 then cache(n) else extend(n, 1)
