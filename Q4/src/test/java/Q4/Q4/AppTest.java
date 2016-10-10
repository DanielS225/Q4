package Q4.Q4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Triangle t1 = new Triangle();
        assertEquals(t1.getSide1(),1.0);
        assertEquals(t1.getSide2(),1.0);
        assertEquals(t1.getSide3(),1.0);
        assertEquals(t1.getPerimeter(),3.0);
        assertTrue(t1.toString() instanceof String);
        assertEquals(t1.getColor(),"white");
        assertTrue(t1.getDateCreated() instanceof java.util.Date);
        assertFalse(t1.isFilled());
        
        try {
        	Triangle t2 = new Triangle(2,2,5);
        } catch (TriangleException e) {
        	
        }
        
        try {
        	Triangle t3 = new Triangle(3,4,5);
        	assertEquals(t3.getSide1(),3.0);
        	assertEquals(t3.getSide2(),4.0);
        	assertEquals(t3.getSide3(),5.0);
        	assertEquals(t3.getArea(),6.0);
        	assertEquals(t3.getPerimeter(),12.0);
        	t3.setColor("green!");
            assertEquals("green!",t3.getColor());
        } catch (TriangleException e) {
        	
        }
        
        Triangle t4 = new Triangle(1,2,3,"green",false);
        t4.setColor("red");
        assertEquals(t4.isFilled(),false);
        t4.setFilled(true);
        assertEquals(t4.isFilled(),true);
        
        try {
        	Triangle t5 = new Triangle(0,-1,0);
        } catch (TriangleException e) {
        	
        }
        
    }
}
