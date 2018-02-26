package com.demo.cart;

/**
 * author : Sdniu
 * date   : 2017/7/24.
 * description :
 */
public class ShopCartHeader {
    private String tableToken;
    private String tableId;
    private String state;
    private long version;


    public ShopCartHeader() {
    }

    public String getTableToken() {
        return tableToken;
    }

    public void setTableToken(String tableToken) {
        this.tableToken = tableToken;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public void versionAdd() {
        this.version++;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}