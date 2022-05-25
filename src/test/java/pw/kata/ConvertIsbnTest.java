package pw.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertIsbnTest {
    @Test
    @DisplayName("Fixed tests")
    void test() {
        assertEquals("978-1-85326-158-9", ConvertIsbn.isbnConverter("1-85326-158-0"));
        assertEquals("978-1-7982-0894-6", ConvertIsbn.isbnConverter("1-7982-0894-6"));
        assertEquals("978-963-14-2164-4", ConvertIsbn.isbnConverter("963-14-2164-3"));
        assertEquals("978-0-14-143951-8", ConvertIsbn.isbnConverter("0-14-143951-3"));
        assertEquals("978-0-02-346450-8", ConvertIsbn.isbnConverter("0-02-346450-X"));
    }
}