package euler

object P5 extends App with Factor {

  val facts = (1 to 20) flatMap { factors _ }

  val mfs = facts groupBy { _._1 } mapValues { _.maxBy(_._2)._2 }

  val res = mfs.map { case (f,c) => math.pow(f,c) toInt }.fold(1){ _ * _ }

  println(res)

}
