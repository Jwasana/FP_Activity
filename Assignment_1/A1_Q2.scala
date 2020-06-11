object A1_Q2 {
import scala.io.StdIn.readDouble
  def cal_volume(x:Double):Double= {

    return (4 / 3) * (22 / 7) * (x * x * x)
  }

  def main(args: Array[String]) {
     println("Enter the radius value:")
    var radius:Double = readDouble()

    var volume : Double = cal_volume(radius)
    println("volume is " +volume )

  }
}
