package com.maxdevsoft.tdd.service;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TDDService {

	//TDDPercentModel model = new TDDPercentModel();

    private static double result1;
    private static double result2;
    private static double result3;

	// A porcentagem p de x é:
	public double findPercentage (double p1, double x){
    
	    result1 = p1 * x;
	    result2 = (result1 / 100);
	     
	    return result2;
	    
	}
	
	// O valor x é o percentual de y:
	public double numberPencent (double x, double y){
	    
	   result1 = x * 100;
	   result2 = result1 / y;
	    
	   return Math.floor(result2);
	    
    }
	
	//  Um valor x que AUMENTOU para y, aumentou uma porcentagem de:
	public double findPercentageUp (double x, double y){
	    
	    result1 = y - x;
	    result2 = result1 / x;
	    result3 = result2 * 100;
	    
	    return Math.floor(result3);
	    
	}
	
	//  Um valor x que DIMINUIU para y, diminuiu a porcentagem de:
	public double findPercentageDown (double x, double y){
	    
	    result1 = x - y;
	    result2 = result1 / x;
	    result3 = result2 * 100;
	    
	    return Math.abs(result3);
	    
	}
	
		// Tenho o valor x e quero AUMENTAR em p porcento, aumentou para:
	public double findNumberUp (double x, double p1){
	    
	    result1 = p1 / 100;
	    result2 = result1 + 1;
	    result3 = result2 * x;
	    
	    return result3;
	}
	
	// Tenho o valor x e quero DIMINUIR em p porcento, diminuiu para:
	public double findNumberDown (double x, double p1){
	    
	    result1 = p1 / 100;
	    result2 = result1 * x;
	    result3 = x - result2;
	    
	    return result3;
	    
	}
	
	// Tenho um valor x que AUMENTOU para p porcento, o valor INICIAL era:
	public double findNumberInitialUp (double x, double p1){
	    
	    result1 = 100 + p1;
	    result2 = result1 / 100;
	    result3 = x / result2;
	    
		return Math.floor(result3);
	}
	
	// Tenho um valor x que DIMINUIU para p porcento, o valor INICIAL era:
	public double findNumberInitialDown (double x, double p1){
	    
	    result1 = 100 - p1;
	    result2 = result1 / 100;
	    result3 = x / result2;
	    
	    return result3;
	}

	// O valor de p1 porcento de p2 porcento é:
	public double findPercentOfThePercent (double p1, double p2){
	    
	    result1 = p1 * p2;
	    result2 = result1 / 10000;
	    result3 = result2 * 100;
	    
	    return result3;
	}

    
}
