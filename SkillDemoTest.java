import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{
    @Test
    public void multiplication(){
        assertEquals(3,SkillDemo.multiply(2,1)); //fails at first
    }
}