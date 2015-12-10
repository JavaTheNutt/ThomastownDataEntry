package Ver_1_0;

import Ver_1_0.gui.mainPage.MainPageController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
	private MainPageController mainPage = new MainPageController();
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		mainPage.display();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
