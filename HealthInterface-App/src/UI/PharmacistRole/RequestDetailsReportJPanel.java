/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PharmacistRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Pharmacist.Pharmacist;
import Business.UserAccount.UserAccount;
import Business.WorkProcess.HealthRequest;
import Business.WorkProcess.OrderMedicine;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shantanutyagi
 */
public class RequestDetailsReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacistRequestsReport
     */
    private ArrayList<String> comorbid;
    private UserAccount useraccount;
    private EcoSystem system;
    private HealthRequest request;
    private JPanel userProcessContainer;
    private Pharmacist pharmacist;
    private Enterprise enterprise;
    private DeliveryMan delMan;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

    public RequestDetailsReportJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, EcoSystem system, HealthRequest request, Pharmacist pharmacist) {
        initComponents();
        this.useraccount = account;
        this.system = system;
        this.request = request;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.pharmacist = pharmacist;
        populateprofile();
        populateTable();
        populateComboBox();
        medicinesRequestedtable.setRowHeight(25);
        medicinesRequestedtable.getTableHeader().setDefaultRenderer(new HeaderColor());
    }

    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            setBackground(new java.awt.Color(253, 217, 208));
            return this;
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblRequestNumber = new javax.swing.JLabel();
        lblPatientsName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        Addresslabel = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btnAssigndeliveryMan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicinesRequestedtable = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(217, 217, 217));

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabel2.setText("Request Number:");

        lblZipCode.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblZipCode.setText("Patients Name:");

        lblContactNo.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblContactNo.setText("Contact Number:");

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabel1.setText("Gender:");

        lblRequestNumber.setText("jLabel4");
        lblRequestNumber.setMaximumSize(new java.awt.Dimension(6, 20));
        lblRequestNumber.setMinimumSize(new java.awt.Dimension(6, 20));
        lblRequestNumber.setPreferredSize(new java.awt.Dimension(6, 20));

        lblPatientsName.setText("jLabel4");
        lblPatientsName.setMaximumSize(new java.awt.Dimension(6, 20));
        lblPatientsName.setMinimumSize(new java.awt.Dimension(6, 20));
        lblPatientsName.setPreferredSize(new java.awt.Dimension(6, 20));

        lblContact.setText("jLabel4");
        lblContact.setMaximumSize(new java.awt.Dimension(6, 20));
        lblContact.setMinimumSize(new java.awt.Dimension(6, 20));
        lblContact.setPreferredSize(new java.awt.Dimension(6, 20));

        lblGender.setText("jLabel4");
        lblGender.setMaximumSize(new java.awt.Dimension(6, 20));
        lblGender.setMinimumSize(new java.awt.Dimension(6, 20));
        lblGender.setPreferredSize(new java.awt.Dimension(6, 20));

        Addresslabel.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        Addresslabel.setText("Address");

        lblAddress.setText("jLabel4");
        lblAddress.setMaximumSize(new java.awt.Dimension(6, 20));
        lblAddress.setMinimumSize(new java.awt.Dimension(6, 20));
        lblAddress.setPreferredSize(new java.awt.Dimension(6, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Addresslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblRequestNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(lblPatientsName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRequestNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPatientsName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        btnAssigndeliveryMan.setBackground(new java.awt.Color(253, 135, 124));
        btnAssigndeliveryMan.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAssigndeliveryMan.setText("Complete order");
        btnAssigndeliveryMan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAssigndeliveryMan.setContentAreaFilled(false);
        btnAssigndeliveryMan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssigndeliveryManMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssigndeliveryManMouseExited(evt);
            }
        });
        btnAssigndeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigndeliveryManActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jLabel7.setText("Medicines requested");

        medicinesRequestedtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "OrderId", "Order Date", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(medicinesRequestedtable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssigndeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(306, 306, 306)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(254, 254, 254)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssigndeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssigndeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigndeliveryManActionPerformed
        // TODO add your handling code here:
        int row = medicinesRequestedtable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else 
        {
            OrderMedicine med = (OrderMedicine) medicinesRequestedtable.getValueAt(row, 0);
            if(med.getStatus().equalsIgnoreCase("completed") || med.getStatus().equalsIgnoreCase("Declined") || med.getStatus().equalsIgnoreCase("cancelled")){
            JOptionPane.showMessageDialog(null, "Order already marked "+ med.getStatus());
        }else{
            med.setStatus("Completed");
            JOptionPane.showMessageDialog(null, "Order request marked completed");
            populateTable();
        }
        }

    }//GEN-LAST:event_btnAssigndeliveryManActionPerformed

    private void btnAssigndeliveryManMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssigndeliveryManMouseEntered
        // TODO add your handling code here:
        btnAssigndeliveryMan.setBackground(new java.awt.Color(253, 135, 124));
        btnAssigndeliveryMan.setContentAreaFilled(true);
        btnAssigndeliveryMan.setFocusPainted(true);
        btnAssigndeliveryMan.setBorderPainted(false);
        btnAssigndeliveryMan.setOpaque(true);
    }//GEN-LAST:event_btnAssigndeliveryManMouseEntered

    private void btnAssigndeliveryManMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssigndeliveryManMouseExited
        // TODO add your handling code here:
        btnAssigndeliveryMan.setContentAreaFilled(false);
        btnAssigndeliveryMan.setFocusPainted(false);
        btnAssigndeliveryMan.setBorderPainted(true);
    }//GEN-LAST:event_btnAssigndeliveryManMouseExited

    private void populateprofile() {
        lblRequestNumber.setText(request.getRequestNumber());
        lblPatientsName.setText(request.getUser().getFullName());
        lblContact.setText(request.getUser().getContactNumber());
        lblGender.setText(request.getUser().getGender());
        lblAddress.setText(request.getUser().getAddress());

    }

    private void populateComboBox() {
//        deliveryManComboBox.removeAllItems();
//        for (Organization org : enterprise.getOrganizationDirectory().getOrgList()) {
//            if (org.getOrgType().getValue().equals("Delivery Provider Organization")) {
//                for (DeliveryMan dm : org.getDelManDir().getdeliveryManDirectory()) {
//                    deliveryManComboBox.addItem(dm);
//                }
//            }
//
//        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) medicinesRequestedtable.getModel();
        model.setRowCount(0);
        for (OrderMedicine med : request.getOrderDirectoryMed().getMedicineList()) {
            Object[] row = new Object[4];
            row[0] = med;
            row[1] = med.getOrderDate();
            row[2] = med.getStatus();
            row[3] = med.getDeliveryman();
            model.addRow(row);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addresslabel;
    private javax.swing.JButton btnAssigndeliveryMan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPatientsName;
    private javax.swing.JLabel lblRequestNumber;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable medicinesRequestedtable;
    // End of variables declaration//GEN-END:variables
}
