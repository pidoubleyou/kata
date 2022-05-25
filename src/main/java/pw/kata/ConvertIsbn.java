package pw.kata;

// https://www.codewars.com/kata/61ce25e92ca4fb000f689fb0
public class ConvertIsbn {

    public static String isbnConverter(String isbn) {
        final String resultWithoutDigit = "978-" + isbn.substring(0, isbn.length() - 1);
        final Long number = Long.parseLong(resultWithoutDigit.replaceAll("-", ""));
        final long sum = checksum(number, 3);
        final long checkDigit = (10 - (sum % 10)) % 10;
        return resultWithoutDigit + checkDigit;
    }

    private static long checksum(long originalValue, long factor) {
        long digit = originalValue % 10 * factor;
        long next = originalValue / 10;
        if (next == 0) {
            return digit;
        }
        return digit + checksum(next, factor == 1 ? 3 : 1);
    }
}
