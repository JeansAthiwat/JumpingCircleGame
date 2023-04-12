package background;

import java.awt.Color;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class GamePane extends StackPane {
	private static boolean menuIsActive = true;

	public GamePane() {
		this.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.BLUE, null, null)));

		NavigationPane navigationPane = new NavigationPane();
		this.getChildren().addAll(navigationPane);
	}

	public void setMenuStatus() {
		if (menuIsActive) {
			this.getChildren().remove(0);
		} else {
			NavigationPane navigationPane = new NavigationPane();
			this.getChildren().add(navigationPane);
		}

	}
}
