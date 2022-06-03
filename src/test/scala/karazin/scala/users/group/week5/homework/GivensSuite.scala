package karazin.scala.users.group.week5.homework

import scala.concurrent.Future

/*
  Write test for all programs in karazin.scala.users.group.week4.homework.givens

  Make sure that the following cases are tested:
    • json string representation for integers works
    • json string representation for booleans works
    • json string representation for strings works
    • json string representation for lists for integers, booleans and strings works
    • json string representation for maps fails on compile time

  Review:
    • https://www.json.org/json-en.html
    • https://scalameta.org/munit/docs/tests.html
    • https://scalameta.org/munit/docs/assertions.html
    • https://scalameta.org/munit/docs/assertions.html#compileerrors
    
  NB: Do not use sync, this homework does not belong async stuff
    
 */
class GivensSuite extends munit.FunSuite :

  test("string encoder test") {
    assert(program.encode("test1234😶") == "'test1234😶'")
  }
  test("null string encoder test") {
    assert(program.encode("") == "''")
  }

  test("null List encoder test") {
    assert(program.encode(List.empty[Int]) == "[]")
  }

  test("List encoder test") {
    assert(program.encode(List(1, 2, 3)) == "[1,2,3]")
  }

  test("2DList encoder test") {
    assert(program.encode(List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))) == "[[1,2,3],[4,5,6],[7,8,9]]")
  }

  test("Boolean encoder test") {
    assert(program.encode(true) == "true")
  }

  test("Int encoder test") {
    assert(program.encode(43) == "43")
  }

