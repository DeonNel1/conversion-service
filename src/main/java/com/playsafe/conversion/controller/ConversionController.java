package com.playsafe.conversion.controller;

import com.playsafe.conversion.service.ConvertService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {
    private static final Logger logger =   LoggerFactory.getLogger(ConversionController.class);
    private final ConvertService convertService;


    public ConversionController(ConvertService convertService) {
        this.convertService = convertService;
    }

    @GetMapping("/conversion/ctok")
    public double ctok(@RequestParam Double celsius) {
        Long ts = System.currentTimeMillis();
        double result = convertService.ctok(celsius);
        logger.info("export completed in ", ((System.currentTimeMillis() - ts) / 1000) + " seconds");
        return result;
    }

    @GetMapping("/conversion/ktoc")
    public double ktoc(@RequestParam Double kelvin) {
        Long ts = System.currentTimeMillis();
        double result = convertService.ktoc(kelvin);
        logger.info("export completed in ", ((System.currentTimeMillis() - ts) / 1000) + " seconds");
        return result;
    }

    @GetMapping("/conversion/mtok")
    public double mtok(@RequestParam Double miles) {
        Long ts = System.currentTimeMillis();
        double result = convertService.mtok(miles);
        logger.info("export completed in ", ((System.currentTimeMillis() - ts) / 1000) + " seconds");
        return result;
    }

    @GetMapping("/conversion/ktom")
    public double ktom(@RequestParam Double kilometers) {
        Long ts = System.currentTimeMillis();
        double result = convertService.ktom(kilometers);
        logger.info("export completed in ", ((System.currentTimeMillis() - ts) / 1000) + " seconds");
        return result;
    }
    
}
