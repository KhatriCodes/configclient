package com.configclient.demo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {

    @Value("${message Default : hello}")
    String message;

    @RequestMapping("/client")
    public String display()
    {
        return message;
    }
}
