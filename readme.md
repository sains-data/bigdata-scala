# Langkah-langkah instalasi Scala di Windows:

Persiapan:
- [Java JDK 21](https://adoptium.net/download)
- [Scala](https://www.scala-lang.org/download/)

## Instalasi Java JDK

Scala membutuhkan Java. Ikuti langkah berikut:

1. Buka [Java JDK 21](https://adoptium.net/download)
2. Pilih JDK 21
3. Unduh dan **install** file `.msi`
4. Setelah instalasi, buka **Command Prompt** ketik:
   ```bash
   java -version
   ```
5. Output yang diharapkan:
    ```
    openjdk version "21.0.7" 2025-04-15 LTS
    OpenJDK Runtime Environment Temurin-21.0.7+6 (build 21.0.7+6-LTS)
    OpenJDK 64-Bit Server VM Temurin-21.0.7+6 (build 21.0.7+6-LTS, mixed mode, sharing)
    ```

6. Buka setting `edit the system environment variables` dengan ketik di search windows anda lalu klik:
arahkan ke pada tombol environment variables > di bawah kotak Users variable for `nama user` cari tombol new > Lalu isi dengan:
`Variable Name: JAVA_HOME` dan `Variable Value: C:\Program Files\Eclipse Adoptium\jdk-21.0.7.6-hotspot` > lalu OK
klik OK semua sampai tertutup jendela nya

## Lakukan instalasi coursier SCALA

7. Buka terminal windows lalu ketik:
```bash
curl -fLo cs-x86_64-pc-win32.zip https://github.com/coursier/launchers/raw/master/cs-x86_64-pc-win32.zip
```
8. selanjutnya:
```bash
tar -xf cs-x86_64-pc-win32.zip
```
9. selanjutnya pindahkan:
```bash
move cs-x86_64-pc-win32.exe cs.exe
```
10. lakukan pemeriksaan:
```bash
.\cs setup
```

11. periksa kembali `cs setup` dengan mengetikkan di terminal:
```bash
cs setup
```
Output yang diharapka:
```bash
Checking if a JVM is installed
Found a JVM installed under C:\Program Files\Eclipse Adoptium\jdk-21.0.7.6-hotspot.

Checking if ~\AppData\Local\Coursier\data\bin is in PATH

Checking if the standard Scala applications are installed
  Found ammonite
  Found cs
  Found coursier
  Found scala
  Found scalac
  Found scala-cli
  Found sbt
  Found sbtn
  Found scalafmt
```

## Cek Versi Scala

12. Ketik di terminal dengan:
    ```bash
    scala -version
    ```
    output yang diharapkan adalah:
    ```bash
    Scala code runner version: 1.5.4
    Scala version (default): 3.6.4
    ```

## Tes Hello

13. Ketik `scala` di terminal untuk membuka scala REPL:
    ```bash
    scala
    ```
    Output yang diharapkan:
    ```bash
    Welcome to Scala 3.6.4 (21.0.7, Java OpenJDK 64-Bit Server VM).
    Type in expressions for evaluation. Or try :help.

    scala> 
    ```
14. Selanjutnya ketik:
    ```bash
    scala> println("Hello, Scala!")
    ```
    Output yang diharapkan:
    ```bash
    Hello, Scala!
    ```
    Lalu untuk keluar dari scala tekan `CTRL + C` di keyboard anda, lalu yes untuk terminate:
    ```
    ^CTerminate batch job (Y/N)?
    ```
    ketik y lalu enter. maka akan keluar dari REPL dan masuk ke root terminal.

## Instalasi Scala di VSCode

15. Buka VSCode, lalu cari tab Extension di sebelah kiri, klik dan ketik di pencarian dengan:
    `Scala (Metals)` lalu klik install, tunggu sampai instalasi selesai.

16. setelah berhasil, VSCode siap untuk proyek scala.

## Mulai Proyek Scala

17. Buat folder `newscala_(kelas)` contoh: `newscala_RA` di direktori C:/ atau arahkan root di terminal ke C:/ lalu ketik: `mkdir newscala_RA` lalu enter, arahkan root ke `cd newscala_RA` 

18. setelah output seperti ini:
    ```bash
    C:\newscala_RA>
    ```
    buka vscode langsung dengan mengetikkan:
    ```bash
    code .
    ```
    jika cara di atas tidak bisa dilakukan, maka buka vscode dengan manual dan open folder seperti biasa.

19. Mulai buat file dengan nama `new.scala` di vscode anda.

20. isi dengan kode berikut:
    ```scala
    object Hello extends App {
    println("Hello, Sains Data 2022!")
    }
    ```
    lalu simpan.

21. kembali ke terminal anda dan perhatikan bahwa root masih di `C:\newscala_RA>` lalu ketik:
    ```bash
    scala-cli run new.scala
    ```
    Output yang diharapkan:
    ```bash
    Compiling project (Scala 3.6.4, JVM (21))
    Compiled project (Scala 3.6.4, JVM (21))
    Hello, Sains Data 2022!
    ```
    atau bisa jadi hanya
    ```bash
    Hello, Sains Data 2022!
    ```

Selamat! Anda telah berhasil memasang dan menguji coba pertama kali scala programming di windows!
Sekarang selanjutnya lakukan kegiatan:
1. Latihan di folder Latihan Scala.
2. Berikutnya mengerjakan Latihan web scrapping.


