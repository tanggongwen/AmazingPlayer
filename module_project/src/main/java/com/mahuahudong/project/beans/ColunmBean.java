package com.mahuahudong.project.beans;

import java.io.Serializable;

public class ColunmBean implements Serializable {
    private String columnId;
    private String columnName;

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
