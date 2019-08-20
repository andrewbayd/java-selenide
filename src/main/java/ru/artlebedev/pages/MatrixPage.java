package ru.artlebedev.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class MatrixPage extends BasePage<MatrixPage> {

    private static final String SEARCH_INPUT = "input[name='Word']";
    private static final String SEARCH_BUTTON = ".blue-button";
    private static final String SEARCH_RESULTS = ".als-columns";

    public MatrixPage fillSearchInputWith(String text) {
        $(SEARCH_INPUT).setValue(text);
        return this;
    }

    public MatrixPage clickSearchButton() {
        $(SEARCH_BUTTON).click();
        return this;
    }

    public MatrixPage checkSearchResultsAreDisplayed() {
        $(SEARCH_RESULTS).shouldBe(Condition.visible);
        return this;
    }
}
