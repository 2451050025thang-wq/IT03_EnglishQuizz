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
public enum ThemesType {
    DEFAULT {
        @Override
        public void updateThemes(Scene scene) {
            ThemesManager.settheme(new defautFactory());
            ThemesManager.applyThemes(scene);
        }
    }, DARK {
        @Override
        public void updateThemes(Scene scene) {
            ThemesManager.settheme(new darkFactory());
            ThemesManager.applyThemes(scene);
        }
    }, LIGHT {
        @Override
        public void updateThemes(Scene scene) {
            ThemesManager.settheme(new lightFactory());
            ThemesManager.applyThemes(scene);
        }
    };
    
    public abstract void updateThemes(Scene scene);
}
