object Question3 extends App{

  // a higher-order function that takes an integer and returns a function .
  // The returned function should take a single integer argument (say, "x") and
  // return the product of x and the integer passed to the higher-order function.
  def take(a: Int) = (x: Int) => (a*x)

  // It Prints the resultant output.
  val result = take(3)(10)
  println(result)




}

