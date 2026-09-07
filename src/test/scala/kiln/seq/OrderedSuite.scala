package kiln.seq

class OrderedSuite extends munit.FunSuite:

  test("insert returns a sorted sequence with a new element"):
    val obtained = Ordered.insert(Seq(1, 2, 4, 5), 3)
    val expected = Seq(1, 2, 3, 4, 5)
    assertEquals(obtained, expected)

  test(
    "given a sequence and a non existing element, linearSearch returns a None"
  ):
    val obtained = Ordered.linearSearch(Seq(1, 2, 3, 4, 5), 8)
    assertEquals(obtained, None)

  test(
    "given a sequence and an existing element, linearSearch returns the element index"
  ):
    val obtained = Ordered.linearSearch(Seq(1, 2, 3, 4, 5), 3)
    val index = Some(2)
    assertEquals(obtained, index)

