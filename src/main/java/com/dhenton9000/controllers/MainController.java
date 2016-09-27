package com.dhenton9000.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private Logger log = LoggerFactory.getLogger(MainController.class);
    private String mySecret;
    private String envMessage;
    @Value("${spring.profiles.active}")
    private String activeProfiles;

    
    
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("appTitle","Spring Boot");
        return "pages/home";
    }

    @RequestMapping("/propertiesDemo")
    public String propertiesDemo( Model model) {
        model.addAttribute("envMessage", getEnvMessage());
        model.addAttribute("activeProfiles", getActiveProfiles());
        model.addAttribute("mySecret", this.getMySecret());
        log.debug("get a job");
        return "pages/propertiesDemo";
    }

    /**
     * @return the mySecret
     */
    public String getMySecret() {
        return mySecret;
    }

    /**
     * @param mySecret the mySecret to set value comes from
     * application.properties
     */
    @Value("${my.secret}")
    public void setMySecret(String mySecret) {
        this.mySecret = mySecret;
    }

    /**
     * @return the envMessage
     */
    public String getEnvMessage() {
        return envMessage;
    }

    /**
     * @param envMessage the envMessage to set
     */
    @Value("${env.message}")
    public void setEnvMessage(String envMessage) {
        this.envMessage = envMessage;
    }

    /**
     * @return the activeProfiles
     */
    public String getActiveProfiles() {
        return activeProfiles;
    }

    /**
     * @param activeProfiles the activeProfiles to set
     */
    public void setActiveProfiles(String activeProfiles) {
        this.activeProfiles = activeProfiles;
    }

}
