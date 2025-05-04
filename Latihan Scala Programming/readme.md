# Latihan Scala Programming

## Contoh

1. Problem 1: Tulis sebuah program untuk mencetak "Scala itu menyenangkan!" ke layar.
    Jawaban: file `fun.scala`

2. Problem 2: Tulis sebuah program untuk menghitung selisih antara dua bilangan bulat.
   **Pra-syarat:** Kedua bilangan bulat harus dibaca dari keyboard.
   **Pasca-syarat:** Selisihnya harus ditampilkan di layar.
   Jawaban: file `diff.scala`

3. Problem 3: Tulis sebuah program untuk mencetak setiap huruf dari sebuah string.
   **Pra-syarat:** String harus dibaca dari keyboard.
   **Pasca-syarat:** Setiap huruf harus dicetak pada baris yang terpisah.
   Jawaban: file `print.scala`

4. **Buat sebuah kelas bernama `Rectangle` dengan tiga atribut: `length` (panjang), `breadth` (lebar), dan `area` (luas).**
   Juga buat sebuah metode bernama `computeArea` di dalam kelas `Rectangle`.
   Selanjutnya, buat sebuah aplikasi bernama `RectApplication`, yang memberikan nilai panjang dan lebar, memanggil metode `computeArea`, dan mencetak hasil luas ke konsol.
   Jawaban: file `rect.scala`


5. **Selesaikan Soal #4 menggunakan `case class` dan `singleton object`.**
    Jawaban: file `case.scala`

6. **Buat sebuah kelas bernama `Book` yang memiliki tiga atribut: `name` (nama), `price` (harga), dan `quantity` (jumlah).**
   Atribut `price` bertipe `Price` yang memiliki dua atribut: `currencyName` (nama mata uang) dan `priceValue` (nilai harga).
   Selanjutnya, buat sebuah aplikasi yang dapat dijalankan untuk mencetak total harga dari sejumlah buku tertentu.
   Buat kelas dan metode lainnya yang diperlukan secara tepat.
   Jawaban: file `book.scala`

7. **Menggunakan ekspresi `for`, tulislah program untuk menghasilkan bilangan Fibonacci yang kurang dari 40. Sertakan juga angka 0.**
   *Petunjuk:* Bilangan Fibonacci dapat dihasilkan dengan rumus:
   **Fn = Fn-1 + Fn-2**
   Jawaban: file `fib1.scala`

8. **Gunakan perulangan `while` untuk menyelesaikan Soal #7.**
   Jawaban: file `fib2.scala`

9. **Baca sebuah bilangan bulat antara 1 hingga 10 (inklusif) dari input keyboard. Kemudian hasilkan bilangan Fibonacci yang lebih besar dari bilangan tersebut.**
   Bilangan Fibonacci yang dihasilkan harus kurang dari 30, dan program harus mencetak pesan yang sesuai jika terjadi pengecualian.
   Buat pengecualian (exception) yang sesuai jika input berada di luar rentang yang ditentukan.
   Jawaban: file `fib3.scala`

10. **Tulislah program untuk menghitung faktorial dari suatu bilangan non-negatif yang diberikan.**
    Jawaban: file `fact.scala`

## Latihan

1. **Latihan 1: Konversi Suhu**

**Deskripsi:**
Buat program yang membaca suhu dalam Celsius dari keyboard dan mengonversinya ke Fahrenheit menggunakan rumus:
`Fahrenheit = (Celsius × 9/5) + 32`

**Tujuan:**

* Pemrosesan input/output
* Perhitungan dasar

*Hints*
```scala
object KonversiSuhu {
  def main(args: Array[String]): Unit = {
    print("Masukkan suhu dalam Celsius: ")
    ...
```

2. **Latihan 2: Palindrom String**

**Deskripsi:**
Buat program untuk membaca sebuah string dari keyboard, lalu cek apakah string tersebut merupakan palindrom (dibaca sama dari depan dan belakang).
Contoh: `"madam"` adalah palindrom, `"scala"` bukan.

**Tujuan:**

* Manipulasi string
* Struktur kontrol `if-else`

*Hints*
```scala
object PalindromChecker {
  def main(args: Array[String]): Unit = {
    print("Masukkan string: ")
    val input = scala.io.StdIn.readLine()
    val isPalindrome = input == input.reverse
    ...
```

3. **Latihan 3: Class Mahasiswa**

**Deskripsi:**
Buat class `Mahasiswa` dengan field `nama`, `nim`, dan `nilai`. Tambahkan method `getGrade()` yang mengembalikan `"A"` jika nilai ≥ 80, `"B"` jika ≥ 70, `"C"` jika ≥ 60, dan `"D"` jika < 60.
Tampilkan output grade mahasiswa di layar.

**Tujuan:**

* Pemrograman berorientasi objek
* Struktur kondisi
* Class & Method

*Hints*
```scala
class Mahasiswa(val nama: String, val nim: String, val nilai: Int) {
  def getGrade(): String = {
    if (nilai >= 80) "A"
    else if (nilai >= 70) "B"
    else if (nilai >= 60) "C"
    else "D"
  }
}

object MahasiswaApp {
    ...
```

4. **Latihan 4: Array dan Rata-Rata**

**Deskripsi:**
Buat program untuk membaca **5 angka bulat** dari keyboard, simpan ke dalam array, dan hitung rata-ratanya.

**Tujuan:**

* Penggunaan array
* Iterasi dengan `for`
* Operasi numerik

*Hints*
```scala
object RataRataArray {
  def main(args: Array[String]): Unit = {
    val angka = new Array 
    for (i <- 0 until 5) {
      print(s"Masukkan angka ke-${i + 1}: ")
      angka(i) = scala.io.StdIn.readInt()
    }
    ...
```

5. **Latihan 5: Faktorial Rekursif**

**Deskripsi:**
Tulis fungsi rekursif untuk menghitung faktorial dari suatu bilangan bulat non-negatif. Gunakan input dari keyboard dan tampilkan hasilnya.

**Contoh Output:**

```scala
Input: 5  
Output: 120
```

**Tujuan:**

* Fungsi rekursif
* Struktur kontrol
* Penanganan input

*Hints*
```scala
object FaktorialRekursif {
  def faktorial(n: Int): Long = {
    if (n == 0) 1
    else n * faktorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    print("Masukkan bilangan non-negatif: ")
    val input = scala.io.StdIn.readInt()
    if (input < 0)
    ...
```

## Nama File Latihan

Buat nama file latihan di atas adalah sebagai berikut:
1. `suhu.scala`
2. `palindrom.scala`
3. `mahasiswa.scala`
4. `array.scala`
5. `faktorial.scala`

Buat jawaban salinan dalam laporan anda.
