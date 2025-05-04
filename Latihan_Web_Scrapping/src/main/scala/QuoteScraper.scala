import org.jsoup.Jsoup
import scala.jdk.CollectionConverters._

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