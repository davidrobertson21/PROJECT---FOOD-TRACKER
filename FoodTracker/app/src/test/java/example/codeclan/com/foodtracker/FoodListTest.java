package example.codeclan.com.foodtracker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on AD 2017/4/20.
 */

public class FoodListTest {


    @Test
    public void getListTest() {
        FoodList foodList = new FoodList();
        assertEquals(8, foodList.getList().size());
    }
}