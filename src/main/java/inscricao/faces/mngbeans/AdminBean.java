/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.mngbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1015591
 */
@Named
@RequestScoped
public class AdminBean extends PageBean {
    
    
    public String irCadastrar(){
        return "cadastro";
    }
    
    public String irLogin(){
        return "login";
    }
    
    
    
}
