/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Beneficiary.Homeless;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EntityEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.EducationOrganization;
import Business.Organization.HomelessOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.MNCOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.Organization.TransportOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BeneficiaryWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author prashantreddy
 */
public class HomelessRequestHelpJPanel extends javax.swing.JPanel {
//private  BeneficiaryWorkRequest request;

    private JPanel userProcessContainer;
    private UserAccount account;
    private HomelessOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private StateNetwork state;
    private CountryNetwork country;

    /**
     * Creates new form RequestHelpJPanel
     */
    public HomelessRequestHelpJPanel(JPanel userProcessContainer, UserAccount account, HomelessOrganization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.state = network;
        this.country = cNetwork;
        carBtn.setVisible(false);
        busBtn.setVisible(false);
        vanBtn.setVisible(false);
        noOfVehText.setVisible(false);
        noVehLabel.setVisible(false);
        typeLabel.setVisible(false);
        addressText.setVisible(false);
        timeField.setVisible(false);
        timelabel.setVisible(false);
        addLabel.setVisible(false);
        jDateChooser1.setMinSelectableDate(new Date());
        lblValue.setText(organization.getName());
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        busBtn = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        noVolTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reqBtn = new javax.swing.JRadioButton();
        notReqBtn = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        noOfVehText = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        noVehLabel = new javax.swing.JLabel();
        reqComboBox = new javax.swing.JComboBox();
        typeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        carBtn = new javax.swing.JRadioButton();
        eventNameTextfield = new javax.swing.JTextField();
        vanBtn = new javax.swing.JRadioButton();
        timelabel = new javax.swing.JLabel();
        timeField = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblWarning = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(71, 79, 112));
        enterpriseLabel.setText("Organization :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 200, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 79, 112));
        jLabel7.setText("Event Details");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Request Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        buttonGroup1.add(busBtn);
        busBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        busBtn.setForeground(new java.awt.Color(71, 79, 112));
        busBtn.setText("Bus");
        add(busBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 470, 70, -1));

        detailTextArea.setColumns(20);
        detailTextArea.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        detailTextArea.setForeground(new java.awt.Color(71, 79, 112));
        detailTextArea.setRows(5);
        jScrollPane1.setViewportView(detailTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 232, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 79, 112));
        jLabel2.setText("Number of Volunteers Required");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 260, -1));

        noVolTextField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        noVolTextField.setForeground(new java.awt.Color(71, 79, 112));
        noVolTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noVolTextFieldKeyPressed(evt);
            }
        });
        add(noVolTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 126, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Logistics");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 120, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Event Date ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        buttonGroup2.add(reqBtn);
        reqBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        reqBtn.setForeground(new java.awt.Color(71, 79, 112));
        reqBtn.setText("Required");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 110, -1));

        buttonGroup2.add(notReqBtn);
        notReqBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        notReqBtn.setForeground(new java.awt.Color(71, 79, 112));
        notReqBtn.setText("Not Required");
        notReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notReqBtnActionPerformed(evt);
            }
        });
        add(notReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 150, -1));

        jButton1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(71, 79, 112));
        jButton1.setText("Request Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, 160, 50));

        noOfVehText.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        noOfVehText.setForeground(new java.awt.Color(71, 79, 112));
        noOfVehText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noOfVehTextKeyPressed(evt);
            }
        });
        add(noOfVehText, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 53, -1));

        btnBack.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(71, 79, 112));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, -1, 40));

        noVehLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        noVehLabel.setForeground(new java.awt.Color(71, 79, 112));
        noVehLabel.setText("Number Of Vehicles");
        add(noVehLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        reqComboBox.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        reqComboBox.setForeground(new java.awt.Color(71, 79, 112));
        add(reqComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 126, -1));

        typeLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(71, 79, 112));
        typeLabel.setText("Type of vehicle");
        add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 140, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("Event Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 130, -1));

        buttonGroup1.add(carBtn);
        carBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        carBtn.setForeground(new java.awt.Color(71, 79, 112));
        carBtn.setText("Car");
        add(carBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 80, -1));

        eventNameTextfield.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        eventNameTextfield.setForeground(new java.awt.Color(71, 79, 112));
        eventNameTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eventNameTextfieldFocusLost(evt);
            }
        });
        add(eventNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 126, -1));

        buttonGroup1.add(vanBtn);
        vanBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        vanBtn.setForeground(new java.awt.Color(71, 79, 112));
        vanBtn.setText("Mini Van");
        add(vanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 120, -1));

        timelabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        timelabel.setForeground(new java.awt.Color(240, 240, 240));
        timelabel.setText("Pickup Time");
        add(timelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 110, -1));

        timeField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        timeField.setForeground(new java.awt.Color(71, 79, 112));
        add(timeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 171, -1));

        addLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        addLabel.setForeground(new java.awt.Color(240, 240, 240));
        addLabel.setText("Pickup Address");
        add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 120, -1));

        addressText.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        addressText.setForeground(new java.awt.Color(71, 79, 112));
        add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 251, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 750, 260, -1));

        lblName.setForeground(new java.awt.Color(255, 0, 0));
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 130, -1));

        lblValue.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1300, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        // TODO add your handling code here:

        carBtn.setVisible(true);
        busBtn.setVisible(true);
        vanBtn.setVisible(true);
        noOfVehText.setVisible(true);
        noVehLabel.setVisible(true);
        typeLabel.setVisible(true);
        timelabel.setVisible(true);
        addLabel.setVisible(true);
        timeField.setVisible(true);
        addressText.setVisible(true);
    }//GEN-LAST:event_reqBtnActionPerformed

    private void notReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notReqBtnActionPerformed
        // TODO add your handling code here:
        carBtn.setVisible(false);
        busBtn.setVisible(false);
        vanBtn.setVisible(false);
        noOfVehText.setVisible(false);
        noVehLabel.setVisible(false);
        typeLabel.setVisible(false);
        timelabel.setVisible(false);
        addLabel.setVisible(false);
        timeField.setVisible(false);
        addressText.setVisible(false);
    }//GEN-LAST:event_notReqBtnActionPerformed

    public void populateComboBox() {
        reqComboBox.removeAllItems();
        reqComboBox.addItem(Organization.RequestType.Education);
        reqComboBox.addItem(Organization.RequestType.Hospital);
        reqComboBox.addItem(Organization.RequestType.MNC);
        reqComboBox.addItem(Organization.RequestType.NGO);
        reqComboBox.addItem(Organization.RequestType.ANY);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Code to Raise Homeless Request 
        try {
            lblWarning.setText("");
            lblName.setText("");
            if (organization != null) {
                if (!reqComboBox.getSelectedItem().equals(null)) {
                    if (!(jDateChooser1.getDate() == null)) {
                        if (!eventNameTextfield.getText().isEmpty()) {
                            if (!detailTextArea.getText().isEmpty()) {
                                if (reqBtn.isSelected() || (notReqBtn.isSelected())) {
                                    if (!noVolTextField.getText().isEmpty()) {

                                        try {

                                            Organization.RequestType request = (Organization.RequestType) reqComboBox.getSelectedItem();
                                            int noVolunteer = Integer.parseInt(noVolTextField.getText());
                                            Date date = jDateChooser1.getDate();
                                            String eventName = eventNameTextfield.getText();
                                            String eventDetails = detailTextArea.getText();

                                            BeneficiaryWorkRequest requests = new BeneficiaryWorkRequest();
                                            requests.setEventDate(date);
                                            requests.setSenderOrganization(organization);
                                            requests.setRequestType(request);
                                            requests.setEventName(eventName);
                                            requests.setEventDetails(eventDetails);
                                            requests.setNumberOfVolunteersRequest(noVolunteer);

                                            requests.setSender(account);
                                            requests.setStatus("Requested");
                                            if (reqBtn.isSelected()) {
                                                if (!noOfVehText.getText().isEmpty()) {
                                                    if (!timeField.getText().isEmpty()) {
                                                        if (!addressText.getText().isEmpty()) {
                                                            if (carBtn.isSelected() || vanBtn.isSelected() || busBtn.isSelected()) {
                                                                SimpleDateFormat times = new SimpleDateFormat("hh:mm");
                                                                int no = Integer.parseInt(noOfVehText.getText());
                                                                Date time = times.parse(timeField.getText());
                                                                String address = addressText.getText();
                                                                requests.setLogisticRequest(false);
                                                                if (carBtn.isSelected()) {
                                                                    requests.setTypeOfVehicle("Car");

                                                                } else if (vanBtn.isSelected()) {
                                                                    requests.setTypeOfVehicle("Van");
                                                                } else if (busBtn.isSelected()) {
                                                                    requests.setTypeOfVehicle("Bus");
                                                                }
                                                                requests.setNoOfVehicle(no);
                                                                requests.setPickupTime(time);
                                                                requests.setAddress(address);
                                                            } else {
                                                                JOptionPane.showMessageDialog(null, "Please Select the type of vehicle");
                                                                return;
                                                            }
                                                        } else {
                                                            JOptionPane.showMessageDialog(null, "Please Enter Integer Value for address");
                                                            return;
                                                        }
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Please Enter Pick Up time");
                                                        return;
                                                    }

                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Please Enter Integer Value for Number of Vehicles required");
                                                    return;
                                                }
                                            }
                                            if (!requests.isLogisticRequest()) {
                                                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                                        if (organization1 instanceof TransportOrganization) {
                                                            System.out.println("sending to transport");
                                                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                                                        }
                                                    }
                                                }
                                            }
                                            System.out.println("type is" + request);
                                            if (request == Organization.RequestType.ANY) {
                                                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                                    if (enter instanceof EntityEnterprise) {
                                                        enter.getWorkQueue().getWorkRequestList().add(requests);
                                                    }
                                                }
                                            } else if (request == Organization.RequestType.Education) {
                                                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                                        if (organization1 instanceof EducationOrganization) {
                                                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                                                        }
                                                    }
                                                }
                                            } else if (request == Organization.RequestType.Hospital) {
                                                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                                        if (organization1 instanceof HospitalOrganization) {
                                                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                                                        }
                                                    }
                                                }
                                            } else if (request == Organization.RequestType.MNC) {
                                                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                                        if (organization1 instanceof MNCOrganization) {
                                                            System.out.println("userinterface MNC");
                                                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                                                        }
                                                    }
                                                }
                                            } else if (request == Organization.RequestType.NGO) {
                                                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                                        if (organization1 instanceof NGOOrganization) {

                                                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                                                        }
                                                    }
                                                }
                                            }
                                            organization.getWorkQueue().getWorkRequestList().add(requests);
                                            JOptionPane.showMessageDialog(null, "Help request complete");
                                            eventNameTextfield.setText("");
                                            noVolTextField.setText("");
                                            detailTextArea.setText("");
                                            jDateChooser1.setOpaque(true);
                                            buttonGroup1.clearSelection();
                                            buttonGroup2.clearSelection();
                                            noOfVehText.setText("");
                                            timeField.setText("");
                                            addressText.setText("");
                                            carBtn.setVisible(false);
                                            busBtn.setVisible(false);
                                            vanBtn.setVisible(false);
                                            noOfVehText.setVisible(false);
                                            noVehLabel.setVisible(false);
                                            typeLabel.setVisible(false);
                                            timelabel.setVisible(false);
                                            addLabel.setVisible(false);
                                            timeField.setVisible(false);
                                            addressText.setVisible(false);
                                            jDateChooser1.setDate(null);

                                        } catch (NumberFormatException p) {
                                            JOptionPane.showMessageDialog(null, "Enter integer value ");
                                        } catch (ParseException e) {
                                            JOptionPane.showMessageDialog(null, "Please enter time in hh:mm format");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Please Enter Integer Value for Number of Volunteers");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Please Select whether logistics is required or not");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Please Enter Description for the request");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please mention the event name");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Select a Date");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please Select the request type from the combo box");
                }
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact-- poojithsshetty@gmail.com");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        HomelessRequestWorkAreaJPanel homelessRequestPanel = (HomelessRequestWorkAreaJPanel) userProcessContainer.getComponent(componentArray.length - 1);
        homelessRequestPanel.populateWorkQueueTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void noVolTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noVolTextFieldKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, noVolTextField);
    }//GEN-LAST:event_noVolTextFieldKeyPressed

    private void noOfVehTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfVehTextKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, noOfVehText);
    }//GEN-LAST:event_noOfVehTextKeyPressed

    private void eventNameTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eventNameTextfieldFocusLost
        // TODO add your handling code here:
        if (!eventNameTextfield.getText().isEmpty()) {
            if (!Validator.validateName(eventNameTextfield.getText())) {
                lblName.setText("*Only Alphabets and Spaces are allowed");
                eventNameTextfield.setText("");
            } else {
                lblName.setText("");
            }
        }
    }//GEN-LAST:event_eventNameTextfieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton busBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton carBtn;
    private javax.swing.JTextArea detailTextArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField eventNameTextfield;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblValue;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTextField noOfVehText;
    private javax.swing.JLabel noVehLabel;
    private javax.swing.JTextField noVolTextField;
    private javax.swing.JRadioButton notReqBtn;
    private javax.swing.JRadioButton reqBtn;
    private javax.swing.JComboBox reqComboBox;
    private javax.swing.JTextField timeField;
    private javax.swing.JLabel timelabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JRadioButton vanBtn;
    // End of variables declaration//GEN-END:variables
}
