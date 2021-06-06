package org.techtown.dandi_assignment;

import android.graphics.drawable.Drawable;

public class Basket {
    String b_name;
    String b_price;
    Drawable b_image;
    int b_count;

    public Basket(String b_name, String b_price, Drawable b_image, int b_count) {
        this.b_image = b_image;
        this.b_name = b_name;
        this.b_price = b_price;
        this.b_count = b_count;
    }

    public int getCount() {
        return b_count;
    }
    public void setCount(int b_count) {
        this.b_count = b_count;
    }

    public Drawable getImage() {
        return b_image;
    }

    public void setImage(Drawable b_image) {
        this.b_image = b_image;
    }

    public String getName() {
        return b_name;
    }

    public void setName(String b_name) {
        this.b_name = b_name;
    }

    public String getPrice() {
        return b_price;
    }

    public void setPrice(String b_price) {
        this.b_price = b_price;
    }

}
