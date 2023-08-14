package package1
import scala.io.StdIn.readDouble

object Question01 {
  val cal_interest_rate: Double => Double = {
    case amount if amount <= 20000 => 0.02
    case amount if amount <= 200000 => 0.04
    case amount if amount <= 2000000 => 0.035
    case _ => 0.065
  }

  def interest_rate(deposit_amount : Double): Double = {
    val interest_rate = cal_interest_rate(deposit_amount)
    val interest = deposit_amount * interest_rate

    interest
  }

  def main(args: Array[String]): Unit = {
    print("Enter deposit amount: Rs.");
    var amount = readDouble();
    val calculated_interest = interest_rate(amount)
    printf("Amount of interest that the deposit money earns in a year: Rs.%.2f",calculated_interest);
  }

}
