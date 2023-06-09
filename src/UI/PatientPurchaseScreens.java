/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Patient.Patient;
import model.inventory.Inventory;
import model.inventory.InventoryDAOImp;
import model.puchase.PurchaseDAOImp;

/**
 *
 * @author rodri
 */
public class PatientPurchaseScreens extends javax.swing.JPanel {
    JSplitPane jSplitPane;
    Patient patient;
    Inventory inv;
    int quantity;
    String storeIdPurchased;
    float totalPrice;

    /**
     * Creates new form PatientPurchaseScreens
     * @param jSplitPane
     */
    public PatientPurchaseScreens(JSplitPane jSplitPane, Patient patient, Inventory inv, int quantity, String storeIdPurchchased) {
        this.jSplitPane = jSplitPane;
        this.patient = patient;
        this.inv = inv;
        this.quantity = quantity;
        this.storeIdPurchased = storeIdPurchchased;
        
        initComponents();
        totalPrice = 0;
        System.out.println("inventory Details in const"+ this.inv.getMedicineID()+ this.inv.getMedicineName());
        populateTable(this.inv);
        TotalTxtField.setText(String.valueOf(totalPrice));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TotalTxtField = new javax.swing.JTextField();
        TotalLbl = new javax.swing.JLabel();
        checkoutBtn1 = new javax.swing.JButton();
        customerLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        contactNoLbl = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseTable = new javax.swing.JTable();
        purchaseTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(160, 213, 229));

        jPanel1.setBackground(new java.awt.Color(160, 213, 229));

        TotalTxtField.setEditable(false);

        TotalLbl.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        TotalLbl.setText("Grand Total:");

        checkoutBtn1.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        checkoutBtn1.setText("PLACE ORDER");
        checkoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtn1ActionPerformed(evt);
            }
        });

        customerLbl.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        customerLbl.setText("Customer Details");

        nameLbl.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        nameLbl.setText("Name:");

        addressLbl.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        addressLbl.setText("Address:");

        contactNoLbl.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        contactNoLbl.setText("Contact No:");

        nameLabel.setText("jLabel3");
        nameLabel.setText(this.patient.getName());

        contactLabel.setText("jLabel3");
        contactLabel.setText(this.patient.getContactNo());

        addressLabel.setText("jLabel3");
        addressLabel.setText(this.patient.getAddress());

        purchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Dosage", "Quantity", "Price/Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(purchaseTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(contactNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(customerLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TotalLbl)
                                .addGap(38, 38, 38)
                                .addComponent(TotalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkoutBtn1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(TotalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)

                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerLbl)
                        .addComponent(TotalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNoLbl)
                    .addComponent(contactLabel)
                    .addComponent(checkoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(addressLabel))
                .addContainerGap(550, Short.MAX_VALUE))
        );

        purchaseTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        purchaseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchaseTitle.setText("PURCHASE DETAILS");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/purchase.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(purchaseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(purchaseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtn1ActionPerformed
        // TODO add your handling code here:
        String email = patient.getEmail();
        String medicineId = inv.getMedicineID();
        String storeId = storeIdPurchased;
        int quantity = this.quantity;
        String status = "Order placed";
        float totalPrice = this.totalPrice;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String updateTime = dtf.format(now);
        PurchaseDAOImp pDao = new PurchaseDAOImp();
        pDao.add(email, medicineId, storeId, quantity, status,updateTime , totalPrice);
        
        InventoryDAOImp inv = new InventoryDAOImp();
        inv.updateQuantity(medicineId, quantity);
        
        JOptionPane.showMessageDialog(this, "Thank you for placing an order.");
        
        PublicScreens ps = new PublicScreens(jSplitPane);
        jSplitPane.setBottomComponent(ps);
        
    }//GEN-LAST:event_checkoutBtn1ActionPerformed

    
    public void populateTable(Inventory inv){
        System.out.println("in populate Table"+inv.getMedicineID()+ "--"+inv+ inv.getDosage()+inv.getPrice());
        
        this.totalPrice = this.quantity*inv.getPrice();
        System.out.println("in price in  Table"+ this.totalPrice);
        DefaultTableModel model = (DefaultTableModel) purchaseTable.getModel();
        System.out.println("in price in  Table -- 1");
        model.setRowCount(0);
        System.out.println("in price in  Table");
      
        int count=1;
        System.out.println("in count Table"+count);
//        Object[] row = new Object[6];
//        row[0]=count;
//        row[1]=inv;
//        row[2]=inv.getDosage();
//        row[3]= this.quantity;
//        row[4]=inv.getPrice();
//        row[5] = totalPrice;
        model.addRow(new Object[]{inv, inv.getDosage(), quantity, inv.getPrice(), totalPrice});
             
//        model.addRow(row);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JTextField TotalTxtField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JButton checkoutBtn1;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel contactNoLbl;
    private javax.swing.JLabel customerLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTable purchaseTable;
    private javax.swing.JLabel purchaseTitle;
    // End of variables declaration//GEN-END:variables
}
