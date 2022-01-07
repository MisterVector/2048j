package org.codespeak.twentyfourtyeightj.scenes;

/**
 * An enum containing a list of scenes
 *
 * @author Vector
 */
public enum SceneTypes {
    
    MAIN("MainScene.fxml");
    
    private String fxmlName;
    
    private SceneTypes(String fxmlName) {
        this.fxmlName = fxmlName;
    }
    
    /**
     * Gets the fxml name of this scene
     * @return fxml name of this scene
     */
    public String getFxmlName() {
        return fxmlName;
    }
    
    /**
     * Returns the path of this scene
     * @return path of this scene
     */
    public String getPath() {
        return "/org/codespeak/twentyfourtyeightj/scenes/" + fxmlName;
    }
    
}
