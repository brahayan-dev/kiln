package kiln.seq

import kiln.list.Lazyness

class LazynessSuite extends munit.FunSuite:

  test(
    "given a quantity, generateRandom returns a list of random integers with that quantity"
  ):
    val obtained = Lazyness.generateRandom(5)
    assertEquals(obtained.length, 5)
