package com.thecoredepository.battlekingdoms.activities.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thecoredepository.battlekingdoms.R;

import java.util.ArrayList;

public class CharacterSelectAdapter extends RecyclerView.Adapter<CharacterSelectAdapter.ViewHolder>
{
    private Context context;
    

    private ArrayList<String> characters;

    public CharacterSelectAdapter(Context context, ArrayList<String> characters)
    {
        this.context = context;
        this.characters = characters;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_character_select_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Log.d("Recycle", "onBindViewHolder called");
        //THIS IS WHERE STUFF HAPPENS
        holder.txtNamePlate.setText(characters.get(position));
    }

    @Override
    public int getItemCount() {
        //Quantity of characters to display
        int size = characters.size();

        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //Put Views in the holder
        ImageView img_silhouette;
        TextView txtNamePlate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_silhouette = itemView.findViewById(R.id.img_silhouette);
            txtNamePlate = itemView.findViewById(R.id.txtNamePlate);
        }
    }
}

