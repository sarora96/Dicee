package sarthakarora.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll = (Button) findViewById(R.id.rollButton);

        final int [] diceArray = {R.drawable.dice1, R.drawable.dice2,
                R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(6);
                leftDice.setImageResource(diceArray[num]);
                num = random.nextInt(6);
                rightDice.setImageResource(diceArray[num]);

            }
        });
    }
}
