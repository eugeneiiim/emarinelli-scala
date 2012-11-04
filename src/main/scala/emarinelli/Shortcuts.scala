package emarinelli

object Shortcuts {
  implicit class RichIterable[T](itr: Iterable[T]) {
    def p = for ((x,i) <- itr.zipWithIndex) println("%s: %s" format (i, x))
  }
}
