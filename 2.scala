import scala.io.StdIn
import scala.collection.mutable

object problem1 {

  def add_Book_Definition(books: mutable.Set[Array[String]]): mutable.Set[Array[String]] = {
    var continue = true
    while (continue) {
      var newarray = new Array[String](3)
      println("Enter the Book data: title, author, ISBN")
      for (i <- 0 until 3) {
        newarray(i) = StdIn.readLine()
      }

      if (newarray.contains("Done") || newarray.contains("done")) {
        continue = false
      } else {
        books += newarray
      }
    }
    books
  }

   def remove_Book_Definition(books: mutable.Set[Array[String]], ISBN: String): mutable.Set[Array[String]] = {
    val booksToRemove = books.filter(book => book.contains(ISBN))
    booksToRemove.foreach(book => books -= book)

    books
  }

  def search_Book_Definition(books: mutable.Set[Array[String]],ISBN: String): Unit = {
    val status = books.exists(array => array(2) == ISBN)
        println(s"The book status: $status")
    }


  def search_Book_title(books: mutable.Set[Array[String]],title: String): Unit = {
    val status = books.exists(array => array(0) == title)
        println(s"The book status: $status")
    }

  def printset(books: mutable.Set[Array[String]]): Unit = {
    println("List of Books:")
    for (book <- books) {
      println(s"Title: ${book(0)}, Author: ${book(1)}, ISBN: ${book(2)}")
    }
  }

  def main(args: Array[String]): Unit = {

    var books: mutable.Set[Array[String]] = mutable.Set(
   Array("Book1", "Author1", "ISBN1"),
   Array("Book2", "Author2", "ISBN2"),
   Array("Book3", "Author3", "ISBN3")
)
    printset(books)
    add_Book_Definition(books)
    search_Book_title(books,"Book1")
    search_Book_Definition(books,"ISBN1")
    remove_Book_Definition(books,"ISBN3")
    printset(books)    
  }
}
