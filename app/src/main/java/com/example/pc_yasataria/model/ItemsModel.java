package com.example.pc_yasataria.model;

public class ItemsModel {
    String gambar,inspirasi,hex;

    public ItemsModel(String gambar, String inspirasi, String hex) {
        this.gambar = gambar;
        this.inspirasi = inspirasi;
        this.hex = hex;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getInspirasi() {
        return inspirasi;
    }

    public void setInspirasi(String inspirasi) {
        this.inspirasi = inspirasi;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
