package studentregistration.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsModal {
    SelenideElement modalDialog = $(".modal-dialog"),
    headerText = $("#example-modal-sizes-title-lg"),
    tableVerifyResult = $(".table-responsive");



    public ResultsModal modalDialogIsVisible() {
        modalDialog.should(appear);
        headerText.shouldHave(text("Thanks for submitting the form"));
        return this;
    }

    public ResultsModal tableVerifyResultAppears(String key, String value) {
        tableVerifyResult.$(byText(key)).sibling(0).shouldHave(text(value));
        return this;
    }
}
