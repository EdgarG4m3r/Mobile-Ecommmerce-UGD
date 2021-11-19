package com.example.ugd9_f_0115.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProdukResponse {

    private String message;
    @SerializedName("produk")
    private List<Produk> produkList;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public List<Produk> getProdukList()
    {
        return this.produkList;
    }

    public void setProdukList(List<Produk> produkList)
    {
        this.produkList = produkList;
    }
}
