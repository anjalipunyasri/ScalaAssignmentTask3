object Question5 extends App{

  def conditional[A](x: A , p:A => Boolean , f :A => A): A = {
    if(p(x))f(x) else x
  }

  // It prints the reverse operation of a string
  println(conditional[String]("Extraordinary",_.size > 5, _.reverse))

}
