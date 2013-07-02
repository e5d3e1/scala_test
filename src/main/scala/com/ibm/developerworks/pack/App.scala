//package com.ibm.developerworks.pack

/**
 * User: vostapets
 * Date: 7/2/13
 * Time: 10:03 PM
 */
package com {

object TTT {

}
package ibm {
package developerworks {
package pack {

object App {
  def main(args: Array[String]): Unit = {
    System.out.println("Howdy, from packaged code!")
    args.foreach((i) => System.out.println("Got " + i))
  }
}

}

}

}

}
