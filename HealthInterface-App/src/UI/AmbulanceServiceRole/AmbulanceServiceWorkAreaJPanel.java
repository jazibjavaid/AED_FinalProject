/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AmbulanceServiceRole;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


/**
 *
 * @author yukta
 */

public class AmbulanceServiceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalEntAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization org;
    EcoSystem system;
    public AmbulanceServiceWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
        try {
            initComponents();
            this.userProcessContainer=userProcessContainer;
            this.enterprise=enterprise;
            this.useraccount=useraccount;
            this.org=org;
            this.system=system;
            ManageAmbulanceServiceProfileJPanel profileJPanel = new ManageAmbulanceServiceProfileJPanel(workAreaJPanel,enterprise,useraccount,system);
            
            workAreaJPanel.add("adminDashboard", profileJPanel);
            CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
            layout.next(workAreaJPanel);
        } catch (ParseException ex) {
            Logger.getLogger(AmbulanceServiceWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(253,135,124));
    }
    
    void resetColor(JPanel panel){
         panel.setBackground(new Color(253,217,208));
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
        btnProfile_Panel = new javax.swing.JPanel();
        btnProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAssignedReq_JPanel = new javax.swing.JPanel();
        btnassignedRequests = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAddServices_JPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnAddServices = new javax.swing.JLabel();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 217, 208));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/userp.png"))); // NOI18N

        javax.swing.GroupLayout btnProfile_PanelLayout = new javax.swing.GroupLayout(btnProfile_Panel);
        btnProfile_Panel.setLayout(btnProfile_PanelLayout);
        btnProfile_PanelLayout.setHorizontalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProfile_PanelLayout.setVerticalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        btnAssignedReq_JPanel.setBackground(new java.awt.Color(253, 217, 208));
        btnAssignedReq_JPanel.setToolTipText("");
        btnAssignedReq_JPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAssignedReq_JPanelMousePressed(evt);
            }
        });

        btnassignedRequests.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnassignedRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnassignedRequests.setText("Manage Requests");
        btnassignedRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnassignedRequestsMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/requests.png"))); // NOI18N

        javax.swing.GroupLayout btnAssignedReq_JPanelLayout = new javax.swing.GroupLayout(btnAssignedReq_JPanel);
        btnAssignedReq_JPanel.setLayout(btnAssignedReq_JPanelLayout);
        btnAssignedReq_JPanelLayout.setHorizontalGroup(
            btnAssignedReq_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAssignedReq_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnassignedRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        btnAssignedReq_JPanelLayout.setVerticalGroup(
            btnAssignedReq_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAssignedReq_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAssignedReq_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnassignedRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAddServices_JPanel.setBackground(new java.awt.Color(253, 217, 208));
        btnAddServices_JPanel.setToolTipText("");

        btnAddServices.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAddServices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddServices.setText("Add Services");
        btnAddServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddServicesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnAddServices_JPanelLayout = new javax.swing.GroupLayout(btnAddServices_JPanel);
        btnAddServices_JPanel.setLayout(btnAddServices_JPanelLayout);
        btnAddServices_JPanelLayout.setHorizontalGroup(
            btnAddServices_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddServices_JPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddServices, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAddServices_JPanelLayout.setVerticalGroup(
            btnAddServices_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddServices_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAddServices_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddServices, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAddServices_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAssignedReq_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProfile_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnProfile_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAssignedReq_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAddServices_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 729, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 880));

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1180, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMousePressed
        // TODO add your handling code here:
        setColor(btnProfile_Panel);
        resetColor(btnAddServices_JPanel);
        resetColor(btnAssignedReq_JPanel);
        try {
            // TODO add your handling code here:
            ManageAmbulanceServiceProfileJPanel manageAmbProfile=new ManageAmbulanceServiceProfileJPanel(workAreaJPanel,enterprise,useraccount,system);
            workAreaJPanel.add("manageAmbProfile", manageAmbProfile);
            CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
            layout.next(workAreaJPanel);
        } 
        catch (ParseException ex) {
            Logger.getLogger(AmbulanceServiceWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProfileMousePressed

    private void btnassignedRequestsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnassignedRequestsMousePressed
        // TODO add your handling code here:
        setColor(btnAssignedReq_JPanel);
        resetColor(btnAddServices_JPanel);
        resetColor(btnProfile_Panel);
        AmbulanceServiceAssignedRequestJPanel ambulanceRequestAssigned=new AmbulanceServiceAssignedRequestJPanel(workAreaJPanel,enterprise,useraccount,system, org);
        workAreaJPanel.add("ambulanceRequestAssigned", ambulanceRequestAssigned);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnassignedRequestsMousePressed

    private void btnAssignedReq_JPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignedReq_JPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignedReq_JPanelMousePressed

    private void btnAddServicesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddServicesMousePressed
        // TODO add your handling code here:
        setColor(btnAddServices_JPanel);
        resetColor(btnAssignedReq_JPanel);
        resetColor(btnProfile_Panel);
        AddServicesJAreaPanel ambulanceServiceRequest=new AddServicesJAreaPanel(workAreaJPanel,enterprise,useraccount,system,org);
        workAreaJPanel.add("cabServiceRequest", ambulanceServiceRequest);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAddServicesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddServices;
    private javax.swing.JPanel btnAddServices_JPanel;
    private javax.swing.JPanel btnAssignedReq_JPanel;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JPanel btnProfile_Panel;
    private javax.swing.JLabel btnassignedRequests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
