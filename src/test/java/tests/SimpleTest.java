package tests;

import com.codeborne.selenide.Configuration;
import config.SelenoidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {
    @Test
    public void selenideSearchTest() {
        final SelenoidConfig config = ConfigFactory.create(SelenoidConfig.class, System.getProperties());
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();

        if (config.remoteUrl() != null) {
            Configuration.remote = config.remoteUrl();
        }


        open("https://www.google.com");

        $(byName("q")).setValue("Selenide").pressEnter();

        $("html").shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
