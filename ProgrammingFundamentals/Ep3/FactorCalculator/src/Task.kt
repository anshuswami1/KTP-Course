import com.faangx.ktp.basics.FactorCalculatorMiniApp

fun printFactorsOf(num: Int) {
    for(i in 1 .. num) {
        if (num % i == 0){
    print ("$i, ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    var p = true
    if(num == 0 || num == 1){
         p = false
    }else {
        for (i in 2..num / 2){
            if (num % i == 0) {
                 p = false
            }
        }
    }
    return p == true
}

fun main() {
    FactorCalculatorMiniApp(::printFactorsOf, ::isPrime)
}