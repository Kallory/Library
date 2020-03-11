/*
 * Copyright (C) 2020 Kallory
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package library;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author Kory
 */
public class Library extends Application {
    
    Stage window;
    TableView<Book> table;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Library");
        
        //Name column
        TableColumn<Book, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        //Author column
        TableColumn<Book, String> authorColumn = new TableColumn<>("Author");
        authorColumn.setMinWidth(200);
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        
        //Genre column
        TableColumn<Book, String> genreColumn = new TableColumn<>("Genre");
        genreColumn.setMinWidth(200);
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        
        table = new TableView();
        table.setItems(getBook());
        table.getColumns().addAll(nameColumn, authorColumn, genreColumn);
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(table);
        
        Scene scene = new Scene(vbox);
        window.setScene(scene);
        window.show();
    }
    
    public ObservableList<Book> getBook() {
        ObservableList<Book> books = FXCollections.observableArrayList();
        books.add(new Book("A Game of Thrones", "G. R. R. Martin", "Fantasy", "9780553573404", 1996, "Bantam Books"));
        return books;
    }    
}
