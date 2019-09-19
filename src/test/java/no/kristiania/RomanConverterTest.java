package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanConverterTest {


    @Test
    void shouldConvertDCCLXVIIIFor768(){
        assertEquals("DCCLXVIII", RomanConverter.toRoman(768));
    }
    @Test
    void shouldConvertMMCCXVIFor3216(){
        assertEquals("MMMCCXVI", RomanConverter.toRoman(3216));
    }

    @Test
    void shouldConvertIVFor4() {
        assertEquals("XL", RomanConverter.toRoman(40));
    }

}