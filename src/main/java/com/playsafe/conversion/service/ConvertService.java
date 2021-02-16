package com.playsafe.conversion.service;

import org.springframework.stereotype.Service;

@Service
public class ConvertService {

    public double ctok(double celsius) {
        return celsius + 273.15;
    }

    public double ktoc(double kelvin) {
        return kelvin - 273.15;
    }

    public double mtok(double miles) {
        return miles * 1.609347;
    }

    public double ktom(double kilometers) {
        return kilometers * 0.6214;
    }
}
