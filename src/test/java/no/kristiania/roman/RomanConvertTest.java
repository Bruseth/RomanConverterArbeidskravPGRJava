package no.kristiania.roman;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanConverterTest {
    @Test
    void shouldReturnIfor1() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldReturnIIfor2() {
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldReturnIIIfor3() {
        assertEquals("III", toRoman(3));
    }

    @Test
    void shouldReturnIVfor4() {
        assertEquals("IV", toRoman(4));
    }

    @Test
    void shouldReturnVfor5() {
        assertEquals("V", toRoman(5));
    }

    @Test
    void shouldReturnVIfor6to8() {
        assertEquals("VI", toRoman(6));
        assertEquals("VII", toRoman(7));
        assertEquals("VIII", toRoman(8));
    }

    @Test
    void shouldReturnVIfor9() {
        assertEquals("IX", toRoman(9));
    }

    @Test
    void shouldReturnNumberOver10() {
        assertEquals("X", toRoman(10));
        assertEquals("XVIII", toRoman(18));

    }

    private String toRoman(int number) {
        StringBuilder result = new StringBuilder();

        number = toRomanDigit(number, result, "X", 10);

        if (number == 9) {
            result.append("IX");
            number = 0;
        }

        if (number >= 5) {
            result.append("V");
            number -= 5;
        }
        if (number == 4) {
            result.append("IV");
            number = 0;
        }

        for (int i = 0; i < number; i++) {
            result.append("I");
        }

        return result.toString();
    }

    private int toRomanDigit(int number, StringBuilder result, String digitSymbol, int digiValue) {
        if (number >= 10) {
            result.append(digitSymbol);
            number -= digiValue;
        }
        return number;
    }
}
