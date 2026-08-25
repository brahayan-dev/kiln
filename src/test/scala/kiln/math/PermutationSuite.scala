package kiln.math

class PermutationSuite extends munit.FunSuite:
  test("given n = 3, count answers the amount of permutations (6)"):
    val s = Permutation(3)
    val expected = 6
    assertEquals(s.count, expected)
