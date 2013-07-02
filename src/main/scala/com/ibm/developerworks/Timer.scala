package com.ibm.developerworks

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 7/2/13
 * Time: 5:47 PM
 */
object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread.sleep(1000)
    }
  }

  def timeFlies() = {
    Console.println("Time flies when you're having fun(ctionally)...");
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }
}
