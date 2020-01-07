
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dan
 */
public class VendingMachine extends javax.swing.JFrame {
    
    
    
    //MY VARIABLES
    public static float[] price = {2f, 0.5f, 1f, 2f, 1f};
    public static int[] quantity = {0, 20, 20, 20, 20};
    
    public static double change;
    public static float cost= 0;
    public static double amountOfCashInserted;
    
    Basket _chocolate = new Basket();
    Basket _water = new Basket();
    Basket _drink = new Basket();
    Basket _snack = new Basket();
    Basket _sweet = new Basket();
    
    //An array list which stores the items which the customer selects
    static ArrayList<Basket> cart = new ArrayList<Basket>();
    static ArrayList<Basket> stock = new ArrayList<Basket>();
    
    //arrayIndex;
    
    /**
     * Creates new form VendingMachine
     */
    public VendingMachine() {
        initComponents();
        String[] menu = {"Chocolate", "Water", "Drink", "Snack", "Sweet"};
        
        
        
        _chocolate.foodName = "Chocolate";
        _chocolate.price = 2;
        _chocolate.quantity = 20;
        _chocolate.code = 01;
        stock.add(_chocolate);
        
        
        _water.foodName = "Water";
        _water.price = 0.5f;
        _water.quantity = 20;
        _water.code = 02;
        stock.add(_water);
        
        
        _drink.foodName = "Drink";
        _drink.price = 1;
        _drink.quantity = 20;
        _drink.code = 03;
        stock.add(_drink);
        
        
        _snack.foodName = "Snack";
        _snack.price = 2;
        _snack.quantity = 20;
        _snack.code = 04;
        stock.add(_snack);
        
        
        _sweet.foodName = "Chocolate";
        _sweet.price = 1;
        _sweet.quantity = 20;
        _sweet.code = 05;
        stock.add(_sweet);
        
        
        DefaultComboBoxModel dm = new DefaultComboBoxModel(menu);
        ItemList.setModel(dm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ItemList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        BasketDisplay = new javax.swing.JTextPane();
        CashInsert = new javax.swing.JTextField();
        MachineScreen = new javax.swing.JLabel();
        SelectButton = new javax.swing.JButton();
        PayButton = new javax.swing.JButton();
        PriceScreen = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReceiptPrinter = new javax.swing.JTextPane();
        ClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ItemList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr Comerford" }));
        ItemList.setName("ItemList"); // NOI18N
        ItemList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemListActionPerformed(evt);
            }
        });

        BasketDisplay.setName("Basket"); // NOI18N
        jScrollPane1.setViewportView(BasketDisplay);

        CashInsert.setText("Insert Cash");
        CashInsert.setName("CashInput"); // NOI18N
        CashInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashInsertActionPerformed(evt);
            }
        });

        MachineScreen.setText("Machine Screen");
        MachineScreen.setName("MachineScreen"); // NOI18N

        SelectButton.setText("Select");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });

        PayButton.setText("Pay");
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });

        PriceScreen.setText("Cost:");

        ReceiptPrinter.setName("Basket"); // NOI18N
        jScrollPane2.setViewportView(ReceiptPrinter);

        ClearButton.setText("Clear Screen");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MachineScreen)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CashInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PayButton)
                            .addComponent(SelectButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ClearButton)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(PriceScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CashInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(PayButton)))
                .addGap(26, 26, 26)
                .addComponent(MachineScreen)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CashInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashInsertActionPerformed

    private void ItemListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemListActionPerformed
        
    }//GEN-LAST:event_ItemListActionPerformed

    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButtonActionPerformed
        
        String itemSelected = (ItemList.getSelectedItem().toString());
        
        if(itemSelected.equals("Chocolate") && stock.get(0).quantity > 0)
        {
            stock.get(0).quantity--;
            Basket chocolate = new Basket();
            chocolate.foodName = "Chocolate";
            chocolate.price = 2;
            chocolate.quantity = 1;
            chocolate.code = 01;
            
            cart.add(chocolate);
            BasketDisplay.setText(BasketDisplay.getText() + itemSelected + "\n");
        }
        else if(itemSelected.equals("Chocolate")&&stock.get(0).quantity <= 0)
        {
            MachineScreen.setText("Chocolate: Sold out");
        }
        
        if(itemSelected.equals("Water")&& stock.get(1).quantity > 0)
        {
            stock.get(1).quantity--;
            Basket water = new Basket();
            water.foodName = "Water";
            water.price = 0.5f;
            water.quantity = 1;
            water.code = 02;
            
            cart.add(water);
            BasketDisplay.setText(BasketDisplay.getText() + itemSelected + "\n");
        }
        else if(itemSelected.equals("Water")&& stock.get(1).quantity <= 0)
        {
            MachineScreen.setText("Water: Sold out");
        }
        
        if(itemSelected.equals("Drink")&& stock.get(2).quantity > 0)
        {
            stock.get(2).quantity--;
            Basket drink = new Basket();
            drink.foodName = "Drink";
            drink.price = 1;
            drink.quantity = 1;
            drink.code = 03;
            
            cart.add(drink);
            BasketDisplay.setText(BasketDisplay.getText() + itemSelected + "\n");
        }
        else if(itemSelected.equals("Drink")&& stock.get(2).quantity <= 0)
        {
            MachineScreen.setText("Drink: Sold out");
        }
        
        if(itemSelected.equals("Snack")&& stock.get(3).quantity > 0)
        {
            stock.get(3).quantity--;
            Basket snack = new Basket();
            snack.foodName = "Snack";
            snack.price = 2;
            snack.quantity = 1;
            snack.code = 04;
            
            cart.add(snack);
            BasketDisplay.setText(BasketDisplay.getText() + itemSelected + "\n");
        }
        else if(itemSelected.equals("Snack")&& stock.get(3).quantity <= 0)
        {
            MachineScreen.setText("Snack: Sold out");
        }
        
        if(itemSelected.equals("Sweet")&& stock.get(4).quantity > 0)
        {
            stock.get(4).quantity--;
            Basket sweet = new Basket();
            sweet.foodName = "Sweet";
            sweet.price = 1;
            sweet.quantity = 1;
            sweet.code = 05;
            
            cart.add(sweet);
            BasketDisplay.setText(BasketDisplay.getText() + itemSelected + "\n");
        }
        else if(itemSelected.equals("Sweet")&& stock.get(4).quantity <= 0)
        {
            MachineScreen.setText("Sweet: Sold out");
        }
        
        //Get price of item
        getPrice();             
    }//GEN-LAST:event_SelectButtonActionPerformed

    
    
    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
        Buy();
    }//GEN-LAST:event_PayButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        BasketDisplay.setText("");
        ReceiptPrinter.setText("");
        cart.clear();
        getPrice();
    }//GEN-LAST:event_ClearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingMachine().setVisible(true);
            }
        });
    }
    
    public void getPrice()
    {
        cost = 0;
        for(Basket i : cart)
        {
            cost += i.price;
        }
        PriceScreen.setText("£" + Float.toString(cost));
    }
    
    public void Printer()
    {        
        for(Basket i : cart)
        {
            ReceiptPrinter.setText(ReceiptPrinter.getText() + i.foodName + " £" + i.price+ "\n");
            
        }    
        ReceiptPrinter.setText(ReceiptPrinter.getText() + "---------------------\n");
        ReceiptPrinter.setText(ReceiptPrinter.getText() + "Total cost: £" + cost + "\n");
        ReceiptPrinter.setText(ReceiptPrinter.getText() + "Cash inserted: £" + amountOfCashInserted + "\n"); 
        ReceiptPrinter.setText(ReceiptPrinter.getText() + "Customer change: £" + change);
        ReceiptPrinter.setText(ReceiptPrinter.getText() + "Total items bought" + cart.size());
        
        cart.clear();
            
        ReceiptPrinter.setText(ReceiptPrinter.getText() + "\n \nOrder complete, basket emptied");
    }     
    
    public void Buy()
    {
        amountOfCashInserted = Double.parseDouble(CashInsert.getText());
        
          
        if(amountOfCashInserted >= cost)
        {
            MachineScreen.setText("Please take your drink");
            change = amountOfCashInserted - cost;
            PriceScreen.setText("Your change is: " + Double.toString(change));
            
            //Reduce quantity
            ///removeItemsFromStock();
            Printer();
            
        }else if(amountOfCashInserted < cost)
        {
            MachineScreen.setText("Insufficient amount");
            refillStock();
            //cart.clear();
        }
        else
        {
            MachineScreen.setText("Sold out");
            cart.clear();
            cost =0;
        }            
    }
    
    /*
    public void removeItemsFromStock()
    {
        for(Basket i : cart)
        {
            if(i.foodName.equals("Chocolate"))
            {
                _chocolate.quantity = _chocolate.quantity - 1;
            }
            if(i.foodName.equals("Water"))
            {
                _water.quantity -= 1;
            }
            if(i.foodName.equals("Drink"))
            {
                _drink.quantity -= 1;
            }
            if(i.foodName.equals("Snack"))
            {
                _snack.quantity -= 1;
            }
            if(i.foodName.equals("Sweet"))
            {
                _sweet.quantity -= 1;
            }
        } 
    }
*/

    
    //called if transactions fails, stock selected is put back into stock
    public void refillStock()
    {
        for(Basket i : cart)
        {
            if(i.foodName.equals("Chocolate"))
            {
                _chocolate.quantity = _chocolate.quantity + 1;
            }
            if(i.foodName.equals("Water"))
            {
                _water.quantity += 1;
            }
            if(i.foodName.equals("Drink"))
            {
                _drink.quantity += 1;
            }
            if(i.foodName.equals("Snack"))
            {
                _snack.quantity += 1;
            }
            if(i.foodName.equals("Sweet"))
            {
                _sweet.quantity += 1;
            }
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane BasketDisplay;
    private javax.swing.JTextField CashInsert;
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> ItemList;
    private javax.swing.JLabel MachineScreen;
    private javax.swing.JButton PayButton;
    private java.awt.Label PriceScreen;
    private javax.swing.JTextPane ReceiptPrinter;
    private javax.swing.JButton SelectButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}