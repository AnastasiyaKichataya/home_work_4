package com.github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Pricing {

    @Test
    void findPricingInGithub(){
        open("https://github.com/");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $(".application-main").shouldHave(text("Choose the plan that’s right for you"));

    }
}
