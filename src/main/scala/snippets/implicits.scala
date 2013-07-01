package snippets

/**
 * User: vostapets
 * Date: 7/1/13
 * Time: 10:57 PM
 */
object implicits extends App {
  implicit def arrayWrapper[A: ClassManifest](x: Array[A]) =
    new {
      def sort(p: (A, A) => Boolean) = {
        util.Sorting.stableSort(x, p);
        x
      }
    }

  val x = Array(2, 3, 1, 4)
  println("x = " + x.sort((x: Int, y: Int) => x < y))


  val res = for (a <- x) yield a
  println("Arguments: " + res.toString)
  val res2 = for (a <- x.sort((x: Int, y: Int) => x < y)) yield a
  println("Arguments: " + res2.toString)
}
