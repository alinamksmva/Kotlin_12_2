import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDate

class TestsType {

    private var parameter : Any? = null
    private class Empty

    @Test
    fun testType()
    {
        assertEquals("Объект равен null", whichType(parameter), "Wrong answer")
        parameter = "Privet"
        assertEquals("Я получил String = Privet, ее длина равна 6", whichType(parameter), "Wrong answer")
        parameter = 145
        assertEquals("Я получил Int = 145, его квадрат равен 21025", whichType(parameter), "Wrong answer")
        parameter = -1
        assertEquals("Я получил Int = -1, его квадрат равен 1", whichType(parameter), "Wrong answer")
        parameter = 145.0
        assertEquals("Я получил Double = 145.0, это число округляется до 145", whichType(parameter), "Wrong answer")
        parameter = -145.2817812
        assertEquals("Я получил Double = -145.2817812, это число округляется до -145,28", whichType(parameter), "Wrong answer")
        parameter = 2.356
        assertEquals("Я получил Double = 2.356, это число округляется до 2,36", whichType(parameter), "Wrong answer")
        parameter = LocalDate.of(1990,1,1)
        assertEquals("Я получил LocalDate 1990-01-01, она меньше даты основания Tinkoff", whichType(parameter), "Wrong answer")
        parameter = LocalDate.of(2010,2,2)
        assertEquals("Я получил LocalDate 2010-02-02, она не меньше даты основания Tinkoff", whichType(parameter), "Wrong answer")
        parameter = LocalDate.of(2006,12,24)
        assertEquals("Я получил LocalDate 2006-12-24, она не меньше даты основания Tinkoff", whichType(parameter), "Wrong answer")
        parameter = Empty()
        assertEquals("Мне этот тип неизвестен", whichType(parameter), "Wrong answer")
    }
}