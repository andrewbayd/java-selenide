package artlebedevtests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.artlebedev.utils.TestListener;

import static ru.artlebedev.pages.MainPage.openMainPage;

@Listeners(TestListener.class)
public class ArtlebedevSearchTest {

    private static final String SEARCH_WORD = "единорог";

    @Test
    void performSearchAndCheckResultsArePresent() {
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.timeout = 10000;

        openMainPage()
                .openToolsPage()
                .openMatrixPage()
                .fillSearchInputWith(SEARCH_WORD)
                .clickSearchButton()
                .checkSearchResultsAreDisplayed();

    }
}
