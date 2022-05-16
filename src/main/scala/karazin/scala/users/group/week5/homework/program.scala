package karazin.scala.users.group.week5.homework

import givens.JsonEncoder


object program extends App {
  def encode[T](element: T)(using encoder: JsonEncoder[T]): String =
    encoder.encode(element)


  println(encode(List(List(1,2,3),List(4,5,6),List(7,8,9),List(10,11,12))))
}
