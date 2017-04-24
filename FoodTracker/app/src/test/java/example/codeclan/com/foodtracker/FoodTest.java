package example.codeclan.com.foodtracker;


import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.foodtracker.Food;

import static org.junit.Assert.*;


public class FoodTest {

    Food food;

    @Before
    public void before() {
        food = new Food(1, "Breakfast", "Cheerios");
    }

    @Test
    public void getDayTest() {
        assertEquals((Integer)1, food.getDay());
    }

    @Test
    public void getBreakfastTest() {
        assertEquals("Breakfast", food.getMealTime());
    }

    @Test
    public void getDishTest() {
        assertEquals("Cheerios", food.getDish());

    }
}