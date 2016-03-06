package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 
 * @author Hayley Andrews
 *
 */
public class Triangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Tests method getPerimeter
	 */
	@Test
	public void Perimetertest() {
		Triangle Perim = new Triangle(3,2,3);
		assertEquals(8, Perim.getPerimeter(), 0);
	}

	/**
	 * Tests method getArea
	 */
	@Test
	public void Areatest() {
		Triangle Area = new Triangle(3,2,3);
		assertEquals(2.83, Area.getArea(), 0.01);
	}
	
}