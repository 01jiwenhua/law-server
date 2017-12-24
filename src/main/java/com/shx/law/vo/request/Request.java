package com.shx.law.vo.request;

import com.shx.law.vo.response.Response;

/**
 * Created by xuan on 2017/12/23.
 */
public class Request {
    private Integer page;
    private Integer pageSize;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
