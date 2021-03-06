/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.CountryAdminWorkAreas;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author raunak
 */
public class CountryAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    CountryNetwork cNetwork;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public CountryAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CountryNetwork cNetwork, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.cNetwork = cNetwork;
        // this.cNetwork=new CountryNetwork();
        populateTree();
    }

    public void populateTree() {
// Populating the JTree 
        DefaultTreeModel model = (DefaultTreeModel) JTree.getModel();
        ArrayList<StateNetwork> networkList = cNetwork.getStateList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        StateNetwork network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
// Populating Network in JTree
        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
// Populating Enterprise in JTree
            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
// Populating Organization in JTree
                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        manageNetworkJButton = new javax.swing.JButton();
        manageAdminJButton = new javax.swing.JButton();
        manageEnterpriseJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedNodeJLabel = new javax.swing.JLabel();
        btnDisease = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree = new javax.swing.JTree();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(150);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetworkJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageNetworkJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        manageNetworkJButton.setForeground(new java.awt.Color(71, 79, 112));
        manageNetworkJButton.setText("Manage Network");
        manageNetworkJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageNetworkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 240, 80));

        manageAdminJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageAdminJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        manageAdminJButton.setForeground(new java.awt.Color(71, 79, 112));
        manageAdminJButton.setText("Manage Enterprise Admin");
        manageAdminJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdminJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageAdminJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 240, 80));

        manageEnterpriseJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageEnterpriseJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        manageEnterpriseJButton.setForeground(new java.awt.Color(71, 79, 112));
        manageEnterpriseJButton.setText("Manage Enterprise");
        manageEnterpriseJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageEnterpriseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 230, 80));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Selected Node:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        selectedNodeJLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        selectedNodeJLabel.setForeground(new java.awt.Color(71, 79, 112));
        jPanel1.add(selectedNodeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        btnDisease.setBackground(new java.awt.Color(255, 255, 255));
        btnDisease.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnDisease.setForeground(new java.awt.Color(71, 79, 112));
        btnDisease.setText("Manage Request Catalog");
        btnDisease.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiseaseActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 230, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1050, 860));

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(71, 79, 112));

        JTree.setBackground(new java.awt.Color(204, 204, 204));
        JTree.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        JTree.setForeground(new java.awt.Color(71, 79, 112));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        JTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JTree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                valueChangedAction(evt);
            }
        });
        jScrollPane1.setViewportView(JTree);

        jPanel2.add(jScrollPane1);

        jSplitPane1.setLeftComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseJButtonActionPerformed

        if (!cNetwork.getStateList().isEmpty()) {

            ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, cNetwork, system);
            userProcessContainer.add("manageEnterpriseJPanel", manageEnterpriseJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Add State into the network");
        }

    }//GEN-LAST:event_manageEnterpriseJButtonActionPerformed

    private void manageAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdminJButtonActionPerformed
        // Manage Enterprise Admin 
        if(cNetwork.getStateList() != null){
        if (cNetwork.getStateList().size() > 0) {
                    ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, cNetwork, system);
                    userProcessContainer.add("manageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Add State into the network");
        }
        }
    }//GEN-LAST:event_manageAdminJButtonActionPerformed

    private void manageNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkJButtonActionPerformed
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, cNetwork, system);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkJButtonActionPerformed

    private void valueChangedAction(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_valueChangedAction
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) JTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedNodeJLabel.setText(selectedNode.toString());
        }

    }//GEN-LAST:event_valueChangedAction

    private void btnDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiseaseActionPerformed
        // TODO add your handling code here:
        CountryAdminRequestAreaJPanel manageNetworkJPanel = new CountryAdminRequestAreaJPanel(userProcessContainer, account, cNetwork, system);
        userProcessContainer.add("CountryAdminRequestAreaJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDiseaseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree;
    private javax.swing.JButton btnDisease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageAdminJButton;
    private javax.swing.JButton manageEnterpriseJButton;
    private javax.swing.JButton manageNetworkJButton;
    private javax.swing.JLabel selectedNodeJLabel;
    // End of variables declaration//GEN-END:variables
}
