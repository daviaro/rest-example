/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smarttmt.repository;

import com.smarttmt.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author desarrollo001
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
