package com.maxdevsoft.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.maxdevsoft.tdd.service.TDDService;

@SpringBootTest
class TddApplicationTests {

	TDDService tddService = new TDDService();

	@Test
	@Tag("calculus:1")
	@DisplayName("Test of the method that calculates the percentage of a number.")
	void findPercentageTest() {

		double resultadoEsperado = 0.935;

		double retornoFeito = tddService.findPercentage(11,8.5);
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

	@Test
	@Tag("calculus:2")
	@DisplayName("Test in which a value of x, we want to know what the percentage of the value of y is.")
	void numberPencentTest() {

		double resultadoEsperado = 61.0;

		double retornoFeito = tddService.numberPencent(11,18);
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

	@Test
	@Tag("calculus:3")
	@DisplayName("Test where an x ​​value, that value has increased to the y value and we want to know how many percent it has increased.")
	void findPercentageUpTest() {

		double resultadoEsperado = 19.0;

		double retornoFeito = tddService.findPercentageUp(84,100);
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

	@Test
	@Tag("calculus:4")
	@DisplayName("Test where a value of x, that value has increased to the value of y and we want to know how many percent it has decreased.")
	void findPercentageDownTest() {

		double resultadoEsperado = 16.0;

		double retornoFeito = tddService.findPercentageDown(100,84);
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

	@Test
	@Tag("calculus:5")
	@DisplayName("Test where we have a number and want to increase it by a few percent.")
	void findNumberUpTest() {

		double resultadoEsperado = 86.25;

		double retornoFeito = tddService.findNumberUp(75,15);
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

	@Test
	@Tag("calculus:6")
	@DisplayName("Test where we have a number and want to decrease it by a few percent.")
	void findNumberDownTest() {

		double resultadoEsperado = 63.75;

		double retornoFeito = tddService.findNumberDown(75,15);
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

	@Test
	@Tag("calculus:7")
	@DisplayName("Test in which we have a number that has increased by a few percent compared to the initial value.")
	void findNumberInitialUpTest() {

		double resultadoEsperado = 65.0;

		double retornoFeito = tddService.findNumberInitialUp(75,15);
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

	@Test
	@Tag("calculus:8")
	@DisplayName("Test in which we have a number that has decreased some percentage of the initial value.")
	void findNumberInitialDownTest() {

		double resultadoEsperado = 60.0;

		double retornoFeito = tddService.findNumberInitialDown(15,75);
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

}


