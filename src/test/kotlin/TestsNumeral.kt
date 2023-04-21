import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

class TestsNumeral {
    @Test
    fun testPrintWithWords() {
        assertEquals("тысяча", printWithWords(1000),"Invalid number")
        assertEquals("три", printWithWords(3),"Invalid number")
        assertEquals("тринадцать", printWithWords(13),"Invalid number")
        assertEquals("двадцать четыре", printWithWords(24),"Invalid number")
        assertEquals("восемьдесят", printWithWords(80),"Invalid number")
        assertEquals("пятьсот", printWithWords(500),"Invalid number")
        assertEquals("сто пять", printWithWords(105),"Invalid number")
        assertEquals("пятьсот шестьдесят", printWithWords(560),"Invalid number")
        assertEquals("двести сорок один", printWithWords(241),"Invalid number")
    }

    @Test
    fun testPrintWithWordsOutOfRangeRight() {
        assertFailsWith<Exception>
        {
            printWithWords(1020)
        }
    }

    @Test
    fun testPrintWithWordsOutOfRangeLeft() {
        assertFailsWith<Exception>
        {
            printWithWords(0)
        }
    }
}