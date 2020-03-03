package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LoginBean implements Serializable {


    /**
     * accessToken : eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJqd3QiLCJpYXQiOjE1NzIzNTExMjYsInN1YiI6IntcImlkXCI6XCI2Mzg4MjE4MzgzMTg4NjY0MzJcIixcInVzZXJDb2RlXCI6XCIxNzM0Njk4OTcxN1wiLFwib3JnQ29kZVwiOlwiMTczNDY5ODk3MTdcIn0iLCJpc3MiOiJzdGVlciIsImV4cCI6MTU3Mjk1NTkyNn0.3IfOfVp-zhQhb9i-3dr_v3eNl31ibpy_aEJvJQ3sUPA
     * user : {"isCurrentAdded":"0","petName":"","profilePhoto":"","userId":"638821838318866432","userName":""}
     * refreshToken : eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJBTTNuOTRBaFJCMWtJYVZkQXlDR2JMcVdJdlFKQnhmVGhFblRHb3RZWVpVPSIsImlhdCI6MTU3MjM1MTEyNiwic3ViIjoiXCI2Mzg4MjE4MzgzMTg4NjY0MzJcIiIsImlzcyI6InN0ZWVyIiwiZXhwIjoxNTc0MTY1NTI2fQ.5SCguuIhCnAUxZQNcnhEMzT3wQT2NE5MSVOkP5gkPJc
     */

    private String accessToken;
    private UserBean user;
    private String refreshToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }


}
