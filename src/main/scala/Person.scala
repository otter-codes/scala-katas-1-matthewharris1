/**
  * Created by digital032676 on 05/02/18.
  */

class dog (val name: String, val age: Int) {

}

object run extends App {
  val dog1 = new dog("Terry", 12)
  val dog2 = new dog("Jefferey", 21)

  val t :(dog, dog) = (dog1, dog2)

 println(t._1.name)
  println(t._2.age)
}

