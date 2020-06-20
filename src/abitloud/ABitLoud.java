package abitloud;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class ABitLoud extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) throws IOException {
        GraphScene scene = new GraphScene();
        stage.setScene(scene.getScene());
        stage.show();
    }
}
