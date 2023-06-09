/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Patient.Patient;
import model.inventory.Inventory;
import model.inventory.InventoryDAOImp;
import model.puchase.Purchase;
import model.puchase.PurchaseDAOImp;
import model.puchase.PurchaseDirectory;
import model.store.StoreDAOImp;
/**
 *
 * @author rodri
 */
public class PatientPastOrderScreen extends javax.swing.JPanel {
JSplitPane splitPane;
String storeName;
String comm;
Patient patient;
String medicineSearched;
    /**
     * Creates new form PatientPastOrderScreen
     */
    public PatientPastOrderScreen(JSplitPane splitPane, String storeName, String comm, Patient patient, String medicineName) {
         this.splitPane = splitPane;
        this.storeName = storeName;
        this.comm = comm;
        this.patient = patient;
        this.medicineSearched = medicineName;
        initComponents();
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pastOrderTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));

        loginTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("PAST ORDER HISTORY");

        patientIDLbl.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        patientIDLbl.setText("Patient name:");

        jLabel2.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setText(this.patient.getName());

        pastOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MedicineName", "Qty", "Status", "createdOn"
            }
        ));
        jScrollPane1.setViewportView(pastOrderTable);

        backBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientIDLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(backBtn))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDLbl)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(backBtn)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        PatientProfile allAdminPanel=new PatientProfile(splitPane,storeName,comm,patient, medicineSearched);
        splitPane.setBottomComponent(allAdminPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    
    public void populateTable(){
         DefaultTableModel model = (DefaultTableModel) pastOrderTable.getModel();
         model.setRowCount(0);
         PurchaseDAOImp pdao = new PurchaseDAOImp();
         PurchaseDirectory pDir = new PurchaseDirectory();
         pDir = pdao.pastOrder(patient.getEmail());

         for(Purchase p: pDir.getPurchaseDir()){
             InventoryDAOImp iDao = new InventoryDAOImp();
             Inventory i = iDao.getByMedicineID(p.getMedicinId());
             
             StoreDAOImp sDao = new StoreDAOImp();
             String storeName = sDao.getStoreName(p.getStoreId());
             
             
             Object[] row = new Object[4];
              row[0]=i.getMedicineName();
              row[1]=p.getQuantity();
              //row[2]= storeName;
              row[2]=p.getStatus();
              row[3] = p.getUpdateTime();
             
              model.addRow(row);
         }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JTable pastOrderTable;
    private javax.swing.JLabel patientIDLbl;
    // End of variables declaration//GEN-END:variables
}
