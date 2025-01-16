object firstprg {
  def main(args: Array[String]): Unit = {
    val b: Double = 20.5
      println(b)

  }
}
object a {
  def main(args: Array[String]): Unit = {
    val a = 30
    print(a)
  }
}


object priya {
  def main(args: Array[String]): Unit = {
    var a = 20 ;
    a=30; a=40;
    a=50;
    a=60;
    a=70;
    a=80;
    print(a)
  }
}

object riya {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      for (j <- 1 to i) {
        print(i)
      }
      println(i)
    }
  }


}

object isevenandpositive {
  def main(args: Array[String]): Unit = {
    def isEvenAndPositive(number: Int): Boolean = {
      number > 0 && number % 2 == 0
    }

    // Sample Data
    val number = 14
    print(s"$number both even and positive? ${isEvenAndPositive(number)}")
  }
}







