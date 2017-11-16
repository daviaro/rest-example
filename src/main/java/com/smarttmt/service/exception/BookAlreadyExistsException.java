/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smarttmt.service.exception;

/**
 *
 * @author desarrollo001
 */
public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(final String message) {
        super(message);
    }

}
