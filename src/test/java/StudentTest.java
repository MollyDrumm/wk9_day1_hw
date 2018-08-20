import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Student student;

    @Before
    public void before() {
        student = new Student("Molly");
    }

    @Test
    public void hasName() {
        assertEquals("Molly", student.getName());
    }

}