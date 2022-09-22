package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class envir {
	
	@BeforeClass
	public static void cloud() {
		System.out.println("cloud");
	}

	@Before
	public void moun() {
		System.out.println("mount");
	}
	
	@After
	public void leave() {
		System.out.println("leave");
	}
	
	@AfterClass
	public static void tree() {
		System.out.println("tree");
		Assert.assertTrue(false);
		System.out.println("tree1");
	}
	
	@Test
	public void soil() {
		System.out.println("soil");
	}
	
	@Test
	public void rain() {
		System.out.println("rain");
	}
}
