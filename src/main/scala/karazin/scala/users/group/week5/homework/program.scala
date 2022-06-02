package karazin.scala.users.group.week5.homework

import givens.JsonEncoder


object program{
  def encode[T](element: T)(using encoder: JsonEncoder[T]): String =
    encoder.encode(element)
}
