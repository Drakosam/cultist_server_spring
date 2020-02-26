package com.bank.scam.models;

public class Response<T> {
    private T load;
    private int code;

    public T getLoad() {
        return load;
    }

    public void setLoad(T load) {
        this.load = load;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Response(T load,int code) {
        this.load = load;
        this.code = code;
    }
}
