/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.OrphanageOrganization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.Beneficiary.Orphanage.OrphanageAdminWorkAreaJPanel;


/**
 *
 * @author raunak
 */
public class OrphanageAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        return new OrphanageAdminWorkAreaJPanel(userProcessContainer,account,(OrphanageOrganization) organization,enterprise,network,cNetwork,business);
    }
    
    @Override
    public String toString(){
        return RoleType.OrphanageAdmin.getValue();
    }

   
}
