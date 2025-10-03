package com.turkcell.libraryApp.domain.book.model;

import com.turkcell.libraryApp.domain.author.model.AuthorId;
import com.turkcell.libraryApp.domain.publisher.model.PublisherId;

import java.util.UUID;

public class Book {
    private final BookId bookId;

    private Title title;
    private Language language;
    private BookStatus bookStatus;
    private Year year;
    private TotalCopies totalCopies;
    private AvailableCopies availableCopies;
    private Isbn isbn;
    private AuthorId authorId;
    private PublisherId publisherId;

    private Book(BookId bookId, Title title, Language language, BookStatus bookStatus, Year year, TotalCopies totalCopies, AvailableCopies availableCopies, Isbn isbn, AuthorId authorId, PublisherId publisherId) {
        this.bookId = bookId;
        this.title = title;
        this.language = language;
        this.bookStatus = bookStatus;
        this.year = year;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
        this.isbn = isbn;
        this.authorId = authorId;
        this.publisherId = publisherId;
    }
    public static Book create(Title title, Language language, BookStatus bookStatus, Year year, TotalCopies totalCopies, AvailableCopies availableCopies, Isbn isbn, AuthorId authorId, PublisherId publisherId){
        return new Book(BookId.generate(),
                title,
                language,
                bookStatus,
                year,
                totalCopies,
                availableCopies,
                isbn,
                authorId,
                publisherId
                );
    }
    public static Book rehydrate(BookId bookId, Title title, Language language, BookStatus bookStatus, Year year, TotalCopies totalCopies, AvailableCopies availableCopies, Isbn isbn, AuthorId authorId, PublisherId publisherId){
        return new Book(
                bookId,
                title,
                language,
                bookStatus,
                year,
                totalCopies,
                availableCopies,
                isbn,
                authorId,
                publisherId
        );
    }
    public BookId bookId() {
        return bookId;
    }

    public Title title() {
        return title;
    }

    public Language language() {
        return language;
    }

    public BookStatus bookStatus() {
        return bookStatus;
    }

    public Year year() {
        return year;
    }

    public TotalCopies totalCopies() {
        return totalCopies;
    }

    public AvailableCopies availableCopies() {
        return availableCopies;
    }

    public Isbn isbn() {
        return isbn;
    }

    public AuthorId authorId() {
        return authorId;
    }

    public PublisherId publisherId() {
        return publisherId;
    }



}
