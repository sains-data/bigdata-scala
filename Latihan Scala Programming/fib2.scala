object FibonacciWithWhile {
  def main(args: Array[String]): Unit = {
    generateFibonacciSeries
  }

  def generateFibonacciSeries: Unit = {
    var f0 = 0 // Bilangan pertama
    var f1 = 1 // Bilangan kedua
    var fn = 0 // Bilangan berikutnya
    print(fn + ", ") // Cetak angka pertama (0)

    while (fn < 34) { // Loop sampai fn kurang dari 34 (supaya tidak melebihi 40)
      fn = f0 + f1 // Hitung fn
      print(fn + ", ") // Cetak bilangan Fibonacci
      f0 = f1 // Geser nilai-nilai ke depan
      f1 = fn
    }
  }
}
