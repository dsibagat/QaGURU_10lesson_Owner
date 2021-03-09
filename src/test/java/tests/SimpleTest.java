package tests;

import com.codeborne.selenide.Configuration;
import config.ConfigHelper;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {
    @Test
    void selenideSearchTest() {
        Configuration.remote = ConfigHelper.getWebdriverRemote();

        open("https://www.google.com");

        $(byName("q")).setValue("Selenide").pressEnter();

        $("html").shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
