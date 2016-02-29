import java.util.Scanner
object Main extends App{
  val sc = new Scanner(System.in)
  val time  = sc.nextInt
  val h0  = time/3600
  val h1  = time%3600
  val m   = h1/60
  val d   = h1%60
  println(h0+":"+m+":"+d)
}
