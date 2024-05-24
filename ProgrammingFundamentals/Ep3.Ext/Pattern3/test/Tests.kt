import com.faangx.ktp.util.captureStdOutput
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Test {
    @ParameterizedTest
    @MethodSource("TestCases")
    fun Test(lines: Int) {
        val actual = captureStdOutput {
            printPattern(lines, '*', '-')
        }

        val expected = captureStdOutput {
            printPattern2(lines, '*', '-')
        }

        assert(actual == expected) {
            "Wrong pattern $actual for lines=$lines, expected $expected"
        }
    }

    fun printPattern2(lines: Int, char1: Char, char2: Char) {
        repeat(lines) { i ->
            repeat(2 * lines - 1) { j ->
                print(
                    if (j == lines - 1 - i || j == lines - 1 + i) char1 else char2
                )
            }
            println()
        }
    }

    companion object {
        @JvmStatic
        fun TestCases(): List<Int> = listOf(1, 3, 5, 7, 9, 15, 19)
    }
}