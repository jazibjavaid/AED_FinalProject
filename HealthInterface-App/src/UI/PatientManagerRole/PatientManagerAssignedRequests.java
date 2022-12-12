/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.PatientAdvisor.PatientManager;
import Business.UserAccount.UserAccount;
import Business.WorkProcess.HealthRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import UI.UserRole.HealthRequestReport;

/**
 *
 * @author jazibjavaid
 */
public class PatientManagerAssignedRequests extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerAssignDocJPanel
     */
        private UserAccount useraccount;
        private EcoSystem system;
        private PatientManager patientManager;
        private Enterprise enterprise;
        private Organization organization;
        private JPanel userProcessContainer;
        private HealthRequest req;
        public PatientManagerAssignedRequests(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system, Organization organization) {
        initComponents();
        this.useraccount=account;
        this.system=system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        String username = useraccount.getUsername();
        patientManager =organization.getpManagerDir().findPatientManager(username);
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
            setBackground(new java.awt.Color(253,217,208));
            return this;
        }
    }
    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) SubmittedrequestsJTable.getModel();
        model.setRowCount(0);
           for(HealthRequest req : patientManager.getRequestDirectory().getRequestList()){
            Object[] row = new Object[6];
            row[0] = req;
            row[1] = req.getUser().getName();
            row[2] = req.getDoctor()==null?"Not Assigned":req.getDoctor().getName();
            row[3] = req.getNurse()==null?"Not Assigned":req.getNurse().getName();
            row[4] = req.getHospital()==null?"Not Assigned": req.getHospital().getName();
            row[5] = req.getStatus();
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
        viewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        SubmittedrequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Requester's Name", "Doctor Assigned", "Nurse Assigned", "Hospital Assigned", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SubmittedrequestsJTable.setRequestFocusEnabled(false);
        SubmittedrequestsJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(SubmittedrequestsJTable);

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel1.setText("Assigned Requests");

        viewDetails.setBackground(new java.awt.Color(253, 135, 124));
        viewDetails.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        viewDetails.setText("View Details");
        viewDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewDetails.setContentAreaFilled(false);
        viewDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDetailsMouseExited(evt);
            }
        });
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = SubmittedrequestsJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        else{
            req = (HealthRequest)SubmittedrequestsJTable.getValueAt(selectedRow, 0);
            HealthRequestReport healthRequest=new HealthRequestReport(userProcessContainer,enterprise,useraccount,system, req, patientManager, "patManAssignedReq",organization);
            userProcessContainer.add("PatientManagerProfileJPanel", healthRequest);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_viewDetailsActionPerformed

    private void viewDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsMouseEntered
        // TODO add your handling code here:
        viewDetails.setBackground(new java.awt.Color(253,135,124));
        viewDetails.setContentAreaFilled(true);
        viewDetails.setFocusPainted(true);
        viewDetails.setBorderPainted(false);
        viewDetails.setOpaque(true);
    }//GEN-LAST:event_viewDetailsMouseEntered

    private void viewDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsMouseExited
        // TODO add your handling code here:
        viewDetails.setContentAreaFilled(false);
        viewDetails.setFocusPainted(false);
        viewDetails.setBorderPainted(true);
    }//GEN-LAST:event_viewDetailsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable SubmittedrequestsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
}
