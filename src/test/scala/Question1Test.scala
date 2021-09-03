import org.scalatest.funsuite.AnyFunSuite

class Question1Test extends AnyFunSuite{

  test("Higher order function question 1"){
    assert(Question1.greater(6,7) === 7)
    assert(Question1.choose((8,9,10),Question1.greater) === 10)
  }

}
