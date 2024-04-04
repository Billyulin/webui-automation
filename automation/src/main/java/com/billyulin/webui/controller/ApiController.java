package com.billyulin.webui.controller;

import com.billyulin.webui.config.SeleniumDriverConfig;
import com.billyulin.webui.service.SeleniumEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
    @Autowired
    private SeleniumDriverConfig config;

    @Autowired
    private SeleniumEngineService seleniumEngineService;

    @GetMapping("/settings")
    public String settings() {
        return config.getChromeDriver();
    }

    @GetMapping("/startSeleniumTest")
    public void startSeleniumTest() {
        seleniumEngineService.startEdge();
    }
}
