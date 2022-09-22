package junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;



public class country {

	@Rule
	public ErrorCollector error = new ErrorCollector(); 
	
	@Test
	public void canada() {
		System.out.println("canada");
	}
	
	@Test
	public void india() {
		System.out.println("india");
		
		try {
			Assert.assertFalse(true);
		}
		catch(Throwable e) {
			error.addError(e);
		}
		
		System.out.println("gujarat");
	}
	

	@Test
	public void usa() {
		System.out.println("usa");
	}
}
