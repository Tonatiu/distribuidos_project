package com.escom.schoolsaes.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PruebaWebService {
	
	@WebMethod
	public double suma(double a, double b) {
			System.out.println("Multiplica");
	      return a * b;
	}
	
	
}
