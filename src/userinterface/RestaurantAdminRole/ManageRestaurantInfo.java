/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nidhitiwari
 */
public class ManageRestaurantInfo extends javax.swing.JPanel {
    
    EcoSystem business;
    JPanel userProcessContainer;
    UserAccount account;
    /**
     * Creates new form ManageRestaurantInfo
     */
    public ManageRestaurantInfo(JPanel userProcessContainer,UserAccount account, EcoSystem business) {
        initComponents();
        this.account=account;
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        txtRestaurantName.setEnabled(false);
        txtRestaurantContact.setEnabled(false);
        txtRestaurantAddress.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        updateInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtRestaurantName = new javax.swing.JTextField();
        txtRestaurantContact = new javax.swing.JTextField();
        txtRestaurantAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel1.setText("Manage Restaurant Info");

        jLabel2.setText("Restaurant Name");

        jLabel3.setText("Contact Number");

        jLabel4.setText("Restaurant Address");

        btnUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtRestaurantContact)
                            .addComponent(txtRestaurantAddress)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRestaurantContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        txtRestaurantName.setEnabled(true);
        txtRestaurantContact.setEnabled(true);
        txtRestaurantAddress.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    private void updateInfo() {
        for(Restaurant rest:business.getRestaurantDirectory().getRestaurantList()){
           if(rest.getAdminUserName().equals(account.getUsername())){
               txtRestaurantName.setText(rest.getRestaurantName());
               txtRestaurantContact.setText(rest.getRestaurantAddress());
               txtRestaurantAddress.setText(rest.getRestaurantContact());
            }         
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name=txtRestaurantName.getText();
        String number=txtRestaurantContact.getText();
        String address=txtRestaurantAddress.getText();
        
        Pattern pattern = Pattern.compile("^[a-zA-Z'\\-\\s]+$");
              
        try {
             if(name==null || name.isEmpty()){
                 
                throw new NullPointerException("Name cannot be empty");
                
                
            } else if (pattern.matcher(name).find() == false){
                
                throw new Exception("Please enter valid  Name");
                
            }
        } catch(NullPointerException e){
            
            JOptionPane.showMessageDialog(null, "Name is empty");
           
            return;
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Name is invalid");
       
            return;
        }

        try {

            if(number==null || number.isEmpty()){
                throw new NullPointerException("Phone umber field is Empty");
            }else if(Pattern.matches("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", number)==false){
                throw new Exception("Invalid Phone Number (Enter 10 Digits)");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Phone Number is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Phone Number is of invalid pattern");

            return;
        }
        
        try {
            if(address==null || address.isEmpty()){
                throw new NullPointerException("Address field is Empty");

            }else if(address.length()<5){
                throw new Exception("Please enter valid address ");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Address is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " Address is invalid");

            return;
        }

        for(Restaurant rest:business.getRestaurantDirectory().getRestaurantList()){
            if(rest.getAdminUserName().equals(account.getUsername())){
                business.getRestaurantDirectory().updateRestaurantInfo(rest,name, number, address);
            }

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtRestaurantContact;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables
}
