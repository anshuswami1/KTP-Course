import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char = '*', char2: Char = '-') {
    repeat(lines) { i ->
        repeat(lines) { j ->
            if (j == lines -  i - 1) {
                print(char1)
            } else {
                print(char2)
            }
        }
        println()
    }


}
fun main() {
    PatternMiniApp("P2", ::printPattern)
}