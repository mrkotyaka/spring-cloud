package ru.mrkotyaka.springcloudclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CloudController {

    @Value("${circuit}")
    private String fromConfiguration;

    @GetMapping
    public String getParamFromConfiguration() {
        return fromConfiguration;
    }
}
