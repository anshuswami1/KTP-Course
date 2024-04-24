import com.faangx.ktp.basics.PerimeterAndAreaOfRectMiniApp

fun getPerimeterOfRectangle(l: Int, b: Int): Int {
    return (l + b) * 2
}

fun getAreaOfRectangle(l: Int, b: Int): Int {
    return l * b
}

fun main() {
    PerimeterAndAreaOfRectMiniApp(
        getPerimeterOfRectangle = ::getPerimeterOfRectangle,
        getAreaOfRectangle = ::getAreaOfRectangle
    )
}