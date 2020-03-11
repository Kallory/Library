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

/**
 *
 * @author Kallory
 */
public class Book {
    private String name;
    private String author;
    private int ISBN;
    private int year;
    private String genre;
    private String publisher;
    
    /**
     * Default constructor for book, initialize all instance variables
     */
    public Book() {
        this.name = "";
        this.author = "";
        this.genre = "";
        this.ISBN = 0;
        this.year = 0;
        this.publisher = "";
    }
    
    /**
     * Constructor for book with data that is input by the user
     * <p>
     * @param name Name of the book
     * @param author Name of the author
     * @param genre Genre of the book
     * @param ISBN ISBN of the book if it has one, 0 if this doesn't exist
     * @param year the year the book was published
     * @param publisher the publisher of the book
     */
    public Book(String name, String author, String genre, int ISBN, int year, String publisher) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.ISBN = ISBN;
        this.year = year;
        this.publisher = publisher;
    }
    
    /**
     * Accessor for name
     * @return the name of the book
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mutator for name
     * @param name The name of the book
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Accessor for author
     * @return the author's name
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Mutator for the author's name
     * @param author The author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    /**
     * Accessor for the genre
     * @return the genre of the book
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * Mutator for the genre
     * @param genre the genre of the book
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    /**
     * The ISBN is a unique numerical identification given to a book.
     * This is the accessor for the ISBN.
     * Please note that not all books have an ISBN, for books that don't have
     * one, 0 is the default
     * @return the book's ISBN
     */
    public int getISBN() {
        return ISBN;
    }
    
    /**
     * The ISBN is a unique numerical identification given to a book.
     * This is the mutator for the ISBN.
     * Please note that not all books have an ISBN, for books that don't have
     * one, 0 is the default
     * @param ISBN the ISBN of the book
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    /**
     * Accessor for the year the book was published
     * @return the year the book was published, 0 if unknown
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Mutator for the year the book was published
     * @param year the year the book was published
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    /**
     * Accessor for the name of the company or person(s) that published the book
     * @return the publisher's name
     */
    public String getPublisher() {
        return publisher;
    }
    
    /**
     * Mutator for the name of the company or person(s) that published the book
     * @param publisher the name of the publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
