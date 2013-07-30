package euler

object P2 extends App {

  val fib: Stream[Int] =
    1 #:: 1 #:: (fib zip fib.tail map { case (x,y) => x + y })

  val res = fib takeWhile { _ <= 4000000 } filter { _ % 2 == 0 } sum
  
  println(res)
  
}