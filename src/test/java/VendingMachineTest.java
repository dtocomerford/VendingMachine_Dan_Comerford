/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Dan
 */
public class VendingMachineTest {
    
    public VendingMachineTest() {
    }

    
    /**
     * Test of Buy method, of class VendingMachine.
     */
    @Test
    public void testBuy() {
        
        int expectedChange = 48;
        
        Basket chocolate = new Basket();
        chocolate.foodName = "Chocolate";
        chocolate.quantity = 1;
        chocolate.price = 2;
        
        VendingMachine.cart.add(chocolate);
        VendingMachine.cost = chocolate.price;
        
        VendingMachine.amountOfCashInserted = 50;
        VendingMachine.change = VendingMachine.amountOfCashInserted - chocolate.price;
        
        assertEquals(expectedChange, VendingMachine.change);
        
    }
    
}
