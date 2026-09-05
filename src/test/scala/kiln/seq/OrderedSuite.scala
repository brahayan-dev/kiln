package kiln.seq

class OrderedSuite extends munit.FunSuite:

  test("insert returns a sorted sequence with a new element"):
    val obtained = Ordered.insert(Seq(1, 2, 4, 5), 3)
    val expected = Seq(1, 2, 3, 4, 5)
    assertEquals(obtained, expected)

  test(
    "given a sequence and an element, linearSearch returns the element index"
  ):
    val obtained = Ordered.linearSearch(Seq(1, 2, 3, 4, 5), 3)
    assertEquals(obtained, Some(2))

  test(
    "given a sequence and an element, binarySearch returns the element index"
  ):
    val obtained = Ordered.binarySearch(Seq(1, 2, 3, 4, 5), 3)
    assertEquals(obtained, 2)
