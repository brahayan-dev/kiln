package kiln.list

class BaseSuite extends munit.FunSuite:

  test("isMember returns false when the item is not present"):
    val obtained = Base.isMember("alpha", Seq("beta", "gamma", "lambda"))
    val expected = false
    assertEquals(obtained, expected)

  test("isMember returns true when the item is present"):
    val obtained = Base.isMember(1, Seq(1, 2, 3))
    val expected = true
    assertEquals(obtained, expected)

  test("hasDuplicates returns false when items have not duplicates"):
    val obtained = Base.hasDuplicates(Seq("alpha", "beta", "lambda"))
    val expected = false
    assertEquals(obtained, expected)

  test("hasDuplicates returns true when items have duplicates"):
    val obtained = Base.hasDuplicates(Seq(1, 3, 2, 3))
    val expected = true
    assertEquals(obtained, expected)
