package com.ibm.developerworks

/**
 * User: vostapets
 * Date: 7/2/13
 * Time: 8:22 PM
 */
object Timer4 {
  def periodicCall(seconds: Int, callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread.sleep(seconds * 1000)
    }
  }

  def main(args: Array[String]): Unit = {
    periodicCall(1, () =>
      Console.println("Time flies... oh, you get the idea."))
  }
}
