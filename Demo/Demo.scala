package Demo

object Demo {
  def main(args: Array[String]): Unit = {
    /*var num = 0
    do{

      print("enter a number")
      num = scala.io.StdIn.readInt()
    }while (num != 5)*/


    /*  var num = sum(4,5)
    println(num)
}
def sum(x1:Int,x2:Int):Int={
      var s=x1+x2
  return s
  }*/


    /*  val tot = sub(5.3, 2)
    println(tot)
  }
  def sub(s1:Float,s2:Int):Float={
    s1+s2
  }*/


    /*val tot = sub(5.9, 2,6.8)
    println(tot)
  }

  def sub(s1: Float, s2: Int, s3: Float): Int = {
    var fnum = s1 + s2 + s3
    var inum = fnum.toInt
    return inum
  }*/



    show("Hello", "Ishara", "Samindi")
  }

  def show(name:String*) {
    for(x<-name){
      println(x)
    }
  }



}