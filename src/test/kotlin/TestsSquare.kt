import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

class TestsSquare {

    private var list: MutableList<Int> = mutableListOf()

    @Test
    fun testSquare() {
        list = mutableListOf(1, 4, 9, 16, 25)
        list.square()
        assertEquals(mutableListOf(1, 16, 81, 256, 625), list, "Incorrect squaring")
        list = mutableListOf(-1, -4, 0, -16, 100)
        list.square()
        assertEquals(mutableListOf(1, 16, 0, 256, 10000), list, "Incorrect squaring")
    }

    @Test
    fun testSquareEmptyList() {
        assertFailsWith<Exception>
        {
            list.square()
        }
    }
}