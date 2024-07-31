package com.maxdevsoft.tdd.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.maxdevsoft.tdd.model.TDDPercentModel;
import com.maxdevsoft.tdd.service.TDDService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TDDController {

    TDDService service = new TDDService();
    TDDPercentModel model = new TDDPercentModel();


    @RequestMapping("/")
    public String calcString (){

        return "index";

    }

    @GetMapping("/findPercentage")
    public double getFindPercentage() {

        return service.findPercentage(model.getValueP(), model.getValueX());
  
    }
    @GetMapping("/numberPencent")
    public double getNumberPencent() {

        return service.numberPencent(model.getValueX(), model.getValueY());
  
    }
    @GetMapping("/findPercentageUp")
    public double getFindPercentageUp() {

        return service.findPercentageUp(model.getValueX(), model.getValueY());
  
    }
    @GetMapping("/findPercentageDown")
    public double getFindPercentageDown() {

        return service.findPercentageDown(model.getValueX(), model.getValueY());
  
    }
    @GetMapping("/findNumberUp")
    public double getFindNumberUp() {

        return service.findNumberUp(model.getValueX(), model.getValueP());
  
    }
    @GetMapping("/findNumberDown")
    public double getFindNumberDown() {

        return service.findNumberDown(model.getValueX(), model.getValueP());
  
    }
    @GetMapping("/findNumberInitialUp")
    public double getFindNumberInitialUp() {

        return service.findNumberInitialUp(model.getValueX(), model.getValueP());
  
    }
    @GetMapping("/findNumberInitialDown")
    public double getFindNumberInitialDown() {

        return service.findNumberInitialDown(model.getValueX(), model.getValueP());
  
    }
    
    
}
