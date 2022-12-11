/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.PatientManager.PatientManager;
import Business.UserAccount.UserAccount;
import Business.WorkProcess.HealthRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import UI.NurseRole.ManageNurseProfile;
import UI.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author shantanutyagi
 */
public class PatientManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalEntAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization org;
    EcoSystem system;

    public PatientManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.org = org;
        this.system = system;
        ManagePatientManagerProfileJPanel profileJPanel = new ManagePatientManagerProfileJPanel(workAreaJPanel, enterprise, useraccount, system);
        workAreaJPanel.add("cabServiceDashboard", profileJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(253, 135, 124));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(253, 217, 204));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAmbulance_JPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAmbulance = new javax.swing.JLabel();
        btnProfile_Panel = new javax.swing.JPanel();
        btnProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAllRequest_JPanel = new javax.swing.JPanel();
        btnAllRequests = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAssignedRequest_JPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnAssignedRequest = new javax.swing.JLabel();
        btnNotifications_JPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnNotification = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 217, 208));

        btnAmbulance_JPanel.setBackground(new java.awt.Color(253, 217, 204));
        btnAmbulance_JPanel.setToolTipText("");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/ambulance.png"))); // NOI18N

        btnAmbulance.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAmbulance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAmbulance.setText("Manage Ambulance Booking");
        btnAmbulance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAmbulanceMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnAmbulance_JPanelLayout = new javax.swing.GroupLayout(btnAmbulance_JPanel);
        btnAmbulance_JPanel.setLayout(btnAmbulance_JPanelLayout);
        btnAmbulance_JPanelLayout.setHorizontalGroup(
            btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAmbulance_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnAmbulance_JPanelLayout.setVerticalGroup(
            btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAmbulance_JPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProfile_Panel.setBackground(new java.awt.Color(253, 135, 124));
        btnProfile_Panel.setToolTipText("");

        btnProfile.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProfile.setText("Manage Profile");
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProfileMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/userp.png"))); // NOI18N

        javax.swing.GroupLayout btnProfile_PanelLayout = new javax.swing.GroupLayout(btnProfile_Panel);
        btnProfile_Panel.setLayout(btnProfile_PanelLayout);
        btnProfile_PanelLayout.setHorizontalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProfile_PanelLayout.setVerticalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnAllRequest_JPanel.setBackground(new java.awt.Color(253, 217, 204));
        btnAllRequest_JPanel.setToolTipText("");
        btnAllRequest_JPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAllRequest_JPanelMousePressed(evt);
            }
        });

        btnAllRequests.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAllRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAllRequests.setText("View All Requests");
        btnAllRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAllRequestsMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/requests.png"))); // NOI18N

        javax.swing.GroupLayout btnAllRequest_JPanelLayout = new javax.swing.GroupLayout(btnAllRequest_JPanel);
        btnAllRequest_JPanel.setLayout(btnAllRequest_JPanelLayout);
        btnAllRequest_JPanelLayout.setHorizontalGroup(
            btnAllRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAllRequest_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAllRequests)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAllRequest_JPanelLayout.setVerticalGroup(
            btnAllRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAllRequest_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAllRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAssignedRequest_JPanel.setBackground(new java.awt.Color(253, 217, 204));
        btnAssignedRequest_JPanel.setToolTipText("");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/doc1.png"))); // NOI18N

        btnAssignedRequest.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAssignedRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAssignedRequest.setText("Assign Doctor Requests");
        btnAssignedRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAssignedRequestMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnAssignedRequest_JPanelLayout = new javax.swing.GroupLayout(btnAssignedRequest_JPanel);
        btnAssignedRequest_JPanel.setLayout(btnAssignedRequest_JPanelLayout);
        btnAssignedRequest_JPanelLayout.setHorizontalGroup(
            btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAssignedRequest_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignedRequest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAssignedRequest_JPanelLayout.setVerticalGroup(
            btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAssignedRequest_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(btnAssignedRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNotifications_JPanel.setBackground(new java.awt.Color(253, 217, 204));
        btnNotifications_JPanel.setToolTipText("");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/nurse.png"))); // NOI18N

        btnNotification.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNotification.setText("Assign Nurse Requests");
        btnNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNotificationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnNotifications_JPanelLayout = new javax.swing.GroupLayout(btnNotifications_JPanel);
        btnNotifications_JPanel.setLayout(btnNotifications_JPanelLayout);
        btnNotifications_JPanelLayout.setHorizontalGroup(
            btnNotifications_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNotifications_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotification)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnNotifications_JPanelLayout.setVerticalGroup(
            btnNotifications_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNotifications_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnNotifications_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(btnNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font(".SF NS Text", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/bar.png"))); // NOI18N
        jButton1.setText("Analytics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnProfile_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAllRequest_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAmbulance_JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNotifications_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAssignedRequest_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnProfile_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAllRequest_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAmbulance_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignedRequest_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotifications_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 250, 910));

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1180, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmbulanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmbulanceMousePressed
        // TODO add your handling code here:
        setColor(btnAmbulance_JPanel);
        resetColor(btnAllRequest_JPanel);
        resetColor(btnProfile_Panel);
        resetColor(btnNotifications_JPanel);
        resetColor(btnAssignedRequest_JPanel);

        ManageAmbulanceBookingPMJPanel viewAssignedRequests = new ManageAmbulanceBookingPMJPanel(workAreaJPanel, enterprise, useraccount, system, org);
        workAreaJPanel.add("viewAllRequestJPanel", viewAssignedRequests);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAmbulanceMousePressed

    private void btnProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMousePressed
        // TODO add your handling code here:
        setColor(btnProfile_Panel);
        resetColor(btnAmbulance_JPanel);
        resetColor(btnAllRequest_JPanel);
        resetColor(btnNotifications_JPanel);
        resetColor(btnAssignedRequest_JPanel);
        ManagePatientManagerProfileJPanel managepManagerProfileJPanel = new ManagePatientManagerProfileJPanel(workAreaJPanel, enterprise, useraccount, system);
        workAreaJPanel.add("PatientManagerProfileJPanel", managepManagerProfileJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnProfileMousePressed

    private void btnAllRequestsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllRequestsMousePressed
        // TODO add your handling code here:
        setColor(btnAllRequest_JPanel);
        resetColor(btnAmbulance_JPanel);
        resetColor(btnProfile_Panel);
        resetColor(btnNotifications_JPanel);
        resetColor(btnAssignedRequest_JPanel);
        PatientManagerAssignDocJPanel viewAllRequestJPanel = new PatientManagerAssignDocJPanel(workAreaJPanel, enterprise, useraccount, system, org);
        workAreaJPanel.add("viewAllRequestJPanel", viewAllRequestJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAllRequestsMousePressed

    private void btnAllRequest_JPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllRequest_JPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllRequest_JPanelMousePressed

    private void btnAssignedRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignedRequestMousePressed
        // TODO add your handling code here:
        setColor(btnAssignedRequest_JPanel);
        resetColor(btnAmbulance_JPanel);
        resetColor(btnAllRequest_JPanel);
        resetColor(btnProfile_Panel);
        resetColor(btnNotifications_JPanel);
        PatientManagerAssignedRequests viewAssignedRequests = new PatientManagerAssignedRequests(workAreaJPanel, enterprise, useraccount, system, org);
        workAreaJPanel.add("viewAllRequestJPanel", viewAssignedRequests);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAssignedRequestMousePressed

    private void btnNotificationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotificationMousePressed
        // TODO add your handling code here:
        setColor(btnNotifications_JPanel);
        resetColor(btnAmbulance_JPanel);
        resetColor(btnAllRequest_JPanel);
        resetColor(btnProfile_Panel);
        resetColor(btnAssignedRequest_JPanel);
        NotificationRequestJPanel viewAssignedRequests = new NotificationRequestJPanel(workAreaJPanel, enterprise, useraccount, system, org);
        workAreaJPanel.add("viewAllRequestJPanel", viewAssignedRequests);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnNotificationMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AnalyticsJPanel healthRequest = new AnalyticsJPanel(userProcessContainer, enterprise, useraccount, system, org);
        userProcessContainer.add("PatientManagerProfileJPanel", healthRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAllRequest_JPanel;
    private javax.swing.JLabel btnAllRequests;
    private javax.swing.JLabel btnAmbulance;
    private javax.swing.JPanel btnAmbulance_JPanel;
    private javax.swing.JLabel btnAssignedRequest;
    private javax.swing.JPanel btnAssignedRequest_JPanel;
    private javax.swing.JLabel btnNotification;
    private javax.swing.JPanel btnNotifications_JPanel;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JPanel btnProfile_Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
