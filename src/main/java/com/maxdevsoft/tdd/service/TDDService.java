package com.maxdevsoft.tdd.service;

import org.springframework.context.annotation.Configuration;

import com.maxdevsoft.tdd.model.TDDPercentModel;

@Configuration
public class TDDService {

	TDDPercentModel model = new TDDPercentModel();

    private static double result1;
    private static double result2;
    private static double result3;

	public double findPercentage (double p, double x){
    
	    result1 = p * x;
	    result2 = (result1 / 100);
	     
	    return result2;
	    
	}
	
	// I have a value and I want to know the percentage on top of the greater value
	public double numberPencent (double x, double y){
	    
	   result1 = x * 100;
	   result2 = result1 / y;
	    
	   return Math.floor(result2);
	    
    }
	
	//  I have a value and I want to know how many percent it has increased
	public double findPercentageUp (double x, double y){
	    
	    result1 = y - x;
	    result2 = result1 / x;
	    result3 = result2 * 100;
	    
	    return Math.floor(result3);
	    
	}
	
	//  I have a value and I want to know how many percent it has decreased
	public double findPercentageDown (double x, double y){
	    
	    result1 = x - y;
	    result2 = result1 / x;
	    result3 = result2 * 100;
	    
	    return Math.abs(result3);
	    
	}
	
		// I have a number and I want to increase it by some percent
	public double findNumberUp (double x, double p){
	    
	    result1 = p / 100;
	    result2 = result1 + 1;
	    result3 = result2 * x;
	    
	    return result3;
	}
	
	// I have a number and I want to decrease it by some percent
	public double findNumberDown (double x, double p){
	    
	    result1 = p / 100;
	    result2 = result1 * x;
	    result3 = x - result2;
	    
	    return result3;
	    
	}
	
	// I have a number that increased a few percent from the initial value was, the value was:
	public double findNumberInitialUp (double x, double p){
	    
	    result1 = 100 + p;
	    result2 = result1 / 100;
	    result3 = x / result2;
	    
		return Math.floor(result3);
	}
	
	// I have a number that decreased some percentage from the initial value, the value was
	public double findNumberInitialDown (double x, double p){
	    
	    result1 = 100 - p;
	    result2 = result1 / 100;
	    result3 = x / result2;
	    
	    return result3;
	}

    
}
