package com.thecoredepository.battlekingdoms.activities.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoredepository.battlekingdoms.R;
import com.thecoredepository.battlekingdoms.activities.ChoosePartyActivity;
import com.thecoredepository.battlekingdoms.backend.Character;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CharacterSelectAdapter extends RecyclerView.Adapter<CharacterSelectAdapter.ViewHolder>
{
    private Context context;

    private ArrayList<Character> characters;

    public CharacterSelectAdapter(Context context, ArrayList<Character> characters)
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
        holder.txtNamePlate.setText(characters.get(position).getName() + "");
        holder.txtAttack.setText(characters.get(position).getAttack() + "");
        holder.txtDefense.setText(characters.get(position).getDefence() + "");
        holder.txtMagic.setText(characters.get(position).getMagic() + "");
        holder.txtSpeed.setText(characters.get(position).getSpeed() + "");
        holder.txtClass.setText("Class: " + characters.get(position).getCharClass());

        Drawable icon = getIcon(characters.get(position).getIcon());

        holder.img_silhouette.setImageDrawable(icon);

        holder.btnAddRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Add/Remove
                if (holder.btnAddRemove.getText().equals("Add"))
                {
                    ChoosePartyActivity.selectedCharacters.add("" + holder.txtNamePlate.getText());
                    ChoosePartyActivity.setSelectionCount(ChoosePartyActivity.getSelectionCount() + 1);
                    holder.btnAddRemove.setText("Remove");
                }
                else
                {
                    ChoosePartyActivity.selectedCharacters.remove("" + holder.txtNamePlate.getText());
                    ChoosePartyActivity.setSelectionCount(ChoosePartyActivity.getSelectionCount() - 1);
                    holder.btnAddRemove.setText("Add");
                }
                TextView txtPartySize = ((Activity)context).findViewById(R.id.txtPartySize);
                txtPartySize.setText("Party " + ChoosePartyActivity.getSelectionCount() + "/4");
            }
        });
    }

    public Drawable getIcon(int id) {
        Drawable icon = context.getDrawable(R.drawable.character_silhouette_00);
        switch(id) {
            case 1:
                icon = context.getDrawable(R.drawable.character_silhouette_01);
                break;
            case 2:
                icon = context.getDrawable(R.drawable.character_silhouette_02);
                break;
            case 3:
                icon = context.getDrawable(R.drawable.character_silhouette_03);
                break;
            case 4:
                icon = context.getDrawable(R.drawable.character_silhouette_04);
                break;
            case 5:
                icon = context.getDrawable(R.drawable.character_silhouette_05);
                break;
            case 6:
                icon = context.getDrawable(R.drawable.character_silhouette_06);
                break;
            case 7:
                icon = context.getDrawable(R.drawable.character_silhouette_07);
                break;
            case 8:
                icon = context.getDrawable(R.drawable.character_silhouette_08);
                break;
            case 9:
                icon = context.getDrawable(R.drawable.character_silhouette_09);
                break;
            case 10:
                icon = context.getDrawable(R.drawable.character_silhouette_10);
                break;
            case 11:
                icon = context.getDrawable(R.drawable.character_silhouette_11);
                break;
            case 12:
                icon = context.getDrawable(R.drawable.character_silhouette_12);
                break;
        }
        return icon;
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
        TextView txtAttack;
        TextView txtDefense;
        TextView txtSpeed;
        TextView txtMagic;
        TextView txtClass;
        Button btnAddRemove;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_silhouette = itemView.findViewById(R.id.img_silhouette);
            txtNamePlate = itemView.findViewById(R.id.txtNamePlate);
            txtAttack = itemView.findViewById(R.id.txtAttack);
            txtDefense = itemView.findViewById(R.id.txtDefense);
            txtSpeed = itemView.findViewById(R.id.txtSpeed);
            txtMagic = itemView.findViewById(R.id.txtMagic);
            txtClass = itemView.findViewById(R.id.txtClass);
            btnAddRemove = itemView.findViewById(R.id.btnAddRemove);
        }
    }
}

