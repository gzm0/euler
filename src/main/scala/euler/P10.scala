package euler

object P10 extends App with Primes {

  val res = primes takeWhile { _ <= 2000000 } sum

  println(res)

}
