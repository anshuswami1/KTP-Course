import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char: Char) {
    repeat(lines){
        repeat(lines - 1 - it ) {
             print(' ')
        }
        repeat(it + 1){
            print(char)
        }
        println()
    }

}

fun main() {
    PatternMiniApp("BR", ::printPattern)
}