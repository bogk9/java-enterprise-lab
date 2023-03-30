/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ai.beans;

/**
 *
 * @author boguskania
 */
public class ColorBean {
    private String foregroundColor; 
    private String backgroundColor;
    private String borderMode;

    public String getBorderMode() {
        return borderMode;
    }

    public void setBorderMode(String borderMode) {
        this.borderMode = borderMode;
    }
    

    public String getForegroundColor() {
        return foregroundColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    public ColorBean() {
         
    } 
    

}
