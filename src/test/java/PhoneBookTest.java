import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import java.util.*;

public class PhoneBookTest {
    PhoneBook book = new PhoneBook();

    @Test
    public void testAdd() {
        // given:
        Map<String, String> expected = new HashMap<>();
        expected.put("cont1", "111");
        expected.put("cont2", "222");
        expected.put("cont3", "333");
        int expectedSize = expected.size();



        // when:
        book.add("cont1", "111");
        book.add("cont1", "111");
        book.add("cont2", "222");
        int result = book.add("cont3", "333");

        // then:
        Assertions.assertEquals(expectedSize, result);

    }
}
