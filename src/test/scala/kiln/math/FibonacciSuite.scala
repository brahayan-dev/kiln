package kiln.math

class FibonacciSuite extends munit.FunSuite:
  test("given n, count returns the correct fibonacci number"):
    assertEquals(Fibonacci.count(0), 1)
    assertEquals(Fibonacci.count(1), 1)
    assertEquals(Fibonacci.count(4), 5)
    assertEquals(Fibonacci.count(7), 21)
