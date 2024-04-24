import com.faangx.ktp.basics.LeapYearCheckerMiniApp

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 )&& (year % 400 == 0 || year % 100 != 0)
}

fun LeapYearCheckerDemo() {
    LeapYearCheckerMiniApp(::isLeapYear)
}