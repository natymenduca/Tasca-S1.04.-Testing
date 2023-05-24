package s104_n1Ex3_ArrayIndexOutOfBoundsException;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MyArrayArrayIndexOutOfBoundsException { 
	
	@Test
    public void testArrayIndexOutOfBoundsException() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			myArray.main(new String[0]);
        });
	}
}



