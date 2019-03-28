package android.example.e_games;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class GameDetailsActivity extends AppCompatActivity {

    private static final String TAG = "GameDetailsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

        // Getting data from the intent
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String game_title = extras.getString("GAME_TITLE");
        String game_pic = extras.getString("GAME_PIC");
        String game_description = extras.getString("GAME_DESCRIPTION"); //extras.getString("GAME_DESCRIPTION");
        final String game_link = extras.getString("GAME_LINK");

        // Checking content received
        //Log.d(TAG, "onCreate: RECEIVED INTENT: " + game_description);

        // Setting data from the intent into the View

        final TextView title = findViewById(R.id.game_title);
        title.setText(game_title);

        final TextView description = findViewById(R.id.description_content);
        description.setText(game_description);

        final ImageView pic = findViewById(R.id.game_pic);
        Picasso.get().load(game_pic).into(pic);

        // Adding functionality to the button
        final Button button = findViewById(R.id.game_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String url = game_link;

                Uri webpage = Uri.parse(url);

                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                if(intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Log.d(TAG, "openWebsite: We could not find that website.");
                }
            }
        });
    }

}
