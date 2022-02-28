

import org.junit.Test;

        import static org.junit.Assert.*;

public class EncrypTest {
    //coded test method starts with annotation
    Encrypt testEncrypt = new Encrypt(5, "I love hiking");
    @Test
    public void checkIfItCreatesInstance()
    {
        assertEquals(true, testEncrypt instanceof Encrypt);
    }

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("Football is life", testEncrypt.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(5,testEncrypt.getKey());
    }

    @Test
    public void isNotEmpty()
    {
        assertEquals(true,testEncrypt.isNotEmpty());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testEncrypt.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testEncrypt.isValidKey());
    }

    @Test
    public void validEncoding()
    {
        assertEquals("Football is life" , testEncrypt.encode());
    }


}
