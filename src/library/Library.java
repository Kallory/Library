package library;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 *
 * @author Kory
 */
public class Library extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Library");
        GridPane grid = new GridPane();
        
        Scene scene = new Scene(grid, 300, 250);      
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
}
