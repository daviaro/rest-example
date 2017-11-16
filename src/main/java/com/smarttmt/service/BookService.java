/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smarttmt.service;

import com.smarttmt.domain.Book;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author desarrollo001
 */
public interface BookService {

    Book saveBook(@NotNull @Valid final Book book);
    List<Book> getList();
    Book getBook(Long bookId);
    void deleteBook(final Long bookId);
}
