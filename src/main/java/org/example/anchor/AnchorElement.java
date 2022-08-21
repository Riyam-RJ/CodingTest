package org.example.anchor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AnchorElement {

    public static void main(String[] args) {
        AnchorElement anchorElement = new AnchorElement();
        String url = "https://www.github.com/riyam-rj/";
        anchorElement.findAllAnchorTagFromURL(url);
    }
    public void findAllAnchorTagFromURL(String url) {
        String chromePath = "/Users/Rii/Desktop/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromePath);
       // System.setProperty("webdriver.chrome.whitelistedIps", "");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Get list of all elements with anchor tag <a>
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("Total number of links: " + allLinks.size());

        //Loop through the list and print link address
        for(WebElement link: allLinks){
            System.out.println(link.getAttribute("href"));
        }
    }
}