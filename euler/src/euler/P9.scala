package euler

object P9 extends App {
  
  def sq(n: Int) = n * n
  
  for {
    c <- 1 to 1000
    b <- 1 until c
    a = 1000 - b - c
    if a > 0 && a < b
    if sq(a) + sq(b) == sq(c)
  } println(a*b*c)
  
}