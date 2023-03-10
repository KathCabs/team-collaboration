
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
   
    public MENU() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        burger = new javax.swing.JButton();
        Meal = new javax.swing.JButton();
        Drinks = new javax.swing.JButton();
        Snacks = new javax.swing.JButton();
        PlaceOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalBill = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chnge = new javax.swing.JTextField();
        moneypaid = new javax.swing.JTextField();
        ComputeChange = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        burger.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        burger.setText("Krabby Patty");
        burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerActionPerformed(evt);
            }
        });
        getContentPane().add(burger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 233));

        Meal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Meal.setText("MM AND BB MEAL");
        Meal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MealActionPerformed(evt);
            }
        });
        getContentPane().add(Meal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, 227));

        Drinks.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Drinks.setLabel("Kelp Shake");
        Drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinksActionPerformed(evt);
            }
        });
        getContentPane().add(Drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 300, 233));

        Snacks.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Snacks.setText("Krabby Fry");
        Snacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnacksActionPerformed(evt);
            }
        });
        getContentPane().add(Snacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 300, 227));

        PlaceOrder.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(PlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 293, 109));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Cart");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 141, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food", "Quantity", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 420, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Change : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 170, 40));

        totalBill.setEditable(false);
        totalBill.setText("0.00");
        getContentPane().add(totalBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Total Bill : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 170, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Money Paid : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 170, 40));

        chnge.setEditable(false);
        chnge.setText("0.00");
        getContentPane().add(chnge, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, 120, -1));

        moneypaid.setText("0.00");
        moneypaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneypaidActionPerformed(evt);
            }
        });
        getContentPane().add(moneypaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 120, -1));

        ComputeChange.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComputeChange.setLabel("Compute For Change");
        ComputeChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeChangeActionPerformed(evt);
            }
        });
        getContentPane().add(ComputeChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 200, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wp2636472-spongebob-sky-background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void AddItem(Object[] dataRow)
    {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(dataRow);
    }
   
    private void burgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerActionPerformed
        BURGER b = new BURGER();    
       
        b.setVisible(true);
            
    }//GEN-LAST:event_burgerActionPerformed

    private void MealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MealActionPerformed
        COMBOMEAL cm = new COMBOMEAL();
        
        cm.setVisible(true);
    }//GEN-LAST:event_MealActionPerformed

    private void DrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinksActionPerformed
        DRINKS d = new DRINKS();
        
        d.setVisible(true);
    }//GEN-LAST:event_DrinksActionPerformed

    private void SnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnacksActionPerformed
        SNACKS s = new SNACKS();
        
        s.setVisible(true);
        
    }//GEN-LAST:event_SnacksActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        RECEIPT r = new RECEIPT();
        
        r.setVisible(true);
    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void moneypaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneypaidActionPerformed
   
    }//GEN-LAST:event_moneypaidActionPerformed

    private void ComputeChangeActionPerformed(java.awt.event.ActionEvent evt) {                                              
    double money = Double.parseDouble(moneypaid.getText());
    double tbill = Double.parseDouble(totalBill.getText());
    double change = money-tbill;
    if (tbill > money)
    {
        infoBox("Insufficient Money!!","Money Error");
    }
        else 
    {
        String txtchange = String.format("%.2f", change);
        df.format(change);
        chnge.setText(txtchange);
    }
    
    }                                             
     public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage,titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
   
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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComputeChange;
    private javax.swing.JButton Drinks;
    private javax.swing.JButton Meal;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JButton Snacks;
    private javax.swing.JButton burger;
    public static javax.swing.JTextField chnge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField moneypaid;
    public static javax.swing.JTextField totalBill;
    // End of variables declaration//GEN-END:variables
}
