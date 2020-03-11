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
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author Kallory
 */
public class Library extends Application {
    
    Stage window;
    TableView<Book> table;
    TextField nameInput;
    TextField authorInput;
    TextField genreInput;
    TextField ISBNInput;
    TextField yearInput;
    TextField publisherInput;

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
        
//-----------------Column creation--------------------------------------------        
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
        genreColumn.setMinWidth(150);
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        
        //ISBN column
        TableColumn<Book, String> ISBNColumn = new TableColumn<>("ISBN");
        ISBNColumn.setMinWidth(120);
        ISBNColumn.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
        
        //year column
        TableColumn<Book, Integer> yearColumn = new TableColumn<>("Year Published");
        yearColumn.setMinWidth(100);
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
        
        //publisher column
        TableColumn<Book, String> publisherColumn = new TableColumn<>("Publisher");
        publisherColumn.setMinWidth(200);
        publisherColumn.setCellValueFactory(new PropertyValueFactory<>("publisher"));
        
//---------------------------Input Fields--------------------------------------
        //Name input
        nameInput = new TextField();
        nameInput.setPromptText("Book name");
        nameInput.setMinWidth(180);
        
        //Author input
        authorInput = new TextField();
        authorInput.setPromptText("Author name");
        authorInput.setMinWidth(160);
        
        //Genre input
        genreInput = new TextField();
        genreInput.setPromptText("Genre name");
        genreInput.setMinWidth(130);
        
        //ISBN input
        ISBNInput = new TextField();
        ISBNInput.setPromptText("Book ISBN 0 if none");
        ISBNInput.setMinWidth(80);
        
        //Year input
        yearInput = new TextField();
        yearInput.setPromptText("Year published");
        yearInput.setMinWidth(80);
        
        //Publisher input
        publisherInput = new TextField();
        publisherInput.setPromptText("Published by");
        publisherInput.setMinWidth(100);
        
        
        //Buttons
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());
        
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(8, 8, 8, 8));
        hBox.setSpacing(8);
        hBox.getChildren().addAll(nameInput, authorInput, genreInput, ISBNInput, yearInput, publisherInput, addButton, deleteButton);
        
        HBox hBox2 = new HBox();
        hBox2.setPadding(new Insets(10, 10, 10, 10));
        hBox2.setSpacing(10);
        hBox2.getChildren().addAll(addButton, deleteButton);
        
        table = new TableView();
        table.setItems(getBook());
        table.getColumns().addAll(nameColumn, authorColumn, genreColumn, ISBNColumn, yearColumn, publisherColumn);
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(table, hBox, hBox2);
        
        Scene scene = new Scene(vbox);
        window.setScene(scene);
        window.show();
    }
    
    //Add button clicked
    public void addButtonClicked() {
        Book book = new Book();
        book.setName(nameInput.getText());
        book.setAuthor(authorInput.getText());
        book.setGenre(genreInput.getText());
        book.setISBN(ISBNInput.getText());
        book.setYear(Integer.parseInt(yearInput.getText()));
        book.setPublisher(publisherInput.getText());
    }
    
    //delete button
    public void deleteButtonClicked() {
        
    }
    public ObservableList<Book> getBook() {
        ObservableList<Book> books = FXCollections.observableArrayList();
        books.add(new Book("A Game of Thrones", "G. R. R. Martin", "Fantasy", "9780553573404", 1996, "Bantam Books"));
        return books;
    }    
}
