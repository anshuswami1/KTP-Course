import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    if (age <= 2){
        return "Infancy"
    }else if (age >= 3 && age <= 11){
        return "Childhood"
    }else if (age >= 12 && age <= 17){
        return "Teenage"
    }else if (age >= 18 && age <= 59){
        return "Adulthood"
    }
else{return "Old age"}
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}