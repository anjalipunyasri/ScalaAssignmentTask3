import org.scalatest.funsuite.AnyFunSuite

class Question2Test extends AnyFunSuite{

  test("Higher order function Question 2"){
    assert(Question2.greater(8,9) === 9)
    assert(Question2.smaller(7,4) === 4)
    assert(Question2.second_number(1,2) === 2)
  }

}
