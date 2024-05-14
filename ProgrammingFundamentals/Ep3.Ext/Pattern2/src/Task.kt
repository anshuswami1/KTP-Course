import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char = '*', char2: Char = '-') {
    repeat(lines) { i ->
        repeat(i + 1) { print(char1) }
        repeat(lines) { print(char2) }
        repeat(2 * (lines - i)) { print(char1) }
        repeat(lines) { print(char2) }
        repeat(i + 1) { print(char1) }

        println()
    }
}



fun main() {
    PatternMiniApp( "P2", ::printPattern)
}