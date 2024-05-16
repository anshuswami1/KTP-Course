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

    private fun printPattern2(
        lines: Int,
        char1: Char = '*',
        char2: Char = '-'
    ) {
        for (i in 1..lines) {
            // *
            repeat(i) { print(char1) }

            // -
            repeat(lines) { print(char2) }

            // *
            repeat(2 * (lines - i + 1)) { print(char1) }

            // -
            repeat(lines) { print(char2) }

            // *
            repeat(i) { print(char1) }

            println()
        }
    }

    companion object {
        @JvmStatic
        fun TestCases(): List<Int> = listOf(1, 3, 5, 7, 9, 15, 19)
    }
}