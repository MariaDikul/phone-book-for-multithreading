import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import java.util.*;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        // given:
        Map<String, String> expected = new HashMap<>();
        expected.put("cont1", "111");
        expected.put("cont2", "222");
        expected.put("cont3", "333");
        int expectedSize = expected.size();

        // when:
        PhoneBook book = new PhoneBook();
        book.add("cont1", "111");
        book.add("cont1", "111");
        book.add("cont2", "222");
        int result = book.add("cont3", "333");

        // then:
        Assertions.assertEquals(expectedSize, result);

    }

    @Test
    public void testFindByNumber() {
        // given:
        Map<String, String> expected = new HashMap<>();
        expected.put("cont1", "111");
        expected.put("cont2", "222");
        expected.put("cont3", "333");

        // when:
        PhoneBook book = new PhoneBook();
        book.add("cont1", "111");
        book.add("cont2", "222");
        book.add("cont3", "333");
        String result = book.findByNumber("111");

        // then:
        Assertions.assertEquals("cont1", result);

    }

    @Test
    public void testFindByName() {
        // given:
        PhoneBook book = new PhoneBook();
        book.add("cont1", "111");
        book.add("cont2", "222");
        book.add("cont3", "333");

        // when:
        String result = book.findByName("cont1");

        // then:
        Assertions.assertEquals("111", result);

    }
}
