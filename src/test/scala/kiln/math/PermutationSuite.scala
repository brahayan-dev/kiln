package kiln.math

class PermutationSuite extends munit.FunSuite:
  test("given n < 0, count raises an error"):
    intercept[IllegalArgumentException]:
      Permutation.count(-1)

  test("given n, count answers the amount of permutations"):
    assertEquals(Permutation.count(0), 1)
    assertEquals(Permutation.count(1), 1)
    assertEquals(Permutation.count(2), 2)
    assertEquals(Permutation.count(3), 6)
    assertEquals(Permutation.count(4), 24)
    assertEquals(Permutation.count(5), 120)
    assertEquals(Permutation.count(6), 720)
