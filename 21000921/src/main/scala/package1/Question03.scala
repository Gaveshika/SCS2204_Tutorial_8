package package1

object Question03 {

  def toUpper(text: String): String = text.toUpperCase()
  def toLower(text: String): String = text.toLowerCase()

  def formatNames(name: String)(indices: Int*)(formatFunc: String => String): String = {
    if (indices.nonEmpty) {
      val formattedChars = name.zipWithIndex.map { case (char, index) =>
        if (indices.contains(index)) formatFunc(char.toString) else char.toString
      }
      formattedChars.mkString
    } else {
      formatFunc(name)
    }
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(1)(toUpper))
    println(formatNames("Saman")(0)(toLower))
    println(formatNames("Kumara")(5)(toUpper))
  }
}

