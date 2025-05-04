import scala.util.boundary
import scala.util.boundary.break
object FibonacciWithFor {
  def main(args: Array[String]): Unit = {
    generateFibonacciSeries
  }

  def generateFibonacciSeries: Unit = {
    var f0 = 0 // Bilangan pertama
    var f1 = 1 // Bilangan kedua
    var fn = 0 // Bilangan berikutnya
    print(f0 + ", ") // Cetak angka pertama (0)

    boundary {
      for (i <- 0 until 40) { // Loop hingga 40 iterasi (tapi dihentikan jika fn >= 40)
        fn = f0 + f1 // Hitung bilangan Fibonacci berikutnya
        if (fn >= 40)
          break() // Keluar dari loop jika fn >= 40
        print(fn + ", ") // Cetak bilangan Fibonacci
        f0 = f1 // Geser f0 dan f1 untuk iterasi berikutnya
        f1 = fn
      }
    }
  }
}
