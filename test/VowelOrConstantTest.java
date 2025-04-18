import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class VowelOrConstantTest {
    char vowel ='a';

    @Test
    void testFindingVowel_lowercaseA() {
        assertOutput(vowel+" is vowel.   \n", vowel);
    }

    private void assertOutput(String s, char a) {
    }


}