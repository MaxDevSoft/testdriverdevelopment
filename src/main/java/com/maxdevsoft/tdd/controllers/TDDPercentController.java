package com.maxdevsoft.tdd.controllers;



import org.springframework.web.bind.annotation.RequestMapping;


import com.maxdevsoft.tdd.model.TDDPercentModel;
import com.maxdevsoft.tdd.service.TDDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TDDPercentController {

    @Autowired
    private TDDService service;

    @RequestMapping(value = "/")
    public String calcString (){

        return "index";
    }

    @PostMapping("/findPercentage")
    public ResponseEntity<Double> getFindPercentage(@RequestBody TDDPercentModel model) {
       
        double result = service.findPercentage(model.getValueP(), model.getValueX());
        return ResponseEntity.ok(result);
  
    }

    @PostMapping("/numberPencent")
    public ResponseEntity<Double> getNumberPencent(@RequestBody TDDPercentModel model) {
       
        double result = service.numberPencent(model.getValueX(), model.getValueY());
        return ResponseEntity.ok(result);
  
    }

    @PostMapping("/findPercentageUp")
    public ResponseEntity<Double> getFindPercentageUp(@RequestBody TDDPercentModel model){

        double result = service.findPercentageUp(model.getValueX(), model.getValueY());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/findPercentageDown")
    public ResponseEntity<Double> getFindPercentageDown(@RequestBody TDDPercentModel model){

        double result = service.findPercentageDown(model.getValueX(), model.getValueY());
        return ResponseEntity.ok(result);
    }
    
    @PostMapping("/findNumberUp")
    public ResponseEntity<Double> getFindNumberUp(@RequestBody TDDPercentModel model){

        double result = service.findNumberUp(model.getValueX(), model.getValueP());
        return ResponseEntity.ok(result);
    }
    
    @PostMapping("/findNumberDown")
    public ResponseEntity<Double> getFindNumberDown(@RequestBody TDDPercentModel model){

        double result = service.findNumberDown(model.getValueX(), model.getValueP());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/findNumberInitialUp")
    public ResponseEntity<Double> getFindNumberInitialUp(@RequestBody TDDPercentModel model){

        double result = service.findNumberInitialUp(model.getValueX(), model.getValueP());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/findNumberInitialDown")
    public ResponseEntity<Double> getFindNumberInitialDown(@RequestBody TDDPercentModel model){

        double result = service.findNumberInitialDown(model.getValueX(), model.getValueP());
        return ResponseEntity.ok(result);
    }
}
