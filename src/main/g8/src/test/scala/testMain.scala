import org.scalatest._
import org.scalacheck._

class TestMain extends FunSuite {
  test("one should equal one") {
    assert(1 === 1)
  }
}

class CheckMain extends Properties("Main") {
  property("ints are sane") = forAll {
    a: Int => b: Int => {
      a > b || a < b || a == b
    }
}
