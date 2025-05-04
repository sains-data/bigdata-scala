// membuat object SolutionToProblem3
object SolutionToProblem3 {
    // membuat method main
    def main(arguments: Array[String]): Unit = {
    print("Please enter a string: ")
    // membaca input dari keyboard dan menyimpannya ke dalam variabel inputString
    // readLine() adalah method yang digunakan untuk membaca input dari keyboard bertipe string
    // readLine() mengembalikan nilai bertipe String
    // String adalah tipe data yang digunakan untuk menyimpan teks
    val inputString = scala.io.StdIn.readLine()
    // mencetak inputString ke layar
    // inputString adalah variabel yang berisi string yang dibaca dari keyboard
    inputString.toString.foreach(println)
    }
}