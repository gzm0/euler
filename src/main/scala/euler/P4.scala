package euler 

object P4 extends App {

  def sPalin(s: String) = s.reverse == s
  def iPalin(n: Int) = sPalin(n.toString)    

  val pals = for {
    x <- 100 to 999
    y <- 100 to 999
    p = x * y if iPalin(p)
  } yield p

  println(pals.max)

}
