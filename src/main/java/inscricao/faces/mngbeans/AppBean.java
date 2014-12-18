/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.mngbeans;

import inscricao.entity.Usuario;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1015591
 */

@Named
@ApplicationScoped
public class AppBean extends PageBean {
    
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public void addNovoUsuario(Usuario u){
        listaUsuarios.add(u);
    }
    
}
