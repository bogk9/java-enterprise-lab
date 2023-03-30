/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package view.backing;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.html.HtmlCommandButton;
import jakarta.faces.component.html.HtmlSelectBooleanCheckbox;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.ValueChangeEvent;

/**
 *
 * @author boguskania
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {
    
    private String username="test";
    private String password;
    private HtmlSelectBooleanCheckbox acceptCheckbox;
    private HtmlCommandButton loginButton;

    public void activateButton(ValueChangeEvent e) {
    if (acceptCheckbox.isSelected())
        loginButton.setDisabled(false);
    else
        loginButton.setDisabled(true);
    FacesContext context = FacesContext.getCurrentInstance(); 
    context.renderResponse();
}
    
    public void setAcceptCheckbox(HtmlSelectBooleanCheckbox acceptCheckbox) {
        this.acceptCheckbox = acceptCheckbox;
    }

    public void setLoginButton(HtmlCommandButton loginButton) {
        this.loginButton = loginButton;
    }

    public HtmlSelectBooleanCheckbox getAcceptCheckbox() {
        return acceptCheckbox;
    }

    public HtmlCommandButton getLoginButton() {
        return loginButton;
    }
    
    
    public String login(){
        
        if(username.equals("scott") || password.equals("tiger")){
            FacesContext context = FacesContext.getCurrentInstance(); 
            FacesMessage message = new FacesMessage("Ten system to nie oracle!");
            context.addMessage("error", message);
            return "index";
        }
        
        if (username.equals(password)) {
            return "success";
        } else {
            return "failure";
    }
    }
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
