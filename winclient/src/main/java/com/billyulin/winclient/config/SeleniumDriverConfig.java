package com.billyulin.winclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SeleniumDriverConfig {
    @Value("${webdriver.chrome.driver}")
    private String chromeDriver;

    @Value("${webdriver.edge.driver}")
    private String edgeDriver;

    @Value("${webdriver.type:chrome}")
    private String driverType;

    public String getChromeDriver() {
        return chromeDriver;
    }

    public String getEdgeDriver() {
        return edgeDriver;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setChromeDriver(String driver) {
        System.setProperty("webdriver.chrome.driver", driver);
        chromeDriver = driver;
    }

    public void setEdgeDriver(String driver) {
        System.setProperty("webdriver.edge.driver", driver);
        edgeDriver = driver;
    }

    public void setDriverType(String type) {
        System.setProperty("webdriver.type", type);
        driverType = type;
    }
}
