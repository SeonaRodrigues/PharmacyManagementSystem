/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Patient.Patient;
import model.inventory.Inventory;
import model.inventory.InventoryDAOImp;
import model.inventory.InventoryDirectory;
import model.store.StoreDAOImp;

/**
 *
 * @author nikethanann
 */
public class PatientProfile extends javax.swing.JPanel {

        JSplitPane splitPane;
        String storeName;
        String comm;
        Patient patient;
        String storeIdPurchased;
        String medicineSearched;

    public PatientProfile(JSplitPane splitPane, String storeName, String comm, Patient patient, String medicineName) {
        initComponents();
        this.splitPane = splitPane;
        this.storeName = storeName;
        this.comm = comm;
        this.patient = patient;
        this.medicineSearched = medicineName;

        storeNameDisplay.setText(storeName);
        commDisplay.setText(comm);
        patientIDDisplay.setText(patient.getName());
        populateTable(medicineSearched, this.storeName, this.comm);
        
    }
    
    public void populateTable(String medicineName, String storeName, String community){
        DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
        model.setRowCount(0);
        StoreDAOImp sDao = new StoreDAOImp();
        String storeId = sDao.getStoreId(storeName, community);
        this.storeIdPurchased = storeId;
        InventoryDirectory invDir = new InventoryDirectory();
        InventoryDAOImp invDao = new InventoryDAOImp();
        invDir = invDao.getByMedicineStoreId(medicineName, storeId);
        int count=1;
        for(Inventory inv: invDir.getInventoryDirectory()){
            Object[] row = new Object[4];
             row[0]=count;
             row[1]=inv;
             row[2]=inv.getDosage();
             row[3]=inv.getPrice();
             
             model.addRow(row);
            count++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientIDLbl = new javax.swing.JLabel();
        patientIDDisplay = new javax.swing.JLabel();
        storeNameDisplay = new javax.swing.JLabel();
        storeNameLbl = new javax.swing.JLabel();
        commDisplay = new javax.swing.JLabel();
        commLbl = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        ordersBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinesTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        checkoutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));

        patientIDLbl.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        patientIDLbl.setText("Patient ID:");

        patientIDDisplay.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        patientIDDisplay.setText("jLabel2");

        storeNameDisplay.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        storeNameDisplay.setText("jLabel2");

        storeNameLbl.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        storeNameLbl.setText("Store Name:");

        commDisplay.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        commDisplay.setText("jLabel2");

        commLbl.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        commLbl.setText("Community:");

        loginTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("STORE DETAILS");

        ordersBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        ordersBtn.setText("PAST ORDERS");
        ordersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersBtnActionPerformed(evt);
            }
        });

        medicinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S.no", "Medicine Name", "Dosage", "Price / qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medicinesTable);

        jLabel1.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        jLabel1.setText("Quantity:");

        checkoutBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        checkoutBtn.setText("CHECKOUT");
        checkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientIDLbl)
                                .addGap(5, 5, 5)
                                .addComponent(patientIDDisplay))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(storeNameLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(storeNameDisplay)
                                    .addGap(18, 18, 18)
                                    .addComponent(commLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(commDisplay)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ordersBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(5, 5, 5)
                                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(loginTitle)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(checkoutBtn)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(loginTitle)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientIDLbl)
                    .addComponent(patientIDDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeNameLbl)
                    .addComponent(storeNameDisplay)
                    .addComponent(commLbl)
                    .addComponent(commDisplay)
                    .addComponent(ordersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ordersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersBtnActionPerformed
        // TODO add your handling code here:
        PatientPastOrderScreen orderPanel = new PatientPastOrderScreen(splitPane,storeName,comm,patient, medicineSearched);
        splitPane.setBottomComponent(orderPanel);
    }//GEN-LAST:event_ordersBtnActionPerformed

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = medicinesTable.getSelectedRow();
        System.out.print("search---"+ selectedRowIndex);
        int quantity = (Integer) quantitySpinner.getValue();
        System.out.println("Quantity selected--"+ quantity);
        if(selectedRowIndex < 0){
             JOptionPane.showMessageDialog(this, "Please select a row to proceed.");
        } else if (quantity <=0){
            JOptionPane.showMessageDialog(this, "Please select the quantity to be purchased.");
            
        } else {
            DefaultTableModel table = (DefaultTableModel) medicinesTable.getModel();
            Inventory inv = (Inventory)table.getValueAt(selectedRowIndex, 1);
            System.out.println("inventory Details"+ inv.getMedicineID()+ inv.getMedicineName());
            PatientPurchaseScreens p = new PatientPurchaseScreens(splitPane, patient, inv,quantity, storeIdPurchased);
            splitPane.setBottomComponent(p);
        }
    }//GEN-LAST:event_checkoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JLabel commDisplay;
    private javax.swing.JLabel commLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JTable medicinesTable;
    private javax.swing.JButton ordersBtn;
    private javax.swing.JLabel patientIDDisplay;
    private javax.swing.JLabel patientIDLbl;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JLabel storeNameDisplay;
    private javax.swing.JLabel storeNameLbl;
    // End of variables declaration//GEN-END:variables

}