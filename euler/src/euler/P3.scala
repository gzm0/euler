package euler

object P3 extends App {

  val n = 600851475143L
  
  val primes: Stream[Int] = 2 #:: {
    Stream.from(3) filter { x => primes takeWhile { _ < math.sqrt(x) } forall { x % _ != 0 } } 
  }
  
  val res = primes takeWhile { _ < math.sqrt(n) } filter { n % _ == 0 } last
  
  println(res) 
  
}