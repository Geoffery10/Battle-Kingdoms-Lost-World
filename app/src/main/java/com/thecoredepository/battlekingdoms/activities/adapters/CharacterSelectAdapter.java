package com.thecoredepository.battlekingdoms.activities.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoredepository.battlekingdoms.R;
import com.thecoredepository.battlekingdoms.activities.ChoosePartyActivity;

import org.w3c.dom.Text;

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
                TextView txtPartySize = (TextView) ((Activity)context).findViewById(R.id.txtPartySize);
                txtPartySize.setText("Party " + ChoosePartyActivity.getSelectionCount() + "/4");
            }
        });
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
        Button btnAddRemove;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_silhouette = itemView.findViewById(R.id.img_silhouette);
            txtNamePlate = itemView.findViewById(R.id.txtNamePlate);
            btnAddRemove = itemView.findViewById(R.id.btnAddRemove);
        }
    }
}

