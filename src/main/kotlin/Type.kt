import java.text.DecimalFormat
import java.time.LocalDate
import kotlin.math.roundToInt

fun whichType (x: Any?) : String {
    val df = DecimalFormat("###.##")
    var answerType : String = ""
    when(x) {
        is String -> answerType = "Я получил String = $x, ее длина равна ${x.length}"
        is Int -> answerType = "Я получил Int = $x, его квадрат равен ${x*x}"
        is Double -> answerType = "Я получил Double = $x, это число округляется до ${df.format((x * 100.0).roundToInt() / 100.0)}"
        is LocalDate -> answerType = "Я получил LocalDate $x, она ${if (x.isBefore(LocalDate.of(2006,12,24))) "меньше" else "не меньше"} даты основания Tinkoff"
        null -> answerType = "Объект равен null"
        else -> answerType = "Мне этот тип неизвестен"
    }
    return answerType
}