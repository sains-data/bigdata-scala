object Factorial {
  def main(args: Array[String]): Unit = {
    print("Please enter a non-negative integer: ")

    try {
      val inputNumber = scala.io.StdIn.readInt() // Ambil input
      val factorial = calculateFactorial(inputNumber) // Hitung faktorial
      println("The factorial of " + inputNumber + " is " + factorial + ".")

    } catch {
      case e: NumberFormatException => println("Type mismatch!") // Jika bukan angka
      case e: RuntimeException => println(e.getMessage) // Jika angka negatif
      case e: Exception => println("Something went wrong!") // Error umum
    }
  }

  def calculateFactorial(num: Int): Long = {
    var product = 1

    if (num < 0) {
      throw new RuntimeException("Number is negative!") // Lempar error jika negatif
    }

    var i = num
    while (i >= 1) {
      product *= i // Kalikan angka-angka dari num ke 1
      i -= 1
    }

    product // Kembalikan hasil
  }
}
