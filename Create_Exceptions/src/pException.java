/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public class pException extends Exception{

    public pException() {
    }

    public pException(String message) {
        super(message);
    }

    public pException(String message, Throwable cause) {
        super(message, cause);
    }

    public pException(Throwable cause) {
        super(cause);
    }

    public pException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
