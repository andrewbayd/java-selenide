package ru.artlebedev.pages;

import ru.artlebedev.components.Menu;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPage extends BasePage<MainPage> {

    private static final String URL = "https://www.artlebedev.ru/";

    public static MainPage openMainPage() {
        open(URL);
        return page(MainPage.class);
    }

    public ToolsPage openToolsPage() {
        $(Menu.TOOLS).click();
        return page(ToolsPage.class);
    }

}
