package snippets

/**
 * User: vostapets
 * Date: 6/24/13
 * Time: 5:36 PM
 */
object abstractTypes extends App {

  abstract class Buffer {
    type T;
    val element: T;
  }

  abstract class SeqBuffer {
    type T;
    val element: Seq[T];

    def length = element.length;
  }

  def newIntBuffer(el: Int) = new Buffer {
    type T = Int;
    val element = el;
  }

  def newIntBuffer(el: Int*) = new SeqBuffer {
    type T = Int;
    val element = el;
  }

  println(newIntBuffer(1).element);
  println(newIntBuffer(1, 2, 3).length)
}
