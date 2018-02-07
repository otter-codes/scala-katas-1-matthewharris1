import scala.io.StdIn

val TheList = List(3,3,4,4,5,5) // input any list you like

val n = StdIn.readLine("which term do you want? \n").toInt

def nthterm = {
  val workingList = TheList.distinct.sorted
  println(workingList)
  workingList(workingList.size -n)}


println(nthterm)
