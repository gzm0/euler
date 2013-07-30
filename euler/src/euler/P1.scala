package euler

object P1 extends App {

  val res = 1 until 1000 filter { x => (x % 3) * (x % 5) == 0 } sum
  
  println(res)
  
}