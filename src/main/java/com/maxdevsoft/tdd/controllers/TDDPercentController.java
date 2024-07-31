package com.maxdevsoft.tdd.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.maxdevsoft.tdd.model.TDDPercentModel;
import com.maxdevsoft.tdd.service.TDDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TDDController {

    @Autowired
    private TDDService service;
    


    @RequestMapping("/")
    public String calcString (){

        return "index";

    }

    @PostMapping("/findPercentage")
    public ResponseEntity<Double> getFindPercentage(@RequestBody TDDPercentModel model) {
       
        double result = service.findPercentage(model.getValueP(), model.getValueX());
        return ResponseEntity.ok(result);
  
    }

    // @GetMapping("/numberPencent")
    // public double getNumberPencent() {

    //     return service.numberPencent(model.getValueX(), model.getValueY());
  
    // }
    
    // @GetMapping("/findPercentageUp")
    // public double getFindPercentageUp() {

    //     return service.findPercentageUp(model.getValueX(), model.getValueY());
  
    // }
    // @GetMapping("/findPercentageDown")
    // public double getFindPercentageDown() {

    //     return service.findPercentageDown(model.getValueX(), model.getValueY());
  
    // }
    // @GetMapping("/findNumberUp")
    // public double getFindNumberUp() {

    //     return service.findNumberUp(model.getValueX(), model.getValueP());
  
    // }
    // @GetMapping("/findNumberDown")
    // public double getFindNumberDown() {

    //     return service.findNumberDown(model.getValueX(), model.getValueP());
  
    // }
    // @GetMapping("/findNumberInitialUp")
    // public double getFindNumberInitialUp() {

    //     return service.findNumberInitialUp(model.getValueX(), model.getValueP());
  
    // }
    // @GetMapping("/findNumberInitialDown")
    // public double getFindNumberInitialDown() {

    //     return service.findNumberInitialDown(model.getValueX(), model.getValueP());
  
    // }
    
    
}
