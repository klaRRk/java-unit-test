import org.junit.Test;
import static org.junit.Assert.*;
class Program {
    public boolean checkIsAdult(int age) {
        return age >= 18;
    }
}

public class ProgramTest {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Ожидалось, что для возраста 19 лет метод вернет true, но вернул false", true, isAdult);
    }
}