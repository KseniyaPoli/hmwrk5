package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PricingByHoverSelenideTest {

    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1800x1028";
    }
    @AfterEach
    void closeBrowser() {
        closeWebDriver();
    }

    @Test
    void comparePlansByHoverOnPricing() {
          open("https://github.com");
          $(".HeaderMenu").$(byText("Pricing")).hover();
          $(Selectors.byText("Compare plans")).click();

        //sleep(4000);

    }
}
