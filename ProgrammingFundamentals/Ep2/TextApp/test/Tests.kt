import org.junit.jupiter.api.Test

class Test {
    @Test fun testSolution() {
        assert(getText() == "Namaste Kotlin") {
            "Required text is not returned by the function"
        }
    }
}