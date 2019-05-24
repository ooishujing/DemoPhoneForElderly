package sg.edu.rp.c346.demophoneforelderly;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCallS;
    Button btnCallD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCallS = findViewById(R.id.buttonCallSon);
        btnCallD = findViewById(R.id.buttonCallDaughter);

        btnCallS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intentCallS = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 92240336));
                    startActivity(intentCallS);


            }
        });

        btnCallD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCallD = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 89675543));
                startActivity(intentCallD);
                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("http://www.amazon.com"));
                startActivity(intent);



            }
        });


    }
}