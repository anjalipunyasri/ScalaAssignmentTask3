import org.scalatest.funsuite.AnyFunSuite

class Question3Test extends AnyFunSuite{

  test("Higher Order Function Question 3"){
    assert(Question3.take(2)(10) === 20)
  }

}

