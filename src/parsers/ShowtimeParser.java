package parsers;

import org.openqa.selenium.WebElement;

public class ShowtimeParser extends ServiceParser {

    public ShowtimeParser() {
        super("https://www.sho.com/");
    }

    @Override
    protected MovieInfo runScript(String movieTitle) {
        browser.get(rootUrl);
        try{
            WebElement searchField = browser.findElementByClassName("global-navigation__search-field");
            searchField.sendKeys("hello world");

        //}catch (TimeoutException e){

        }catch (Exception e){

        }
        return null;
    }

}