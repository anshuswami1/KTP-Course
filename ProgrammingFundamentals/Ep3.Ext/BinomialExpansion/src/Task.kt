import com.faangx.ktp.ext.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {
    repeat(n + 1){i ->
        val cofficient = combinationsOf(n , i)
    val powA = n - 1
        val powB = i
    if (cofficient > 1) print ("$cofficient")
    if(powA > 0) {
        print("a")
        if (powA > 1) print("^$powA")
    }
        if(powB > 0){
            print("b")
            if (powB > 1)print("^$powB")
        }
        if(i < n)print (" + ")
    }
}
fun factorialOf(x: Int): Int {
    for(i in 1 .. x) {
        if (x % i == 0){
            print ("$i, ")
        }

}
}

fun permutationsOf(n: Int, r: Int): Int {
    TODO()
}

fun combinationsOf(n: Int, r: Int): Int {
    TODO()
}

fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}