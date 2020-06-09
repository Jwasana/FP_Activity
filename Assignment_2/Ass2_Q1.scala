object Ass2_Q1 {
  import scala.io.StdIn.readInt

  def salary_cal(x:Int, y:Int):Int= {
    if(x>=40&&y>=20){
      return (x*150+y*75)-(x*150+y*75)*10/100
    }else{
      return((x*150)+(y*75))
    }
  }
  def main(args: Array[String]): Unit = {


    println("Enter work hours:")
    val works_hours:Int=readInt()

    println("Enter OT hours")
    val OT_hours :Int=readInt()


    var salary : Int= salary_cal(works_hours,OT_hours)
    println("Take-home salary is "+ salary )



  }

}
