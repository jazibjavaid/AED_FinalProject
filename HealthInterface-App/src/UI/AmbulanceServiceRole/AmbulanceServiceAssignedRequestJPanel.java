/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AmbulanceServiceRole;

import Business.AmbulanceDriver.AmbulanceDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.RegisteredUser.RegisteredUser;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import Business.WorkQueue.ServiceRequest;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yukta
 */
public class AmbulanceServiceAssignedRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerAssignDocJPanel
     */
     private UserAccount useraccount;
       private EcoSystem system;
       private Enterprise enterprise;
       private Organization organization;
       private JPanel userProcessContainer;
       private HealthRequest req;
    public AmbulanceServiceAssignedRequestJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system, Organization organization) {
        initComponents();
        this.useraccount=account;
        this.system=system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        SubmittedrequestsJTable.setRowHeight(25);
        SubmittedrequestsJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        populateRequestTable();
    }
     public class HeaderColor extends DefaultTableCellRenderer {
        public HeaderColor() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);         
           setBackground(new java.awt.Color(18,102,153));
            return this;
        }
    }
  public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) SubmittedrequestsJTable.getModel();
        model.setRowCount(0);
       
            AmbulanceDriver ambDriver = organization.getAmbulanceDriverDir().findAmbulanceProvider(useraccount.getUsername());
           for(ServiceRequest serReq : ambDriver.getServiceRequestDirectory().getServiceRequestList()){
            Object[] row = new Object[6];
               RegisteredUser user = serReq.getUser();
            row[0] = serReq;
            row[1] = user.getName();
            row[2] = user.getContactNumber();
            row[3] = user.getAddress();
            row[4] = user.getZipcode();
            row[5] = serReq.getStatus();
            model.addRow(row);

       }
           
   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DoctorScrollPane = new javax.swing.JScrollPane();
        SubmittedrequestsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Approved = new javax.swing.JButton();
        completed = new javax.swing.JButton();
        inqueue = new javax.swing.JButton();
        decline = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        SubmittedrequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Patient's Name", "Contact Number", "Address", "Zipcode", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SubmittedrequestsJTable.setRequestFocusEnabled(false);
        SubmittedrequestsJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(SubmittedrequestsJTable);

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel1.setText("User's Requests");

        Approved.setBackground(new java.awt.Color(18, 102, 153));
        Approved.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        Approved.setText("Accepted");
        Approved.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Approved.setContentAreaFilled(false);
        Approved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ApprovedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ApprovedMouseExited(evt);
            }
        });
        Approved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApprovedActionPerformed(evt);
            }
        });

        completed.setBackground(new java.awt.Color(18, 102, 153));
        completed.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        completed.setText("Completed");
        completed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        completed.setContentAreaFilled(false);
        completed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                completedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                completedMouseExited(evt);
            }
        });
        completed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedActionPerformed(evt);
            }
        });

        inqueue.setBackground(new java.awt.Color(18, 102, 153));
        inqueue.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        inqueue.setText("In queue");
        inqueue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inqueue.setContentAreaFilled(false);
        inqueue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inqueueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inqueueMouseExited(evt);
            }
        });
        inqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inqueueActionPerformed(evt);
            }
        });

        decline.setBackground(new java.awt.Color(18, 102, 153));
        decline.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        decline.setText("Decline");
        decline.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        decline.setContentAreaFilled(false);
        decline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                declineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                declineMouseExited(evt);
            }
        });
        decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Approved, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(completed, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inqueue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(decline, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Approved, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completed, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inqueue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decline, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApprovedActionPerformed
        // TODO add your handling code here:
        int row = SubmittedrequestsJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ServiceRequest serReq=(ServiceRequest)SubmittedrequestsJTable.getValueAt(row, 0);
        if(serReq.getStatus().equalsIgnoreCase("On the way") || serReq.getStatus().equalsIgnoreCase("completed") || serReq.getStatus().equalsIgnoreCase("in waiting list") || serReq.getStatus().equalsIgnoreCase("Declined") || serReq.getStatus().equalsIgnoreCase("cancelled")){
         JOptionPane.showMessageDialog(null, "Ambulance already marked "+ serReq.getStatus());
        }else{
            serReq.setStatus("On the way");
        JOptionPane.showMessageDialog(null, "Ambulance marked on the way");
        populateRequestTable();
        }
        

    }//GEN-LAST:event_ApprovedActionPerformed

    private void completedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completedActionPerformed
        // TODO add your handling code here:
        int row = SubmittedrequestsJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ServiceRequest serReq=(ServiceRequest)SubmittedrequestsJTable.getValueAt(row, 0);
        if(serReq.getStatus().equalsIgnoreCase("completed") || serReq.getStatus().equalsIgnoreCase("in waiting list") || serReq.getStatus().equalsIgnoreCase("Declined") || serReq.getStatus().equalsIgnoreCase("cancelled")){
            JOptionPane.showMessageDialog(null, "Ambulance already marked "+ serReq.getStatus());
        }else{
        serReq.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Ambulance request marked completed");
        populateRequestTable();

        }
        
    }//GEN-LAST:event_completedActionPerformed

    private void inqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inqueueActionPerformed
        // TODO add your handling code here:
        int row = SubmittedrequestsJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ServiceRequest serReq=(ServiceRequest)SubmittedrequestsJTable.getValueAt(row, 0);
        if(serReq.getStatus().equalsIgnoreCase("On the way") || serReq.getStatus().equalsIgnoreCase("in waiting list") || serReq.getStatus().equalsIgnoreCase("Declined") || serReq.getStatus().equalsIgnoreCase("cancelled")){
        JOptionPane.showMessageDialog(null, "Ambulance already marked "+ serReq.getStatus());
        } else{
         serReq.setStatus("in waiting list");
        JOptionPane.showMessageDialog(null, "Ambulance request is i wait list");
        populateRequestTable();
        }
       
    }//GEN-LAST:event_inqueueActionPerformed

    private void declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineActionPerformed
        // TODO add your handling code here:
        int row = SubmittedrequestsJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ServiceRequest serReq=(ServiceRequest)SubmittedrequestsJTable.getValueAt(row, 0);
        if(serReq.getStatus().equalsIgnoreCase("cancelled") || serReq.getStatus().equalsIgnoreCase("declined")){
            JOptionPane.showMessageDialog(null, "Ambulance already marked "+ serReq.getStatus());
        } else{
        serReq.setStatus("Declined");
        JOptionPane.showMessageDialog(null, "Ambulance request declined");
        populateRequestTable();
        }
        
    }//GEN-LAST:event_declineActionPerformed

    private void ApprovedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApprovedMouseEntered
        // TODO add your handling code here:
          Approved.setBackground(new java.awt.Color(18,102,153));
        Approved.setContentAreaFilled(true);
        Approved.setFocusPainted(true);
        Approved.setBorderPainted(false);
        Approved.setOpaque(true);
    }//GEN-LAST:event_ApprovedMouseEntered

    private void ApprovedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApprovedMouseExited
        // TODO add your handling code here:
        Approved.setContentAreaFilled(false);
        Approved.setFocusPainted(false);
        Approved.setBorderPainted(true);
    }//GEN-LAST:event_ApprovedMouseExited

    private void completedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedMouseEntered
        // TODO add your handling code here:
          completed.setBackground(new java.awt.Color(18,102,153));
        completed.setContentAreaFilled(true);
        completed.setFocusPainted(true);
        completed.setBorderPainted(false);
        completed.setOpaque(true);
    }//GEN-LAST:event_completedMouseEntered

    private void completedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedMouseExited
        // TODO add your handling code here:
         completed.setContentAreaFilled(false);
        completed.setFocusPainted(false);
        completed.setBorderPainted(true);
    }//GEN-LAST:event_completedMouseExited

    private void inqueueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inqueueMouseEntered
        // TODO add your handling code here:
          inqueue.setBackground(new java.awt.Color(18,102,153));
        inqueue.setContentAreaFilled(true);
        inqueue.setFocusPainted(true);
        inqueue.setBorderPainted(false);
        inqueue.setOpaque(true);
    }//GEN-LAST:event_inqueueMouseEntered

    private void inqueueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inqueueMouseExited
        // TODO add your handling code here:
           inqueue.setContentAreaFilled(false);
        inqueue.setFocusPainted(false);
        inqueue.setBorderPainted(true);
    }//GEN-LAST:event_inqueueMouseExited

    private void declineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineMouseEntered
        // TODO add your handling code here:
          decline.setBackground(new java.awt.Color(18,102,153));
        decline.setContentAreaFilled(true);
        decline.setFocusPainted(true);
        decline.setBorderPainted(false);
        decline.setOpaque(true);
    }//GEN-LAST:event_declineMouseEntered

    private void declineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineMouseExited
        // TODO add your handling code here:
             decline.setContentAreaFilled(false);
        decline.setFocusPainted(false);
        decline.setBorderPainted(true);
    }//GEN-LAST:event_declineMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Approved;
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable SubmittedrequestsJTable;
    private javax.swing.JButton completed;
    private javax.swing.JButton decline;
    private javax.swing.JButton inqueue;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
