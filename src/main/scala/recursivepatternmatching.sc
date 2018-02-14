def find[A](list : List[A], fn : A => Boolean) : Option[A] = {

  list match {
    case head :: _ if fn(head) => Some(head)
    case Nil => None
    case _ :: tail => find(tail, fn)
  }
}
find[Int](List(1,2,3), _ == 1)
find[Int](List(1,2,3), _ == 4)
find[String](List("Adam", "Matthew", "Doug"), _ == "Matthew")
