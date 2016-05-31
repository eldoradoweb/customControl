package ch.fhnw.ws4c.module01;

import ch.fhnw.ws4c.module02.shadows.ShadowPane;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Dieter Holz
 */
public class ShadowPlayground extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent rootPanel = new ShadowPane();

		Scene scene = new Scene(rootPanel);

		String fonts = getClass().getResource("fonts.css").toExternalForm();
		scene.getStylesheets().add(fonts);

		String stylesheet = getClass().getResource("style.css").toExternalForm();
		scene.getStylesheets().add(stylesheet);

		primaryStage.setTitle("Gradient Playground");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
