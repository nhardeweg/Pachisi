import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class BoardGUI
{
    	public BoardGUI(Stage stage)
    	{
    		try
    		{
    		    Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
    		    Scene scene = new Scene(root);
    		    
    		    stage.setScene(scene);
    		    
    		    stage.show();
    		    
    		    
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
}
