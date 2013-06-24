package snippets

/**
 * User: vostapets
 * Date: 6/24/13
 * Time: 6:15 PM
 */
object Main /*extends App */ {
  def main(args: Array[String]) {
    val res = for (a <- args) yield a.toUpperCase
    println("Arguments: " + res.toString)
  }

}
