# **Lab: Web Scraping Kutipan Menginspirasi**

## 🔍 Tujuan:

Mahasiswa dapat:

1. Memahami cara melakukan HTTP request dan mem-parsing HTML menggunakan Jsoup di Scala.
2. Menarik data spesifik dari elemen HTML (judul, kutipan, dan penulis).

## **Instruksi Lab**

### 1. Buat file `QuoteScraper.scala`

```scala
import org.jsoup.Jsoup

object QuoteScraper {
  def main(args: Array[String]): Unit = {
    // Mengakses halaman web
    val url = "https://quotes.toscrape.com/"
    val document = Jsoup.connect(url).get()

    // Menyaring semua elemen kutipan
    val quotes = document.select(".quote")

    // Menampilkan setiap kutipan dan penulis
    for (quote <- quotes.asScala) {
      val text = quote.select(".text").text()
      val author = quote.select(".author").text()
      println(s"Kutipan: $text")
      println(s"Penulis: $author")
      println("---------------")
    }
  }
}
```

### 2. Buat `build.sbt`

```sbt
name := "QuoteScraper"

version := "0.1"

scalaVersion := "3.3.1"

libraryDependencies ++= Seq(
  "org.jsoup" % "jsoup" % "1.15.4"
)

// Untuk konversi collection Java ke Scala
scalacOptions += "-language:implicitConversions"
```

### 3. Tambahkan impor ini di atas:

```scala
import scala.jdk.CollectionConverters._
```


## **Output yang Diharapkan**

```text
Kutipan: “The world as we have created it is a process of our thinking. It cannot be changed without changing our thinking.”
Penulis: Albert Einstein
---------------
Kutipan: “It is our choices, Harry, that show what we truly are, far more than our abilities.”
Penulis: J.K. Rowling
---------------
```

## Pertanyaan Refleksi

1. Apa fungsi `.select(".quote")`?
2. Bagaimana cara menambahkan scraping ke halaman kedua?
3. Bagaimana jika kita ingin menyimpan hasil ke file?

> Lihat file Challange.scala

## 🚀 Challenge (Opsional)

Modifikasi program untuk:

* Menampilkan hanya kutipan yang mengandung kata tertentu (misalnya “truth”).
* Scraping lebih dari 1 halaman dengan URL berikutnya (`Next →`).

> Lihat file Challange.scala

# Menjalankan proyek di VSCode

Berikut cara menjalankan proyek Scala web scraper di **VSCode** menggunakan **sbt** dan **jsoup**

## Langkah 1: Persiapkan Proyek Scala dengan sbt

1. **Buat folder baru untuk proyek** (misalnya `Latihan_Web_Scrapper`).

2. Di dalam folder proyek tersebut, buat file `build.sbt` yang memuat seperti pada instruksi lab.

> File ini akan mengonfigurasi sbt untuk menggunakan **jsoup** (library web scraping) dan versi Scala yang sesuai.

3. **Buat Struktur Folder Proyek**:

   * Buat folder `src/main/scala`.
   * Di dalam `scala`, buat file misalnya `QuoteScraper.scala` untuk menulis kode scraping kamu.

## Langkah 2: Tulis Kode Scala Web Scraper

Di dalam file `QuoteScraper.scala`, tulis kode yang sesuai dengan instruksi lab untuk web scraping menggunakan jsoup.

## Langkah 3: Menjalankan Proyek Scala di VSCode

1. **Buka Terminal di VSCode**:

   * Di VSCode, buka terminal dengan menekan `Ctrl + ~` (atau pilih **Terminal > New Terminal**).
   Pastikan root berada di folder `Latihan_Web_Scrapping`. atau tampilannya seperti ini:
   ```bash
   C:/newscala_RA/Latihan_Web_Scrapping>
   ```

2. **Jalankan Proyek dengan sbt**:

   * Pada terminal, jalankan perintah berikut untuk mengunduh dependensi dan menjalankan aplikasi:

   ```bash
   sbt run
   ```

3. **Proyek akan dikompilasi dan dijalankan**, dan kamu akan melihat hasil output di terminal, yang seharusnya adalah kutipan dari halaman web yang kamu scrape.

## Langkah 4: Debugging dan Memperbaiki Kode di VSCode

* **Memperbaiki Kesalahan**: Jika ada kesalahan, VSCode akan menunjukkan garis tempat kesalahan terjadi. Kamu bisa memperbaikinya langsung di editor.
* **Menjalankan Ulang**: Setiap kali kamu mengubah kode, cukup jalankan kembali perintah `sbt run` di terminal untuk melihat perubahan.

## Penyelesaian Challange

Untuk membuat solusi pada pertanyaan refleksi dan challange, maka dapat membuat folder baru dengan skema nya sama seperti menjalankan contoh dari QuoteScrapper.scala dengan build.sbt nya.
sehingga outputnya adalah folder ketiga dengan nama `Challange`. 

## **Kesimpulan**:

Dengan mengikuti langkah-langkah di atas, kamu telah berhasil menjalankan proyek web scraper menggunakan **Scala** dan **jsoup** di **VSCode**. Proyek ini menggunakan **sbt** untuk mengelola dependensi, yang memudahkan penggunaan **jsoup** untuk melakukan web scraping.
