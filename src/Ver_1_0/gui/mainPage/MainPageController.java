package Ver_1_0.gui.mainPage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Joe on 10/12/2015.
 */
public class MainPageController
{
	public void display() throws IOException
	{
		Stage window = new Stage();
		window.setMaximized(true);
		window.setTitle("Main Page");

		Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		window.setScene(new Scene(root));
		window.show();
	}
}
