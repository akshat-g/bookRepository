package com.projects.sample;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import com.projects.sample.persistence.model.Book;

public class SpringBootBootstrapLiveTest {
    private static final String API_ROOT = "http://localhost:8080/api/books";

    private Book createRandomBook() {
        final Book book = new Book();
        book.setTitle(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));
        return book;
    }
}
