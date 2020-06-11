object A1_Q3 {

  import scala.io.StdIn.readInt

  def cal_cost(x: Int): Double = {
    var cover_cost: Double = (x * 24.95 - (x * 24.95 * 40) / 100)
    var  shipping_cost:Double= if(x<=50)x * 3 else((50 * 3) + (x - 50) * 0.75)

    return shipping_cost + cover_cost
  }

  def main(args: Array[String]): Unit = {
    println("Enter number f books")
    val No_books: Int = readInt()

    println("Total cost is " + cal_cost(No_books))

  }
}
