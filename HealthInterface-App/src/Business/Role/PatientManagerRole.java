/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.PatientManagerRole.PatientManagerWorkAreaJPanel;

/**
 *
 * @author jazibjavaid
 */
public class PatientManagerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
        return new PatientManagerWorkAreaJPanel(userProcessContainer, useraccount, org, enterprise, system);
    }
    
}
