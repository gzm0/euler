package euler

object P3 extends App with Primes {

  val n = 600851475143L
  
  val res = primes takeWhile { _ <= math.sqrt(n) } filter { n % _ == 0 } last
  
  println(res) 
  
}
