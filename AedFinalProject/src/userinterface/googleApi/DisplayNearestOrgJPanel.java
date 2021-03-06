/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.googleApi;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.LatLong;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.CardLayout;
import javax.mail.SendFailedException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author pooji
 */
public class DisplayNearestOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomelessFoundJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    StateNetwork state;
    CountryNetwork country;
    EcoSystem system;
    final Browser browser;
     BrowserView view;
      LatLong latLong;
 //     ShelterWorkRequest request;
      Organization organization;
      boolean temp;
    public DisplayNearestOrgJPanel(JPanel userProcessContainer,UserAccount account,Organization organization, Enterprise enterprise,StateNetwork state,CountryNetwork country,EcoSystem system, LatLong latLong ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.enterprise=enterprise;
        this.state=state;
        this.country=country;
        this.system=system;
   //     this.request=request;
        this.organization= organization;
        temp=true;
//        System.out.println("userinterface.g()"+request.getLatLong().getLatitude());
        //lblImage.setIcon(request.getImage());
   this.latLong=latLong;
  
             browser = new Browser();
             view = new BrowserView(browser);
        //    browser.loadURL("https://www.google.com/maps");
            

                 browser.loadHTML("<html>\n" +
"<head>\n" +
"    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\"/>\n" +
"    <style type=\"text/css\">\n" +
"        html { height: 100% }\n" +
"        body { height: 100%; margin: 0; padding: 0 }\n" +
"        #map-canvas { height: 100% }\n" +
"    </style>\n" +
"    <script type=\"text/javascript\"\n" +
"            src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyB7J1zsErb9_7jxNu5KU5kIENFObAQEbl0&sensor=false\">\n" +
"    </script>\n" +
"    <script type=\"text/javascript\">\n" +
"      var map;\n" +
"      function initialize() {\n" +
"        var mapOptions = {\n" +
"          center: new google.maps.LatLng("+latLong.getLatitude()+","+latLong.getLongitude()+"),\n" +
"          zoom: 14\n" +
"        };\n" +
"        map = new google.maps.Map(document.getElementById(\"map-canvas\"),\n" +
"            mapOptions);\n" +
                    "var myLatlng = new google.maps.LatLng("+latLong.getLatitude()+","+latLong.getLongitude()+");\n" +
"               var marker = new google.maps.Marker({\n" +
"                   position: myLatlng,\n" +
"                   map: map,\n" +
"                   title: 'Hello'\n" +
"               });"+
"      }\n" +
"      google.maps.event.addDomListener(window, 'load', initialize);\n" +
"\n" +
"    </script>\n" +
"</head>\n" +
"<body>\n" +
"<div id=\"map-canvas\"></div>\n" +
"</body>\n" +
"</html>");
      
                  this.mapContainer.add(view,"a");
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
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        mapContainer = new javax.swing.JPanel();

        jSplitPane2.setDividerLocation(600);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, 30));

        confirmBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        jPanel1.add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 100, 40));

        jSplitPane2.setRightComponent(jPanel1);

        mapContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setLeftComponent(mapContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

          userProcessContainer.remove(this);         
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        JPanel j= account.getRole().createWorkArea(userProcessContainer, account,organization, enterprise, state, country, system);
        userProcessContainer.add("workarea1", j);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        if(organization.getEmployeeDirectory()!=(null))
        {
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            
            try {
                Validator.sendMessage(employee.getEmailId(),Validator.WILLING_TO_SERVE);
                JOptionPane.showMessageDialog(null, "Your arrival has been notified the Manager of this organization.");
            } catch (SendFailedException ex) {
               // Logger.getLogger(DisplayNearestOrgJPanel.class.getName()).log(Level.SEVERE, null, ex);
               return;
            }
        }
        }
    }//GEN-LAST:event_confirmBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel mapContainer;
    // End of variables declaration//GEN-END:variables
}
