package kiln.seq

class QuickSuite extends munit.FunSuite:

  test("sort returns a sorted sequence"):
    val obtained = Quick.sort(Seq(2, 1, 5, 4, 3))
    val expected = Seq(1, 2, 3, 4, 5)
    assertEquals(obtained, expected)
