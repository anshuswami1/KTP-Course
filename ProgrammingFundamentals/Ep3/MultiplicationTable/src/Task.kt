import com.faangx.ktp.basics.MultiplicationTableMiniApp
import kotlin.text.Typography.times

fun printTable(num: Int) {
    repeat(10 ){
        println("$num x ${it + 1} = ${num * (it + 1)}")
    }
}

fun main() {
    MultiplicationTableMiniApp(::printTable)
}