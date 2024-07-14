import scala.io.StdIn

object problem1 {

    def getProductList(): List[String] ={
        var emptylist = List[String]()
        println("Enthe the Product Name: ")
        var name = StdIn.readLine()
        while (name != "Done" && name != "done" ){
            emptylist= emptylist :+name
            println("Enthe the Product Name: ")
            name = StdIn.readLine()
    }
        emptylist
    }

    def printProductList(newlist: List[String]): Unit ={
        println("List of Products")
        for (i <- newlist.indices){
            println(s"${i+1}: ${newlist(i)}")
        }
    }

    def  getTotalProducts(newlist: List[String]): Int = newlist.length

    def main(args: Array[String]): Unit ={
        val x = getProductList();
        printProductList(x)
        val numberOfProducts = getTotalProducts(x)
        print(s" Number of products: $numberOfProducts")
    }
}