/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdt.utils.themes;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public class ThemesManager {
    private static ThemesAbtractFactory themes = new defautFactory();
    
    public static void settheme(ThemesAbtractFactory athem){
        themes = athem;
    }
    
    public static void applyThemes(Scene scene){
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(themes.getStyleSheet());
                
    }
}
