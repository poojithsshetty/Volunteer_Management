/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.EntityAdmin.MNCAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.MNCOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.EntityAdmin.Education.EntityOrganizationManageEmployeeJPanel;

/**
 *
 * @author raunak
 */
public class MNCAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private MNCOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private StateNetwork state;
    private CountryNetwork country;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public MNCAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, MNCOrganization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.state = network;
        this.country = cNetwork;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("MNC Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 490, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(71, 79, 112));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 190, 70));

        enterpriseLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(71, 79, 112));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, 40));

        valueLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(71, 79, 112));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 130, 30));

        jButton1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(71, 79, 112));
        jButton1.setText("Manage Request");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 180, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1210, 860));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        EntityOrganizationManageEmployeeJPanel manageEmployeeJPanel = new EntityOrganizationManageEmployeeJPanel(userProcessContainer, account, organization, enterprise, state, country, business);
        userProcessContainer.add("EntityOrganizationManageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MNCRequestAreaJPanel RequestAreaJPanel = new MNCRequestAreaJPanel(userProcessContainer, account, organization, enterprise, state, country, business);
        userProcessContainer.add("MNCRequestAreaJPanel", RequestAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}