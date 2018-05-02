public class mainFunctions {

    public void xpathTypeInWebbox(String locators, String values){
        driver.findElement(By.xpath(locators)).sendKeys(values);
    }

    public void nameTypeInWebbox(String locators, String values){
        driver.findElement(By.name(locators)).sendKeys(values);
    }

    public void idTypeInWebbox(String locators, String values){
        driver.findElement(By.id(locators)).sendKeys(values);
    }

    public void xpathClick(String locators) {
        driver.findElement(By.xpath(locators)).click();
    }
}
