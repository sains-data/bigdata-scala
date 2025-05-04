import org.jsoup.Jsoup
import scala.jdk.CollectionConverters._
import scala.util.Try

object QuoteScraper {
  def main(args: Array[String]): Unit = {
    val baseUrl = "https://quotes.toscrape.com/page/"
    val keyword = "truth"  // Kata yang dicari dalam kutipan
    var pageNumber = 1

    // Melakukan scraping sampai tidak ada halaman berikutnya
    var hasNextPage = true
    while (hasNextPage) {
      val url = s"$baseUrl$pageNumber"
      val document = Jsoup.connect(url).get()

      // Mengambil elemen kutipan pada halaman
      val quotes = document.select(".quote")

      // Menampilkan kutipan yang mengandung kata kunci
      for (quote <- quotes.asScala) {
        val text = quote.select(".text").text()
        val author = quote.select(".author").text()

        if (text.toLowerCase.contains(keyword.toLowerCase)) {
          println(s"Kutipan: $text")
          println(s"Penulis: $author")
          println("---------------")
        }
      }

      // Cek apakah ada halaman berikutnya
      val nextButton = document.select(".next a")
      hasNextPage = nextButton.nonEmpty
      pageNumber += 1
    }
  }
}
