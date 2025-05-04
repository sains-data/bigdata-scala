case class Price(currencyName: String, priceValue: Double)
// Price adalah case class yang menyimpan informasi harga: nama mata uang dan nilai harga.
// Case class otomatis menyediakan konstruktor, toString, equals, dan metode pembantu lain.
class Book {
  var name: String = ""
  var price: Price = null
  var quantity = 0
  var totalPrice = 0.0

  def computeTotalPrice(): Unit = {
    totalPrice = price.priceValue * quantity
  }
}
// Book adalah kelas mutable dengan atribut: nama buku, harga (Price), jumlah, dan total harga.
// Metode computeTotalPrice menghitung total harga berdasarkan jumlah buku dan harga per unit.
object BookApp {
  def main(args: Array[String]): Unit = {
    val priceOfBook = Price("USD", 25.5)
    val bookObj = new Book
    bookObj.name = "Programming with Scala"
    bookObj.price = priceOfBook
    bookObj.quantity = 4
    bookObj.computeTotalPrice()
    println(bookObj.price.currencyName + " " + bookObj.totalPrice)
  }
}
// BookApp membuat objek Price dan Book, mengisi data buku, lalu menghitung dan mencetak total harga.
// Output: USD 102.0


