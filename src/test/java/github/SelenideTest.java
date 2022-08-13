package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1800x1028";
    }

    @Test
    void searchJUnit5InSoftAssertions() {
        open("https://github.com");
        $("[placeholder='Search GitHub']").setValue("Selenide").pressEnter();
        $("a[class='menu-item'][href='/search?q=Selenide&type=wikis']").click();
        $("#wiki_search_results").shouldHave(text("SoftAssertions"));
        $("a[title='SoftAssertions']").click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
        // sleep(4000);



    }
}
