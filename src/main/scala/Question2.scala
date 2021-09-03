object Question2 extends App{


  // It prints the Maximum of 2 numbers
  def greater(a: Int, b: Int): Int =
    if (a > b) a else b
    println("Maximum of two numbers: "+greater(random,random))

  // It prints the minimum of 2 numbers
  def smaller(a: Int, b: Int): Int =
    if(a < b) a else b
    println("Minimum of two numbers: "+smaller(random,random))

  // Here it is taking random number by default
  def random = util.Random.nextInt

  // It prints the second number
  def second_number(a: Int, b: Int) = b
  val result = second_number(random,random)
  println("Second number is : "+result)



}
