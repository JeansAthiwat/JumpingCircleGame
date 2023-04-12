package application;

import background.RootPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		RootPane rootPane = new RootPane();

		Scene scene = new Scene(rootPane, 1600, 900);

		stage.setScene(scene);
		stage.setTitle("CIRCLE GAME!!!");
		stage.setResizable(false);

		stage.show();

	}

	public static void main(String[] args) {
		launch();
	}
}
