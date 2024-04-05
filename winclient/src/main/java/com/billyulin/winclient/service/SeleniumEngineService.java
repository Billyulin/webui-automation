package com.billyulin.winclient.service;

import com.billyulin.winclient.config.SeleniumDriverConfig;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SeleniumEngineService {
    @Autowired
    private SeleniumDriverConfig config;
    public void startChrome() {
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
        if ("chrome".equalsIgnoreCase(config.getDriverType())) {
            return;
        }
        log.info(config.getEdgeDriver());
        System.setProperty("webdriver.edge.driver",config.getEdgeDriver());
        WebDriver driver = new EdgeDriver();

        driver.get("http://www.baidu.com");
        String title = driver.getTitle();
        log.info(title);
        driver.close();
    }
}
