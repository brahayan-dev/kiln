package kiln.math

import scala.collection.mutable.ArrayBuffer

case class Permutation(n: Int):
  require(n >= 0, "`n` should be a positive integer")

  private val cache = ArrayBuffer.empty[BigInt]

  def count: BigInt =
    n
