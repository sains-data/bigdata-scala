// memanggil library untuk input dan output
import scala.io.StdIn._
// membuat object SolutionToProblem2
// object SolutionToProblem2 adalah object yang berisi method main
object SolutionToProblem2 {
    // membuat method main
    // method main adalah method yang pertama kali dijalankan
    // method main menerima parameter arguments bertipe Array[String]
    // parameter arguments adalah array yang berisi argumen yang diberikan saat menjalankan program
    // method main mengembalikan nilai bertipe Unit
    // Unit adalah tipe data yang tidak mengembalikan nilai apapun
    def main(arguments: Array[String]): Unit = {
    
    print("Enter the first integer: ")
    // membaca input dari keyboard dan menyimpannya ke dalam variabel firstNumber
    // readInt() adalah method yang digunakan untuk membaca input dari keyboard bertipe integer
    // readInt() mengembalikan nilai bertipe Int
    // Int adalah tipe data yang digunakan untuk menyimpan bilangan bulat
    val firstNumber = readInt()
    // membaca input dari keyboard dan menyimpannya ke dalam variabel secondNumber
    print("Enter the second integer: ")
    val secondNumber = readInt()
    // menghitung selisih antara firstNumber dan secondNumber
    val difference = firstNumber - secondNumber
    // mencetak selisih antara firstNumber dan secondNumber
    println("The difference is "+difference)
    }
}