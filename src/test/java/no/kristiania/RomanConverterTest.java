package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanConverterTest {

    @Test
    void shouldBe100() {
        assertEquals("C", RomanConverter.toRoman(100));
    }
    @Test
    void shouldConvertDCXLVIFor666() {
        assertEquals("DCLXVI", RomanConverter.toRoman(666));
    }
    @Test
    void shouldConvertMMCCXVIFor3216(){
        assertEquals("MMMCCXVI", RomanConverter.toRoman(3216));
    }
    @Test
    void shouldConvertDCCLXVIIIFor768() {
        assertEquals("DCCLXVIII", RomanConverter.toRoman(768));
    }

    @Test
    void shouldCOnvert1349(){
        assertEquals("MCCCXLIX", RomanConverter.toRoman(1349));
    }

}