/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author jazibjavaid
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount useraccount,Organization organization,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=system;
        ManageCityJPanel cityJPanel=new ManageCityJPanel(workAreaJPanel,ecosystem);
        workAreaJPanel.add("ManageCityJPanel", cityJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
        
    }

    void setColor(JPanel panel){
        panel.setBackground(new Color(253,135,124));
    }
    
    void resetColor(JPanel panel){
         panel.setBackground(new Color(253,218,207));
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
        btnEnterprisePanel = new javax.swing.JPanel();
        btnManageEnt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNetwork_Panel = new javax.swing.JPanel();
        btnNetwork = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEnterPriseAdmin_JPanel = new javax.swing.JPanel();
        btnEntAdmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 218, 207));

        btnEnterprisePanel.setBackground(new java.awt.Color(253, 218, 207));
        btnEnterprisePanel.setToolTipText("");
        btnEnterprisePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEnterprisePanelMousePressed(evt);
            }
        });

        btnManageEnt.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnManageEnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnManageEnt.setText("Manage Enterprise");
        btnManageEnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnManageEntMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/enterprise.png"))); // NOI18N

        javax.swing.GroupLayout btnEnterprisePanelLayout = new javax.swing.GroupLayout(btnEnterprisePanel);
        btnEnterprisePanel.setLayout(btnEnterprisePanelLayout);
        btnEnterprisePanelLayout.setHorizontalGroup(
            btnEnterprisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnterprisePanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEnterprisePanelLayout.setVerticalGroup(
            btnEnterprisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnterprisePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        btnNetwork_Panel.setBackground(new java.awt.Color(253, 135, 124));
        btnNetwork_Panel.setToolTipText("");

        btnNetwork.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNetwork.setText("Manage City");
        btnNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNetworkMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/network.png"))); // NOI18N

        javax.swing.GroupLayout btnNetwork_PanelLayout = new javax.swing.GroupLayout(btnNetwork_Panel);
        btnNetwork_Panel.setLayout(btnNetwork_PanelLayout);
        btnNetwork_PanelLayout.setHorizontalGroup(
            btnNetwork_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNetwork_PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnNetwork_PanelLayout.setVerticalGroup(
            btnNetwork_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNetwork_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnEnterPriseAdmin_JPanel.setBackground(new java.awt.Color(253, 218, 207));
        btnEnterPriseAdmin_JPanel.setToolTipText("");

        btnEntAdmin.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnEntAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntAdmin.setText("Manage Enterprise Admin");
        btnEntAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEntAdminMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/enterpriseAdmin.png"))); // NOI18N

        javax.swing.GroupLayout btnEnterPriseAdmin_JPanelLayout = new javax.swing.GroupLayout(btnEnterPriseAdmin_JPanel);
        btnEnterPriseAdmin_JPanel.setLayout(btnEnterPriseAdmin_JPanelLayout);
        btnEnterPriseAdmin_JPanelLayout.setHorizontalGroup(
            btnEnterPriseAdmin_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnterPriseAdmin_JPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        btnEnterPriseAdmin_JPanelLayout.setVerticalGroup(
            btnEnterPriseAdmin_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnterPriseAdmin_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnEnterPriseAdmin_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNetwork_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEnterprisePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEnterPriseAdmin_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnNetwork_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEnterprisePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEnterPriseAdmin_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(716, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 880));

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1130, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEntMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEntMousePressed
        // TODO add your handling code here:
    
        setColor(btnEnterprisePanel);
        resetColor(btnNetwork_Panel);
        resetColor(btnEnterPriseAdmin_JPanel);
        ManageEnterpriseJPanel enterpriseJPanel=new ManageEnterpriseJPanel(workAreaJPanel,ecosystem);
        workAreaJPanel.add("ManageEnterpriseJPanel", enterpriseJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnManageEntMousePressed

    private void btnEnterprisePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterprisePanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEnterprisePanelMousePressed

    private void btnNetworkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNetworkMousePressed
        // TODO add your handling code here:
        setColor(btnNetwork_Panel);
        resetColor(btnEnterprisePanel);
        resetColor(btnEnterPriseAdmin_JPanel);
        ManageCityJPanel cityJPanel=new ManageCityJPanel(workAreaJPanel,ecosystem);
        workAreaJPanel.add("ManageCityJPanel", cityJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnNetworkMousePressed

    private void btnEntAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntAdminMousePressed
        // TODO add your handling code here:
        setColor(btnEnterPriseAdmin_JPanel);
        resetColor(btnNetwork_Panel);
        resetColor(btnEnterprisePanel);
        ManageEnterpriseAdminJPanel enterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(workAreaJPanel,ecosystem);
        workAreaJPanel.add("ManageEnterpriseAdminJPanel", enterpriseAdminJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnEntAdminMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEntAdmin;
    private javax.swing.JPanel btnEnterPriseAdmin_JPanel;
    private javax.swing.JPanel btnEnterprisePanel;
    private javax.swing.JLabel btnManageEnt;
    private javax.swing.JLabel btnNetwork;
    private javax.swing.JPanel btnNetwork_Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
