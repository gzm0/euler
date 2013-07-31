package euler

trait Primes {
  val primes: Stream[Int] = 2 #:: {
    Stream.from(3) filter { x =>
      primes takeWhile { _ <= math.sqrt(x) } forall { x % _ != 0 } } 
  }
}
