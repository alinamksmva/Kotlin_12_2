import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.text.DecimalFormat
import kotlin.test.assertFailsWith

class TestsSum {

    private var list: List<Double?> = listOf()
    private val df = DecimalFormat("###.##")

    @Test
    fun testSum() {
        list = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
        assertEquals("22,09", df.format(sumAfterConversion(list)), "Incorrect sum")
        list = listOf(13.31, 3.98, -12.0, 2.99, 9.0)
        assertEquals("22,09", df.format(sumAfterConversion(list)), "Incorrect sum")
        list = listOf(-13.31, 3.98, -1.0, 2.99, -9.0)
        assertEquals("-0,72", df.format(sumAfterConversion(list)), "Incorrect sum")
        list = listOf(13.31, null, 3.98, null, 12.0, 2.99, 9.0, null)
        assertEquals("22,09", df.format(sumAfterConversion(list)), "Incorrect sum")
        list = listOf(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0)
        assertEquals("5", df.format(sumAfterConversion(list)), "Incorrect sum")
        list = listOf(1.0, 2.0, 3.0, 4.71, 5.0, 1.0, 2.0, 3.0, 4.71, 5.0, 1.0, 2.0, 3.0, 4.71, 5.0)
        assertEquals("87,55", df.format(sumAfterConversion(list)), "Incorrect sum")
    }

    @Test
    fun testSumInitiallyEmptyList() {
        assertFailsWith<Exception>
        {
            sumAfterConversion(list)
        }
    }

    @Test
    fun testSumEmptyListAfterFilterNotNull() {
        list = listOf(null, null, null)
        assertFailsWith<Exception>
        {
            sumAfterConversion(list)
        }
    }
    @Test
    fun testSumEmptyListAfterConversion() {
        list = listOf(10000.02, 9999.1, 240.456, 1111.11)
        assertFailsWith<Exception>
        {
            sumAfterConversion(list)
        }
    }

}