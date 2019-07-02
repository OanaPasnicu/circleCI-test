package com.circleci.at.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    final WebDriver driver;

    public GoogleSearch(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "#searchform input.gLFyf.gsfi")
    private WebElement searchInput;

    @FindBy(css = "#searchform div.FPdoLc.VlcLAe input.gNO89b[value='Google Search']")
    private WebElement searchBtn;

    public void enterKeyword(String keyword) {
        searchInput.clear();
        searchInput.sendKeys(keyword);
        searchInput.sendKeys(Keys.ESCAPE);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void search() {

        searchBtn.click();
    }
}
