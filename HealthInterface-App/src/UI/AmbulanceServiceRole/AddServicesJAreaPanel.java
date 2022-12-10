/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AmbulanceServiceRole;


import Business.AmbulanceDriver.AmbulanceDriver;
import Business.AmbulanceDriver.AmbulanceService;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Validation.Validations;
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
public class AddServicesJAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private EcoSystem system;
    private AmbulanceDriver ambulanceProvider;
    private Organization org;
       
    public AddServicesJAreaPanel(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, EcoSystem system, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.org = org;
        ambulanceProvider=org.getAmbulanceDriverDir().findAmbulanceProvider(userAccount.getUsername());
        populateTestTable();
        ServiceTable.setRowHeight(25);
        ServiceTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        
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

    private void populateTestTable(){
        DefaultTableModel model = (DefaultTableModel) ServiceTable.getModel();
        
        model.setRowCount(0);
        for (AmbulanceService ambSer : ambulanceProvider.getAmbulanceServiceDirectory().getAmbulanceServiceList() ){          
            Object[] row = new Object[2];
            row[0] = ambSer;
            row[1] = ambSer.getServiceType();
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

        jPanel1 = new javax.swing.JPanel();
        DoctorScrollPane = new javax.swing.JScrollPane();
        ServiceTable = new javax.swing.JTable();
        lblDoctorslist1 = new javax.swing.JLabel();
        btnRemoveFoodSuppplier = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        ambulanceTypeCombobox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Service  Name", "Service Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ServiceTable.setRequestFocusEnabled(false);
        ServiceTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(ServiceTable);

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Ambulance Service");

        btnRemoveFoodSuppplier.setBackground(new java.awt.Color(253, 135, 124));
        btnRemoveFoodSuppplier.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnRemoveFoodSuppplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/delete2.png"))); // NOI18N
        btnRemoveFoodSuppplier.setText("Remove Service");
        btnRemoveFoodSuppplier.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRemoveFoodSuppplier.setContentAreaFilled(false);
        btnRemoveFoodSuppplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveFoodSuppplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveFoodSuppplierMouseExited(evt);
            }
        });
        btnRemoveFoodSuppplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFoodSuppplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDoctorslist1)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRemoveFoodSuppplier, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveFoodSuppplier)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, -1, 280));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Service Name");

        addJButton.setBackground(new java.awt.Color(253, 135, 124));
        addJButton.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/add2.png"))); // NOI18N
        addJButton.setText("Add Service");
        addJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addJButton.setContentAreaFilled(false);
        addJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addJButtonMouseExited(evt);
            }
        });
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        lblAddress.setText("Service Type:");

        ambulanceTypeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type-1", "Type-2", "Type-3" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblAddress)
                        .addGap(18, 18, 18)
                        .addComponent(ambulanceTypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 130, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress)
                    .addComponent(ambulanceTypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 720, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Validations validation=new Validations();       
        String packageName = txtName.getText();        
        String serviceType=ambulanceTypeCombobox.getSelectedItem().toString();
        if(packageName.equals("")||serviceType.equalsIgnoreCase("select")){
          JOptionPane.showMessageDialog(null, "Please enter service name", "Error!", JOptionPane.ERROR_MESSAGE);
          return;
        }
        else{
        AmbulanceService ambServce=new AmbulanceService(packageName,serviceType);       
        ambulanceProvider.getAmbulanceServiceDirectory().addService(ambServce);
        JOptionPane.showMessageDialog(null, "Ambulance Service added successfully!");
        }
          populateTestTable();
        
       
        

    }//GEN-LAST:event_addJButtonActionPerformed

    private void btnRemoveFoodSuppplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFoodSuppplierActionPerformed
        // TODO add your handling code here:
        int row = ServiceTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AmbulanceService ambulanceService=(AmbulanceService)ServiceTable.getValueAt(row, 0);
        ambulanceProvider.getAmbulanceServiceDirectory().removeService(ambulanceService);
        JOptionPane.showMessageDialog(null, "Ambulance Service removed successfully!");
        populateTestTable();
    }//GEN-LAST:event_btnRemoveFoodSuppplierActionPerformed

    private void btnRemoveFoodSuppplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveFoodSuppplierMouseEntered
        // TODO add your handling code here:
        btnRemoveFoodSuppplier.setBackground(new java.awt.Color(253,135,124));
        btnRemoveFoodSuppplier.setContentAreaFilled(true);
        btnRemoveFoodSuppplier.setFocusPainted(true);
        btnRemoveFoodSuppplier.setBorderPainted(false);
        btnRemoveFoodSuppplier.setOpaque(true);
        
    }//GEN-LAST:event_btnRemoveFoodSuppplierMouseEntered

    private void btnRemoveFoodSuppplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveFoodSuppplierMouseExited
        // TODO add your handling code here:
        btnRemoveFoodSuppplier.setContentAreaFilled(false);
        btnRemoveFoodSuppplier.setFocusPainted(false);
        btnRemoveFoodSuppplier.setBorderPainted(true);
       //  btnRemoveFoodSuppplier.setOpaque(false);
    }//GEN-LAST:event_btnRemoveFoodSuppplierMouseExited

    private void addJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseEntered
        // TODO add your handling code here:
         addJButton.setBackground(new java.awt.Color(253,135,124));
        addJButton.setContentAreaFilled(true);
        addJButton.setFocusPainted(true);
        addJButton.setBorderPainted(false);
        addJButton.setOpaque(true);
    }//GEN-LAST:event_addJButtonMouseEntered

    private void addJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseExited
        // TODO add your handling code here:
       addJButton.setContentAreaFilled(false);
        addJButton.setFocusPainted(false);
        addJButton.setBorderPainted(true);
    }//GEN-LAST:event_addJButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable ServiceTable;
    private javax.swing.JButton addJButton;
    private javax.swing.JComboBox<String> ambulanceTypeCombobox;
    private javax.swing.JButton btnRemoveFoodSuppplier;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
