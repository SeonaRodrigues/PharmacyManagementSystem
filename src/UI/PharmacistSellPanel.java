/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.inventory.Inventory;
import model.inventory.InventoryDAOImp;
import model.inventory.InventoryDirectory;
import model.ngo.Ngo;
import model.pharmacist.Pharmacist;
import model.puchase.PurchaseDAOImp;
import model.store.Store;
import model.store.StoreDAOImp;
import model.store.StoreDirectory;

/**
 *
 * @author rodri
 */
public class PharmacistSellPanel extends javax.swing.JPanel {
JSplitPane splitPane;
Pharmacist phar;
StoreDirectory allStores;
    String medicineNameSearched;
     int quantity;
    String storeIdPurchased;
    float totalPrice;
    /**
     * Creates new form PharmacistSellPanel
     */
    public PharmacistSellPanel(JSplitPane splitPane, Pharmacist phar) {
        this.splitPane = splitPane;
        allStores = new StoreDirectory();
        this.phar = phar;
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

        loginTitle = new javax.swing.JLabel();
        patientIDLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setText(this.phar.getName());
        jLabel5 = new javax.swing.JLabel();
        commLbl = new javax.swing.JLabel();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        btnSearchProduct = new javax.swing.JButton();
        txtSearchKeyWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        contTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        custTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(160, 213, 229));

        loginTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/trolley (1).png"))); // NOI18N
        loginTitle.setText("SELL MEDICINE");

        patientIDLbl.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        patientIDLbl.setText("Pharmacist Name:");

        jLabel2.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        jLabel2.setText(this.phar.getName());

        jLabel5.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        jLabel5.setText("jLabel2");
        jLabel5.setText(this.phar.getCommunity());

        commLbl.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        commLbl.setText("Community:");

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Quantity:");

        btnSearchProduct.setText("Search Medicine");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        drugTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Id", "Name", "Price", "Avail", "Dosage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugTable);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Customer Email:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Customer Details:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ContactNo:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("GrandTotal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(391, 391, 391)
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientIDLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commLbl)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(79, 79, 79)
                                .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addtoCartButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDLbl)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commLbl)
                    .addComponent(jLabel5)
                    .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(custTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtoCartButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
        
      
        String custName = custTextField.getText();
        String name = contTxtField.getText();
   
       if (custName.isEmpty() || name.isEmpty() ){
            javax.swing.JOptionPane.showMessageDialog(null,"Please Enter customer details");
        } else  {
       }
        int selectedRowIndex = drugTable.getSelectedRow();
        System.out.print("search---"+ selectedRowIndex);
        int quantity = (Integer) quantitySpinner.getValue();
        System.out.println("Quantity selected--"+ quantity);
        if(selectedRowIndex < 0){
             javax.swing.JOptionPane.showMessageDialog(this, "Please select a row to proceed.");
        } else if (quantity <=0){
            javax.swing.JOptionPane.showMessageDialog(this, "Please select the quantity to be purchased.");
            
        } else {
            DefaultTableModel table = (DefaultTableModel) drugTable.getModel();
            
            table.getValueAt(selectedRowIndex, 0).toString();
//            String medicineName
//            Inventory ngo = (Inventory)table.getValueAt(selectedRowIndex, 0);
//            System.out.println("inv---"+ ngo.getMedicineID());

            float price=Float.parseFloat(table.getValueAt(selectedRowIndex, 2).toString());
            String medicineIdSelected =table.getValueAt(selectedRowIndex, 0).toString();
            
            
            totalPrice = quantity*price;
            System.out.println("total price"+ totalPrice + "--"+ price);
            jTextField1.setText(String.valueOf(totalPrice));
            System.out.println("stoer id--"+ phar.getStoreId());
        String email = custName;
        String medicineId = medicineIdSelected;
        String storeId = phar.getStoreId();
        String status = "Order placed";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String updateTime = dtf.format(now);
        PurchaseDAOImp pDao = new PurchaseDAOImp();
        pDao.add(email, medicineId, storeId, quantity, status,updateTime , totalPrice);
        
        InventoryDAOImp inv = new InventoryDAOImp();
        inv.updateQuantity(medicineId, quantity);
        
        javax.swing.JOptionPane.showMessageDialog(this, "Thank you for placing an order.");

        }

    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
    if(txtSearchKeyWord.getText().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Enter a medicine name!");
            return;
        }
        else 
        {
//            allStores = new StoreDirectory();
           
            String medicineName = txtSearchKeyWord.getText();

            InventoryDAOImp invDao = new InventoryDAOImp();
            InventoryDirectory invDir = new InventoryDirectory();
             invDir = invDao.getByMedicine(medicineName);
            this.medicineNameSearched = medicineName;
//            ArrayList<String> allStoreId = new ArrayList<>();
//            StoreDAOImp sDao = new StoreDAOImp();
            DefaultTableModel model = (DefaultTableModel) drugTable.getModel();
                model.setRowCount(0);
            if(invDir.getSize()>0){
                for(Inventory i : invDir.getInventoryDirectory()){
//                    String medId = i.getMedicineID();
//                     String MedName = i.getMedicineName();
//                     String comm = i.getDosage();
//                     String price =  String.valueOf(i.getPrice());
//                     String qty=String.valueOf(i.getQuantity());
                    
                     
                    Object[] row = new Object[5];
                    row[0]= i.getMedicineID();
                    row[1]= i;
                    row[2]= i.getPrice();
                    row[3]= i.getQuantity();
                    row[4] = i.getDosage();
                    
                    model.addRow(row);
                }
               
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Medicine not found.\nTry for a different medicine name.");
                txtSearchKeyWord.setText("");
                
            }
        }
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PharmacistJPanel pharmacistPanel=new PharmacistJPanel(splitPane, phar);
        splitPane.setBottomComponent(pharmacistPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JLabel commLbl;
    private javax.swing.JTextField contTxtField;
    private javax.swing.JTextField custTextField;
    private javax.swing.JTable drugTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel patientIDLbl;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField txtSearchKeyWord;
    // End of variables declaration//GEN-END:variables
}
