package org.techtown.dandi_assignment;

import android.app.AppComponentFactory;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    ArrayList<Menu> items = new ArrayList<Menu>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.menu_item, viewGroup, false);

        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Menu item = items.get(position);
        viewHolder.setItem(item);

        viewHolder.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder.number++;
                viewHolder.tvCount.setText(viewHolder.number+"");
            }
        });

        viewHolder.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(viewHolder.number > 0) {
                    viewHolder.number--;
                    viewHolder.tvCount.setText(viewHolder.number+"");
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        ImageButton btnAdd;
        ImageButton btnMinus;
        TextView tvCount;
        AppCompatButton goBasket;
        int number;
        int menu_total;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            btnAdd = itemView.findViewById(R.id.image_plus);
            btnMinus = itemView.findViewById(R.id.image_minus);
            tvCount = itemView.findViewById(R.id.tvCount);
            goBasket = itemView.findViewById(R.id.Go_basket);
            menu_total = 0;
            number = 0;
        }

        public void setItem(Menu item) {

            imageView.setImageDrawable(item.getImage());
            textView.setText(item.getName());
            textView2.setText(item.getPrice());
        }


    }
    public void addItem(Menu item) {
        items.add(item);
    }

    public void setItems(ArrayList<Menu> items) {
        this.items = items;
    }

    public Menu getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, Menu item) {
        items.set(position, item);
    }

}
