package com.task3;


class Book {
		    private int bookID;
		    private String title;
		    private String author;
		    private boolean isAvailable;

		    public Book(int bookID, String title, String author) {
		        this.bookID = bookID;
		        this.title = title;
		        this.author = author;
		        this.isAvailable = true; // By default, book is available
		    }

		    public int getBookID() {
		        return bookID;
		    }

		    public String getTitle() {
		        return title;
		    }

		    public String getAuthor() {
		        return author;
		    }

		    public boolean isAvailable() {
		        return isAvailable;
		    }

		    public void setAvailable(boolean available) {
		        isAvailable = available;
		    }

		    @Override
		    public String toString() {
		        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
		    }
		}

		class Library {
		    private Book[] books;
		    private int capacity;
		    private int count;

		    public Library(int capacity) {
		        this.capacity = capacity;
		        this.books = new Book[capacity];
		        this.count = 0;
		    }

		    public void addBook(Book book) {
		        if (count < capacity) {
		            books[count++] = book;
		            System.out.println("Book added successfully.");
		        } else {
		            System.out.println("Library is full. Cannot add more books.");
		        }
		    }

		    public void removeBook(int bookID) {
		        for (int i = 0; i < count; i++) {
		            if (books[i].getBookID() == bookID) {
		                books[i].setAvailable(false);
		                System.out.println("Book removed successfully.");
		                return;
		            }
		        }
		        System.out.println("Book with ID " + bookID + " not found.");
		    }

		    public Book searchBook(int bookID) {
		        for (Book book : books) {
		            if (book != null && book.getBookID() == bookID) {
		                return book;
		            }
		        }
		        return null;
		    }

		    public void displayBooks() {
		        if (count == 0) {
		            System.out.println("No books available in the library.");
		            return;
		        }
		        System.out.println("Books available in the library:");
		        for (Book book : books) {
		            if (book != null && book.isAvailable()) {
		                System.out.println(book);
		            }
		        }
		    }
		}

		
