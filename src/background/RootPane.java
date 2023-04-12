package background;

import javafx.scene.layout.StackPane;

public class RootPane extends StackPane {
	private static NavigationPane navigationPane;
	private static GamePane gamePane;
	private static boolean navMenuisActive = true;

	public RootPane() {
		navigationPane = new NavigationPane();
		gamePane = new GamePane();

		this.getChildren().addAll(gamePane);

	}

	public static void setNavMenuStatus() {
		if (navMenuisActive) {
			
		}
	}

	public static NavigationPane getNavigationPane() {
		return navigationPane;
	}

	public static GamePane getGamePane() {
		return gamePane;
	}
}
