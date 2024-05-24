import com.faangx.ktp.util.captureStdOutput
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Test {
    @ParameterizedTest
    @MethodSource("TestCases")
    fun Test(inputAndResult: Pair<Int, String>) {
        val (input, expected) = inputAndResult
        val actual = captureStdOutput { printBinomialExpansion(input) }
        assert(actual == expected) {
            "Wrong output for $input : ($actual). Instead, ($expected) was expected"
        }
    }

    companion object {
        @JvmStatic
        fun TestCases(): List<Pair<Int, String>> {
            return listOf(
                1 to "a + b",
                2 to "a^2 + 2ab + b^2",
                3 to "a^3 + 3a^2b + 3ab^2 + b^3",
                4 to "a^4 + 4a^3b + 6a^2b^2 + 4ab^3 + b^4",
                8 to "a^8 + 8a^7b + 28a^6b^2 + 56a^5b^3 + 70a^4b^4 + 56a^3b^5 + 28a^2b^6 + 8ab^7 + b^8",
                11 to "a^11 + 11a^10b + 55a^9b^2 + 165a^8b^3 + 330a^7b^4 + 462a^6b^5 + 462a^5b^6 + 330a^4b^7 + 165a^3b^8 + 55a^2b^9 + 11ab^10 + b^11",
                20 to "a^20 + 20a^19b + 190a^18b^2 + 1140a^17b^3 + 4845a^16b^4 + 15504a^15b^5 + 38760a^14b^6 + 77520a^13b^7 + 19447a^12b^8 + 2259a^11b^9 + 117a^10b^10 + a^9b^11 + a^8b^12 + a^7b^13 + a^6b^14 + a^5b^15 + a^4b^16 + a^3b^17 + a^2b^18 + ab^19 + b^20",
            )
        }
    }
}