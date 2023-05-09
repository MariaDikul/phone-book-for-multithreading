import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

public class PhoneBookTest {

    static PhoneBook book = new PhoneBook();

    @BeforeAll
    public static void createPhoneBook() {
        book.add("cont1", "111");
        book.add("cont2", "222");
        book.add("cont3", "333");
    }

    @Test
    public void testAdd() {
        int result = book.add("cont3", "333");
        Assertions.assertEquals(3, result);

    }

    @Test
    public void testFindByNumber() {
        String result = book.findByNumber("111");
        Assertions.assertEquals("cont1", result);

    }

    @Test
    public void testFindByName() {
        String result = book.findByName("cont1");
        Assertions.assertEquals("111", result);

    }

    @Test
    public void printAllNames() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        book.printAllNames();
        Assertions.assertEquals("cont1, cont2, cont3", output.toString());
        System.setOut(null);
    }
}
