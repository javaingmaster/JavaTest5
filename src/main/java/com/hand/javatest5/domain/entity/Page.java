package com.hand.javatest5.domain.entity;

import java.io.Serializable;

public class Page implements Serializable {
    private int page;
    private int pageSize;
    private String sort = "ASC";

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
