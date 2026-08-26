package kiln.math

import scala.collection.mutable.ArrayBuffer

case class Permutation(n: BigInt):
  require(n >= 0, "`n` should be a positive integer")

  private val cache = ArrayBuffer.empty[BigInt]

  private def extend(n: BigInt, acc: BigInt): BigInt =
    if n == 0 then acc else extend(n - 1, acc * n)

  def count: BigInt =
    if n == 0 then 1 else extend(n, 1)
