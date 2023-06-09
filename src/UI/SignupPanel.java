/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import SMTPEmail.Email;
import static constants.EmailConnection.*;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.Patient.Patient;
import model.Patient.PatientDAOImp;
/**
 *
 * @author rodri
 */
public class SignupPanel extends javax.swing.JPanel {
   JSplitPane jSplitPane;
    String storeName;
    String comm;
    String medicineSearched;
    
    public SignupPanel(JSplitPane jSplitPane, String storeName, String comm, String medicineName) {
        initComponents();
        this.jSplitPane = jSplitPane;
        this.storeName = storeName;
        this.comm = comm;
        this.medicineSearched = medicineName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        nameTxtField = new javax.swing.JTextField();
        emailTxtField = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        contactTextField = new javax.swing.JTextField();
        contactTextField1 = new javax.swing.JTextField();
        contactLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        addressTxtField = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        loginTitle = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        contactLbl1 = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        userEmailLbl = new javax.swing.JLabel();
        userContactLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        addressErrorLbl = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(160, 213, 229));

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        nameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTxtFieldKeyReleased(evt);
            }
        });

        emailTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtFieldActionPerformed(evt);
            }
        });
        emailTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtFieldKeyReleased(evt);
            }
        });

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLbl.setText("Name:");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLbl.setText("Email:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add-user (1).png"))); // NOI18N

        signupBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        signupBtn.setText("SIGN-UP");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        contactTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        contactTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactTextFieldKeyReleased1(evt);
            }
        });

        contactTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextFieldActionPerformed(evt);
            }
        });
        contactTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactTextFieldKeyReleased(evt);
            }
        });

        contactLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactLbl.setText("Contact:");

        addressLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressLbl.setText("Address:");

        addressTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtFieldActionPerformed(evt);
            }
        });
        addressTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressTxtFieldKeyReleased(evt);
            }
        });

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLbl.setText("Password:");

        passwordTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTxtFieldKeyReleased(evt);
            }
        });

        loginTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("REGISTER");

        userNameLbl.setForeground(new java.awt.Color(255, 0, 0));

        contactLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactLbl1.setText("Age:");

        ageTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtFieldActionPerformed(evt);
            }
        });
        ageTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTxtFieldKeyReleased(evt);
            }
        });

        userEmailLbl.setForeground(new java.awt.Color(255, 0, 0));

        userContactLbl.setForeground(new java.awt.Color(255, 0, 0));

        ageLbl.setForeground(new java.awt.Color(255, 0, 0));

        passLbl.setForeground(new java.awt.Color(255, 0, 0));

        backBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addressErrorLbl.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 184, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(emailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addGap(45, 45, 45)
                                    .addComponent(emailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(contactLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addressErrorLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userNameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(userEmailLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userContactLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(190, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(passLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameLbl)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(userEmailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactLbl1)
                            .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userContactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressErrorLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressLbl)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:

        nameTxtField.setText("Enter UserName");
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void emailTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtFieldActionPerformed
        // TODO add your handling code here:
        emailTxtField.setText("Enter Password");
    }//GEN-LAST:event_emailTxtFieldActionPerformed

    private void contactTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextFieldActionPerformed

    private void addressTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtFieldActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
        String name = nameTxtField.getText();
        String email = emailTxtField.getText();
        String contact = contactTextField.getText();
        String address = addressTxtField.getText();
        String age = ageTxtField.getText();
        //i have done this
        String password = String.valueOf(passwordTxtField.getPassword());
        
        if (name.isEmpty() || email.isEmpty() ||
                contact.isEmpty() || address.isEmpty() ||
                password.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please Enter all fields");
        }
        else {
            
        //Generating Random 6 digit number as activation code
        Random rnd = new Random();
        int activationCode = rnd.nextInt(999999);
        String body = ACTIVATION_BODY + Integer.toString(activationCode);
        System.out.print("activationCode:"+ activationCode +"-------"+ body);
        
        Patient p = new Patient();
        p.setEmail(email);
        p.setName(name);
        p.setContactNo(contact);
        p.setAddress(address);
        p.setAge(Integer.parseInt(age));
        p.setPassword(password);
        PatientDAOImp pDao = new PatientDAOImp();
        boolean present = pDao.checkPatientAlreadyPresent(email);

            if(present){
                JOptionPane.showMessageDialog(this, "This email Id already exists.\nPlease try loging in or with a different email id.");
            } else {
                Email.sendEmail(email, ACTIVATION_SUBJECTLINE, body );
                //Need todo validation 6digit integer
                String userCode;
                userCode= JOptionPane.showInputDialog("Enter activation code");
                

                if (userCode.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Please enter activation code");
                }
                else {
                    pDao.add(p);
                    JOptionPane.showMessageDialog(this, "You have successfully signed up!");
                    LoginPanel goToLogin=new LoginPanel(jSplitPane,storeName,comm, medicineSearched);
                    jSplitPane.setBottomComponent(goToLogin);
                }
            }   
        }
        
        nameTxtField.setText("");
        emailTxtField.setText("");
        contactTextField.setText("");
        addressTxtField.setText("");
        passwordTxtField.setText("");
        ageTxtField.setText("");
    }//GEN-LAST:event_signupBtnActionPerformed

    //validation
    private void nameTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtFieldKeyReleased
        // TODO add your handling code here:
        String namePattern="^[a-zA-Z]+(?:[\\s.]+[a-zA-Z]+)*$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(nameTxtField.getText());
        if (!match.matches()) {
            userNameLbl.setText("Naming is incorrect");
        }
        else {
            
            userNameLbl.setText(null);
        }
    }//GEN-LAST:event_nameTxtFieldKeyReleased

    private void ageTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtFieldActionPerformed

    private void emailTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtFieldKeyReleased
        // TODO add your handling code here:
        //Todo need to chcek this
        
        String namePattern="^[a-zA-Z]{3,30}[@][a-zA-Z]{0,9}[.][a-zA-Z]{3}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(emailTxtField.getText());
        if (!match.matches()) {
             userEmailLbl.setText("emailId is incorrect");
        }
        else {
             userEmailLbl.setText(null);
        }
    }//GEN-LAST:event_emailTxtFieldKeyReleased

    private void ageTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTxtFieldKeyReleased
        // TODO add your handling code here:
        String namePattern="^[0-9]{1,2}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(ageTxtField.getText());
        if (!match.matches()) {
             ageLbl.setText("Age should be int");
        }
        else {
             ageLbl.setText(null);
        }
    }//GEN-LAST:event_ageTxtFieldKeyReleased

    private void contactTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactTextFieldKeyReleased
        // TODO add your handling code here:
        String namePattern="^[0-9]{9}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(contactTextField.getText());
        if (!match.matches()) {
             userContactLbl.setText("Mobile number is incorrect");
        }
        else {
             userContactLbl.setText(null);
        }
  
    }//GEN-LAST:event_contactTextFieldKeyReleased

    private void passwordTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtFieldKeyReleased
        // TODO add your handling code here:
        
        String namePattern="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(passwordTxtField.getText());
        if (!match.matches()) {
             passLbl.setText("Invalid password! length should be 8 and one uppercase,lowercases,special chars and integers needed");
        }
        else {
             passLbl.setText(null);
        }
    }//GEN-LAST:event_passwordTxtFieldKeyReleased

    private void contactTextFieldKeyReleased1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactTextFieldKeyReleased1
        // TODO add your handling code here:
        String namePattern="^[0-9]{10}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(contactTextField.getText());
        if (!match.matches()) {
             userContactLbl.setText("Mobile number is incorrect");
        }
        else {
             userContactLbl.setText(null);
        }
    }//GEN-LAST:event_contactTextFieldKeyReleased1

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        PublicScreens goToAdmins = new PublicScreens(jSplitPane);
        jSplitPane.setBottomComponent(goToAdmins);
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void addressTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressTxtFieldKeyReleased
        // TODO add your handling code here:
         String namePattern="^[a-zA-Z]+(?:[\\s.]+[a-zA-Z]+)*$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(addressTxtField.getText());
        if (!match.matches()) {
            addressErrorLbl.setText("Naming is incorrect");
        }
        else {

            addressErrorLbl.setText(null);
        }
    }//GEN-LAST:event_addressTxtFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressErrorLbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel contactLbl;
    private javax.swing.JLabel contactLbl1;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JTextField contactTextField1;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel userContactLbl;
    private javax.swing.JLabel userEmailLbl;
    private javax.swing.JLabel userNameLbl;
    // End of variables declaration//GEN-END:variables
}
