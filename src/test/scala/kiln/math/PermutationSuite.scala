package kiln.math

class PermutationSuite extends munit.FunSuite:
  test("given n < 0, count raises an error"):
    intercept[IllegalArgumentException]:
      Permutation(-1)

  test("given n = 0, count returns 1"):
    val s = Permutation(0)
    val expected: BigInt = 1
    assertEquals(s.count, expected)

  test("given n = 3, count answers the amount of permutations (6)"):
    val s = Permutation(3)
    val expected: BigInt = 6
    assertEquals(s.count, expected)
