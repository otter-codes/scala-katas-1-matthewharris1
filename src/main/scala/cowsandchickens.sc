def howMany(heads: Int, legs: Int) : Any = {
  val chickens = ((4 * heads) - legs) / 2
  val cows = (legs - (2 * heads)) / 2

  if (legs % 2 == 0) {
  if ((chickens >= 0) && (cows >= 0)) {
    (chickens, cows)
  } else {
      "No solution"
  }
  } else {
      "No solution"
  }
}
println(howMany(3, 11))



