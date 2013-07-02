package com.ibm.developerworks

/**
 * User: vostapets
 * Date: 7/2/13
 * Time: 8:19 PM
 */
object Timer3 {

  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread.sleep(1000)
    }
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() =>
      Console.println("Time flies... oh, you get the idea."))
  }
}
