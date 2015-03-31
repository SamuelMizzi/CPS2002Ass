package mt.edu.um;

import org.junit.Assert;
import org.junit.Test;

public class TransactionTest {
	private Transaction instance;
	
	@Test
	public void processTest() {
		instance = new Transaction();
		boolean actual = instance.process();
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void setSourceAccountNumberTest(){
		instance = new Transaction();
		int expected = 120;
		instance.setSourceAccountNumber(expected);
		int actual = instance.getSourceAccountNumber();
		Assert.assertEquals(expected, actual);;
		
	}

}
