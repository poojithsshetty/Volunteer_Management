/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.googleApi;

import Business.LatLong;
import com.teamdev.jxbrowser.chromium.Browser;

import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Beneficiary.BeneficiaryManageOrganizationJPanel;
import userinterface.EntityAdmin.EntityManageOrganizationJPanel;
import userinterface.Government.GovernmentManageOrganizationJPanel;
import userinterface.Logistics.LogisticsManageOrganizationJPanel;
import userinterface.SignUp.SignUpJPanel;

/**
 *
 * @author pooji
 */
public class OrganizationLocationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomelessFoundJPanel
     */
    JPanel userProcessContainer;

    Browser browser;
    BrowserView view;
    LatLong latLong;

    public OrganizationLocationJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        latLong = new LatLong();
        browser = new Browser();
        view = new BrowserView(browser);
        //Loading the google maps in jpanel
        browser.loadURL("https://www.google.com/maps");
        this.mapContainer.add(view, "a");
        this.mapContainer.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        mapContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLocation = new javax.swing.JButton();

        jSplitPane2.setDividerLocation(800);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mapContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setTopComponent(mapContainer);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLocation.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnLocation.setText("Set Location");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });
        jPanel1.add(btnLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jSplitPane2.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        // TODO add your handling code here:
        try {
            if (browser.getURL() != null) {
                //Splitting the url and taking the required value from browser URL
                String[] a = browser.getURL().split("!3d", 0);
                String[] b = a[1].split("!4d");
                double lat = Double.parseDouble(b[0]);
                double lon = Double.parseDouble(b[1]);
                latLong.setLatitude(lat);
                latLong.setLongitude(lon);
            }
            //Removing one userProcessContainer and checking which panel is the previous panel
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            //Populating the previous panel LatLong value from the value elected from the Map
            if (userProcessContainer.getComponent(componentArray.length - 1) instanceof SignUpJPanel) {
                SignUpJPanel eduRequestPanel = (SignUpJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                eduRequestPanel.populateLatLong(latLong);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof BeneficiaryManageOrganizationJPanel) {
                BeneficiaryManageOrganizationJPanel eduRequestPanel = (BeneficiaryManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                eduRequestPanel.populateLatLong(latLong);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof EntityManageOrganizationJPanel) {
                EntityManageOrganizationJPanel eduRequestPanel = (EntityManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                eduRequestPanel.populateLatLong(latLong);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof GovernmentManageOrganizationJPanel) {
                GovernmentManageOrganizationJPanel eduRequestPanel = (GovernmentManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                eduRequestPanel.populateLatLong(latLong);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof LogisticsManageOrganizationJPanel) {
                LogisticsManageOrganizationJPanel eduRequestPanel = (LogisticsManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                eduRequestPanel.populateLatLong(latLong);
            }

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Set Location first");
        }

    }//GEN-LAST:event_btnLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel mapContainer;
    // End of variables declaration//GEN-END:variables
}
