package background;

import java.awt.Color;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class NavigationPane extends HBox {
	private Button startButton;

	public NavigationPane() {
		this.setAlignment(Pos.CENTER);
		this.setMaxWidth(500);
		this.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.WHEAT, null, null)));

		this.startButton = new Button("Start Game!");
		this.startButton.setPrefSize(200, 80);
		this.startButton.setFont(Font.font(24));
		startButton.setOnAction(event -> {
			RootPane.getGamePane().setMenuStatus();
		});
		this.getChildren().add(startButton);
	}
}
