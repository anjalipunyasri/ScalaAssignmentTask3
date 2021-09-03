import org.scalatest.funsuite.AnyFunSuite

class Question5Test extends AnyFunSuite{

  test("Higher Order Function Question5"){
    assert(Question5.conditional[String]("Extraordinary", _.size>5, _.reverse) === "yranidroartxE")

  }

}
