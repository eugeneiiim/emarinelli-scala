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

  def threadLocal[T](body: => T) = new ThreadLocal[T] {
    override def initialValue = body
  }

  def writeToFile(filename : String, content : String) = {
    val out = new java.io.BufferedWriter(new java.io.FileWriter(filename))
    out.write(content)
    out.close
  }
}
