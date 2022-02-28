
import org.junit.Test;

import static org.junit.Assert.*;

public class DecrypTest  {


    Decrypt testDecrypt = new Decrypt( 5, "N QTAJ MNPNSL ");

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("N QTAJ MNPNSL ", testDecrypt.getmInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(5,testDecrypt.getmKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecrypt.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testDecrypt.isValidKey());
    }

    @Test
    public void validDecoding()
    {
        assertEquals("Elly kelvin" , testDecrypt.decode());
    }
}
