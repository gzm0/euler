package euler

object P6 extends App {

  def sq(n: Int) = n*n

  val ns = 1 to 100

  val res = sq(ns.sum) - ns.map(sq).sum

  println(res)

}
