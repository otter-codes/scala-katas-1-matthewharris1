def howMany(heads: Int, legs: Int) = {
  val chickens = ((4 * heads) - legs) / 2
  val cows = (legs - (2 * heads)) / 2

chickens match {
  case x if legs % 2 != 0 => "No solution Found"
  case x if (chickens >= 0) && (cows >= 0) => (chickens, cows)
  case _ => "No solution Found"
  }
}

howMany(1, 4)