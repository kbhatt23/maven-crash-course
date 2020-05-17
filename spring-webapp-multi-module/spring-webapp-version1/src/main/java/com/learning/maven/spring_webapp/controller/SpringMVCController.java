package com.learning.maven.spring_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning.maven.App1Utility;

@Controller
public class SpringMVCController {

	@GetMapping("/random")
	public String randomNumber(Model model) {

		System.out.println( "jai shree ram from webapp controller" );
        
        App1Utility util = new App1Utility();
        double[] values = new double[] { 65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32 };
        double meanCalculated= util.calculateMean(values);
        System.out.println("SpringMVCController calcualted mean "+meanCalculated);
    
		return "sita-ram";
	}
}
