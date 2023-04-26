import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {
    
    @Test
    public void testEquilateralTriangle(){
        Triangle triangle = new Triangle(3,3,3);
        assertEquals("equilateral", triangle.getType());
    }
    @Test
    public void testIsoscelesTriangle(){
        Triangle triangle = new Triangle(3,3,2);
        assertEquals("isosceles", triangle.getType());
    }
    @Test
    public void testScaleneTriangle(){
        Triangle triangle = new Triangle(3,4,5);
        assertEquals("scalene", triangle.getType());
    }
    @Test
    public void testIsNotTriangle(){
        Triangle triangle = new Triangle(1,2,3);
        assertEquals("isn't triangle", triangle.getType());
    }
}
