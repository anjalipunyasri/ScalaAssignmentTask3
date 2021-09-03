object Question1 extends App{

  def greater(a:Int, b:Int) : Int =
    if(a > b) a else b
  var x = 5; var y = 3

  //It prints the maximum value by comparing two values

  println("maximum value of first two numbers : " +greater(x,y))

  def choose(t: (Int, Int, Int),compare: (Int, Int) => Int): Int = {
    compare(t._1, compare(t._2, t._3))
  }
  var z = 7
  val result = choose((x,y,z), greater)

  //maximum value in the entire tuple

  println("maximum value in the entire tuple: "+result)

}
