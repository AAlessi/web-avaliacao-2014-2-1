/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author a1015591
 */
public class Usuario implements Serializable {
    
    private String Login;
    private Date data;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
