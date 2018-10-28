/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sire.service;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author pestupinan
 */
public interface IDatasourceService {

    Connection getConnection() throws SQLException, NamingException;
    Connection getConnection(int timeout) throws SQLException, NamingException;
    String getDatabaseProductName() throws SQLException, NamingException;
}
