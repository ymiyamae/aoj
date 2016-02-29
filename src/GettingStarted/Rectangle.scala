import java.util.Scanner

object Rectangle extends App {
  val sc = new Scanner(System.in)
  val a  = sc.nextInt
  val b  = sc.nextInt
  println(a * b + " " + (a * 2 + b * 2))
}