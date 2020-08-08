package service;

import java.sql.SQLException;

/**
 *
 * @author Dominic
 */
public class Exceptions extends RuntimeException {

    /**
     * Creates a new instance of <code>DAOException</code> without detail
     * message.
     * @param reason
     */
    public Exceptions(String reason) {
        super(reason);
    }

    Exceptions(String message, SQLException ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}