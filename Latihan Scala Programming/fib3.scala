object FibonacciCustom {
  def main(args: Array[String]): Unit = {
    print("Please enter an integer between 1 and 10: ")
    try {
      val inputNumber = scala.io.StdIn.readInt() // Baca input dari pengguna

      if (inputNumber < 0 || inputNumber > 10) {
        throw new RuntimeException("Number out of range!") // Validasi rentang input
      }

      generateCustomFibonacci(inputNumber) // Panggil fungsi jika input valid

    } catch {
      case e: NumberFormatException => println("Type mismatch!") // Error jika input bukan angka
      case e: RuntimeException => println(e.getMessage) // Error khusus jika input tidak sesuai rentang
      case e: Exception => println("Something went wrong") // Penanganan error umum
    }
  }

  def generateCustomFibonacci(num: Int): Unit = {
    var f0 = 0
    var f1 = 1
    var fn = f0 + f1

    for (i <- 0 to 10) {
      if (fn > num && fn < 30) {
        print(fn + ", ") // Cetak jika fn sesuai syarat
      }
      f0 = f1 // Update nilai-nilai Fibonacci
      f1 = fn
      fn = f0 + f1
    }
  }
}
