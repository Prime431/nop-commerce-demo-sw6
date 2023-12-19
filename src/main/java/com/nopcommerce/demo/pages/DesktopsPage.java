package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
 private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(linkText = "(//h1[normalize-space()='Desktops'])[1]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(id = "products-orderBy")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;
    @CacheLookup
    @FindBy(css = "body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
    WebElement buildYourOwnComputer;

    public void clickOnBuildOnYourOwnComputer() {
        log.info("Click on Build Computer " + buildYourOwnComputer.toString());
        clickOnElement(buildYourOwnComputer);
    }

    public String getDesktopsText() {
        String actualText = getTextFromElement(desktopText);
        return actualText;
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
    }

}
