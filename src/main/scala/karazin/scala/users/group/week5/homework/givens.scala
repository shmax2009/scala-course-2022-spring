package karazin.scala.users.group.week5.homework

import scala.annotation.tailrec

object givens:

  /* 
    The trait is used for converting instances to a json string representation
    Provide a type parameter(s) for the trait and the method 
    and argument(s) and a result type
  */


  trait JsonEncoder[T]:
    def encode(element: T): String

  given StringEncoder: JsonEncoder[String] with
    def encode(element: String): String =
      "'" + element + "'"


  given IntEncoder: JsonEncoder[Int] with
    def encode(element: Int): String =
      element.toString


  given BooleanEncoder: JsonEncoder[Boolean] with
    def encode(element: Boolean): String =
      if element then "true"
      else "false"

  given ListEncoder[T] (using encoder: JsonEncoder[T]): JsonEncoder[List[T]] with
    def encode(element_List: List[T]): String =
      val res = element_List.map(element => encoder.encode(element)).mkString(",")
      s"[$res]"


/*
  Make sure that integers, booleans, strings and lists
  are convertable to a json string representation
*/