/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uber.foodtrucks.entities;

import java.io.Serializable;

/**
 * @author abiel_m_woldu
 *
 */

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Integer userId;
    private String userName;

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
