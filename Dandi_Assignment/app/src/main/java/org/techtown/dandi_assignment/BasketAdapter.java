package org.techtown.dandi_assignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BasketAdapter extends RecyclerView.Adapter<BasketAdapter.ViewHolder> {
    ArrayList<Basket> b_items = new ArrayList<>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View basketitemView = inflater.inflate(R.layout.basket_item, viewGroup, false);

        return new ViewHolder(basketitemView);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Basket b_item = b_items.get(position);
        viewHolder.setItem(b_item);
    }

    @Override
    public int getItemCount() {
        return b_items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView basketName;
        TextView basketPrice;
        ImageView basketImageView;
        TextView basketcount;

        public ViewHolder(View basketitemView) {
            super(basketitemView);

            basketImageView = basketitemView.findViewById(R.id.basketimageView);
            basketName = basketitemView.findViewById(R.id.basketName);
            basketPrice = basketitemView.findViewById(R.id.basketPrice);
            basketcount = basketitemView.findViewById(R.id.basketCount);

        }

        public void setItem(Basket b_item) {

            basketImageView.setImageDrawable(b_item.getImage());
            basketName.setText(b_item.getName());
            basketPrice.setText(b_item.getPrice());
            basketcount.setText(b_item.getCount());
        }


    }
    public void addItem(Basket b_item) {
        b_items.add(b_item);
    }

    public void setItems(ArrayList<Basket> b_items) {
        this.b_items = b_items;
    }

    public Basket getItem(int position) {
        return b_items.get(position);
    }

    public void setItem(int position, Basket b_item) {
        b_items.set(position, b_item);
    }

}
