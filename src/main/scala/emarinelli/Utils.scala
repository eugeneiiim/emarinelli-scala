package emarinelli

object Utils {
  def timed[T](
    msg : String,
    todo : => T
  ) = {
    val start = System.currentTimeMillis
    val x = todo
    val end = System.currentTimeMillis

    println(msg + " took " + (end - start) + " ms.")

    x
  }
}
