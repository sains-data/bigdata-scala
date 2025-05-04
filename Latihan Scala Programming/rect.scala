// Rectangle adalah sebuah kelas biasa dengan tiga atribut: length, breadth, dan area, semuanya bertipe Int.
class Rectangle {
  var length = 0
  var breadth = 0
  var area = 0
    // Fungsi computeArea() menghitung area dengan mengalikan length * breadth.
  def computeArea(): Unit = {
    area = length * breadth
  }
}
// RectApplication adalah object singleton yang berisi metode main untuk menjalankan program.
object RectApplication {
  def main(args: Array[String]): Unit = {
    // Objek rectObj dibuat dari kelas Rectangle, panjang dan lebar diberikan, lalu computeArea() dipanggil.
    val rectObj = new Rectangle
    rectObj.length = 4
    rectObj.breadth = 5
    // Hasil luas dicetak ke konsol: 4 * 5 = 20.
    rectObj.computeArea()
    println(rectObj.area)
  }
}

