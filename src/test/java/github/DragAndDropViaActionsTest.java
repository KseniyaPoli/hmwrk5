package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropViaActionsTest {

    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1800x1028";
    }

    @AfterEach
    void closeBrowser() {
        closeWebDriver();
    }

    @Test
    void dragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().dragAndDrop($("#column-b"), $("#column-a")); //doesn't work

        $("#column-a").dragAndDropTo($("#column-b")); //works
        $("#column-a").shouldHave(text("B"));
        //sleep(4000);
    }
}
