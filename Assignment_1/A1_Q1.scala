object A1_Q1 {
import scala.io.StdIn.readInt

  def convert_temperature(x:Int):Double={
    return(x*1.8000 +32.00)
  }

  def main(args: Array[String]): Unit = {
println("Enter centigrade temperature")
    var x :Int = readInt()

    var f_temp =convert_temperature(x)
    println("Fahrenheit temperature is " + f_temp)
  }

}
