package ru.artlebedev.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ToolsPage extends BasePage<ToolsPage> {

    private static final String MATRIX = "#item-matrix";

    public MatrixPage openMatrixPage() {
        $(MATRIX).click();
        return page(MatrixPage.class);
    }

}
