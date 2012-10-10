package emarinelli

object Utils {
  def timed[T](
    msg: String,
    todo: => T,
    silent: Boolean = false
  ) = {
    val start = System.currentTimeMillis
    val x = todo
    val end = System.currentTimeMillis

    if (!silent) println(msg + " took " + (end - start) + " ms.")

    x
  }

  def checkInterrupted = if (java.lang.Thread.interrupted) throw new InterruptedException

  def todo[T]: T = throw new Exception("todo")

  def callable[T](fn: => T) = new java.util.concurrent.Callable[T] {
    override def call = fn
  }
}
