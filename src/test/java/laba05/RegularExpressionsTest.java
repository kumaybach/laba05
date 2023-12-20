package laba05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionsTest {

    @Test
    void task1() {
        String phoneNumber;
        boolean result;

        phoneNumber = "(+380)12-345-67-89";
        result = RegularExpressions.isPhoneNumberValide(phoneNumber);
        assertTrue(result);
        System.out.println(result);

        phoneNumber = "(+380)12-345-67-891";
        result = RegularExpressions.isPhoneNumberValide(phoneNumber);
        assertFalse(result);
        System.out.println(result);
    }

    @Test
    void task2() {
        String text = "Я хочу    бути     програмістом";
        String result = RegularExpressions.removeWrongSpace(text);
        assertEquals("Я хочу бути програмістом", result);
        System.out.println(result);
    }

    @Test
    void task3() {
        String text = "<div>\n" +
                "<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";

        String result = RegularExpressions.removeHtmlTag(text);
        System.out.println(result);
    }
}