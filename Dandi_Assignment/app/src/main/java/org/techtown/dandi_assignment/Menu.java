package org.techtown.dandi_assignment;

import android.graphics.drawable.Drawable;

public class Menu {
    String name;
    String price;
    Drawable image;

    public Menu(String name, String price, Drawable image) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
