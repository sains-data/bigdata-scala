case class RectangleCase(length: Int, breadth: Int)
// RectangleCase adalah case class dengan dua parameter immutable (val): length dan breadth.
// Case class otomatis menyediakan konstruktor, toString, equals, dan metode pembantu lain.
object RectangleWithCase {
  def main(args: Array[String]): Unit = {
    val rectObj = new RectangleCase(4, 5)
    val area = rectObj.length * rectObj.breadth
    println(area)
  }
}
// Program langsung membuat objek RectangleCase dengan panjang 4 dan lebar 5.
// Luas dihitung dan dicetak tanpa perlu memanggil fungsi terpisah.
// Lebih ringkas, idiomatik Scala.