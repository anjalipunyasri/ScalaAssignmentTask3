object Question4 extends App{

  def fzero(x: String,f: String => Unit): String = {
    f(x); x
  }

  // It prints the "Hello-World" as a output.
  fzero("Hello-World",name => println("String is :" + name))

}
