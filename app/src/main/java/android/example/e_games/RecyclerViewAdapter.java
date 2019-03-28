package android.example.e_games;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mGamePic = new ArrayList<>();
    private ArrayList<String> mGameTitle = new ArrayList<>();
    private ArrayList<String> mGameGenre = new ArrayList<>();
    private ArrayList<String> mGameDescription = new ArrayList<>();
    private ArrayList<String> mGameLink = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context mContext, ArrayList<String> mGamePic, ArrayList<String> mGameTitle, ArrayList<String> mGameGenre, ArrayList<String> mGameDescription, ArrayList<String> mGameLink) {
        this.mContext = mContext;
        this.mGamePic = mGamePic;
        this.mGameTitle = mGameTitle;
        this.mGameGenre = mGameGenre;
        this.mGameDescription = mGameDescription;
        this.mGameLink = mGameLink;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gamelist_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        // Binding loaded data into the view holder

        Picasso.get().load(mGamePic.get(position)).into(holder.game_pic);

        holder.game_title.setText(mGameTitle.get(position));

        holder.game_genre.setText(mGameGenre.get(position));

        holder.game_description.setText(mGameDescription.get(position));

        holder.game_link.setText((mGameLink.get(position)));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mGameTitle.get(position));


                // Launch Game Details
                Intent intent = new Intent(view.getContext(), GameDetailsActivity.class);
                Bundle extras = new Bundle();

                String description = mGameDescription.get(position).toString();

                Log.d(TAG, "onClick: DESCRIPTION: " + description);

                extras.putString("GAME_TITLE", mGameTitle.get(position).toString());
                extras.putString("GAME_PIC", mGamePic.get(position));
                extras.putString("GAME_DESCRIPTION", description);
                extras.putString("GAME_LINK", mGameLink.get(position).toString());

                intent.putExtras(extras);

                view.getContext().startActivity(intent);

                // Testing click response on U.I
                //Toast.makeText(mContext, mGamePic.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mGameTitle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView game_pic;
        TextView game_title;
        TextView game_genre;
        TextView game_description;
        TextView game_link;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            game_pic = itemView.findViewById(R.id.game_pic);
            game_title = itemView.findViewById(R.id.game_title);
            game_genre = itemView.findViewById(R.id.game_genre);
            game_description = itemView.findViewById(R.id.game_description);
            game_link = itemView.findViewById(R.id.game_link);
            parentLayout = itemView.findViewById(R.id.parent_layout);


        }
    }
}
