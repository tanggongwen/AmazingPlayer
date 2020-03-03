package com.mahuahudong.res.subscriptions;

public class SearchRefresh {
    public SearchRefresh(String keyWord,String searchType){
        this.keyWord = keyWord;
        this.searchType = searchType;
    }
    private String keyWord;

    private String searchType;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }
}
