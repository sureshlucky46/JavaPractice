package com.javaintro;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class ObjectDatatypes {

	public static void main(String[] args) {

		BigInteger num = new BigInteger("45987566545655555555");
		BigInteger num1 = new BigInteger("588555464664855555656");

		BigDecimal num2 = new BigDecimal("45856566454542.666666");
		BigDecimal num3 = new BigDecimal("8547845484545.85855");
		
		System.out.println("addition" + num.add(num1));
		System.out.println("sub" + num.subtract(num1));
		System.out.println("multipy" + num.multiply(num1));
		System.out.println("divide" + num.divide(num1));

		System.out.println("addition" + num2.add(num3));
		System.out.println("sub" + num2.subtract(num3));
		System.out.println("multipy" + num2.multiply(num3));
		System.out.println("divide" + num2.divide(num3,3,RoundingMode.HALF_UP ));

	}

}