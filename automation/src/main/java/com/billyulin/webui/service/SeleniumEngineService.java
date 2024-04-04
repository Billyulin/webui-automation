package com.billyulin.webui.service;

import com.billyulin.webui.config.SeleniumDriverConfig;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SeleniumEngineService {
    public void startChrome() {
        SeleniumDriverConfig config = new SeleniumDriverConfig();
        if (!"chrome".equalsIgnoreCase(config.getDriverType())) {
            return;
        }
        System.setProperty("webdriver.chrome.driver",config.getChromeDriver());
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        String title = driver.getTitle();
        log.info(title);
        driver.close();
    }

    public void startEdge() {
        SeleniumDriverConfig config = new SeleniumDriverConfig();
        if ("chrome".equalsIgnoreCase(config.getDriverType())) {
            return;
        }
//        System.setProperty("webdriver.edge.driver",config.getEdgeDriver());
        WebDriver driver = new EdgeDriver();

        driver.get("http://www.baidu.com");
        String title = driver.getTitle();
        log.info(title);
        driver.close();
    }
}
