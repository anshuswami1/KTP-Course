import com.faangx.ktp.basics.FactorCalculatorMiniApp

fun printFactorsOf(num: Int) {
    for(i in 1 .. num ) {
        if (num % i == 0) {
            println("$i, ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    for (i in 1..num) {
        if (num % i == 0) {
            return true
        } else {
            return false
        }
    }
    return true
}
fun main() {
    FactorCalculatorMiniApp(::printFactorsOf, ::isPrime)
}