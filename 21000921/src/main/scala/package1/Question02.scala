package package1

object Question02 {

  def main(args: Array[String]): Unit = {
      printf("Enter the Integer:")

      val input = scala.io.StdIn.readInt()

      val categorize_no: Int => String = {
        case x if x <= 0 => "Input is negative/zero"
        case x if (x % 2 == 0) => "Even number is given"
        case x => "Odd number is given"
      }
      val result = categorize_no(input)
      println(result)
    }
}
