package com.example.ugd9_f_0115.models;

import java.util.List;

public class ProdukResponse {

    private String message;

    private List<Produk> produkList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Produk> getProdukList() {
        return produkList;
    }

    public void setProdukList(List<Produk> produkList) {
        this.produkList = produkList;
    }
}
