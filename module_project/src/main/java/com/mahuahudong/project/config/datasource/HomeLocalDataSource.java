package com.mahuahudong.project.config.datasource;

import java.util.Set;

/**
 * Created by goldze on 2019/3/26.
 */
public interface HomeLocalDataSource {
    Set<String> getSearchHistoryList();
    void addSearchHistory(String searchHistory);
    void clearSearchHistory();
}
