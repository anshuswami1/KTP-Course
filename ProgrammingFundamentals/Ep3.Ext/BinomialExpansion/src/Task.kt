import com.faangx.ktp.ext.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {
        repeat(n + 1) { i ->
            val coefficient = combinationsOf(n, i)
            val PowA = n - i
            val PowB = i

            if (coefficient > 1) print("$coefficient")

            if (PowA > 0) {
                print("a")
                if (PowA > 1) print("^$PowA")
            }
            if (PowB > 0) {
                print("b")
                if (PowB > 1) print("^$PowB")
            }
            if (i < n) print(" + ")
        }}
fun factorialOf(x: Int): Int {
        var fact = 1
        for (i in 1..x) {
            fact *= i
        }
        return fact
}
fun permutationsOf(n: Int, r: Int): Int {
        var permutation = 1
        for (i in (n - r + 1)..n) {
            permutation *= i
        }
        return permutation
    }
fun combinationsOf(n: Int, r: Int): Int {
    return permutationsOf(n, r) / factorialOf(r)
}

fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}