package com.epicode.U5D2;

import com.epicode.U5D2.entities.Menu;
import com.epicode.U5D2.entities.Topping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Esercizio30102023ApplicationTests {

	@Autowired
	private U5D2Application ctx;

	@Autowired
	private Menu menu;
	
	@Test
    void contextLoads() {
		assertNotEquals(null, ctx);
	}

	@Test
	void checkIfPizzaAreInTheMenu(){
        assertNotEquals(null,menu.getPizzaList());
	}

	@Test
	void checkIfDrinksAreInTheMenu(){
		assertNull(menu.getDrinkList());
	}

	@Test
	void checkIFTomatoExist() {
		assertTrue(menu.getToppingList().stream().anyMatch(topping -> topping.getName().equals("Tomato")));
	}

	@Test
	void checkIfThereIsPizzaMargherita() {
		assertTrue(menu.getPizzaList().stream().anyMatch(pizza -> pizza.getName().equals("Pizza Margherita")));
	}


}
