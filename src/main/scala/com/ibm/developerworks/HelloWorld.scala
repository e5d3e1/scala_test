package com.ibm.developerworks

/**
 * User: vostapets
 * Date: 6/23/13
 * Time: 10:00 AM
 */
object HelloWorld {

//  def main(args: Array[String]): Unit = {
//    println("Hello, Scala!");
//  }

  def main(args: Array[String]): Unit = {
    args.filter( (arg:String) => arg.startsWith("G") )
      .foreach( (arg:String) => Console.println("Найдено " + arg) )
  }
}

//class HelloWorld extends App{
//  override def main(args: Array[String]): Unit = {
//    println("Hello, Scala class!");
//  }
//}
