package org.codespeak.twentyfortyeightj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.codespeak.twentyfortyeightj.objects.StageController;
import org.codespeak.twentyfortyeightj.scenes.SceneTypes;
import org.codespeak.twentyfortyeightj.util.SceneUtil;

/**
 *
 * @author Vector
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        StageController stageController = SceneUtil.getScene(stage, SceneTypes.MAIN);
        stage = stageController.getStage();

        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
