package com.billyulin.winclient.controller;

import com.billyulin.winclient.service.SeleniumEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
    @Autowired
    private SeleniumEngineService seleniumEngineService;

    @GetMapping("/startSeleniumTest")
    public void startSeleniumTest() {
        seleniumEngineService.startEdge();
    }
}
