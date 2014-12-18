/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Usuario;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;
import javax.inject.Named;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1015591
 */
@Named
@SessionScoped
public class LoginBean extends PageBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private String login;
    private String senha;
    private boolean adm;

    @Inject
    AppBean appBean;

    public String getUsuario() {
        return login;
    }

    public void setUsuario(String usuario) {
        this.login = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public String entrar() {

        Usuario u = new Usuario();

        if (login.equals(senha)) {

            u.setLogin(login);
            u.setData(new Date());
            
            appBean.addNovoUsuario(u);
            
            if(adm){
                return "admin";
            }
       
            return "cadastro";
        } else {
            FacesMessage msg = new FacesMessage("Senha e/ou Usuários incorretos!");
        }

        return null;
    }

}
