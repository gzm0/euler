package euler 

trait Factor extends Primes {
  
  def factors(n: Int) = {
    
    def factors0(n: Int, p: Stream[Int]): List[(Int,Int)] = 
      if (n == 1) Nil
      else {
        val (c,rem) = asFact(n, p.head)
        if (c > 0)
          (p.head, c) :: factors0(rem, p.tail)
        else
          factors0(n,p.tail)
      }

    factors0(n, primes)

  }

  def asFact(n: Int, p: Int): (Int,Int) = 
    if (n % p == 0) {
      val (c, rem) = asFact(n / p, p)
      (c+1, rem)
    } else (0,n)

}
