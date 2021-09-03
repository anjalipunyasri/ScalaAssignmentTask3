import org.scalatest.funsuite.AnyFunSuite

class Question4Test extends AnyFunSuite{

  test("Higher order functions Question 4"){
    assert(Question4.fzero("Hello-World", name => println(name)) === "Hello-World")
  }

}


