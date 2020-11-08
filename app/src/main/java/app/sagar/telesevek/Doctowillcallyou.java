package app.sagar.telesevek;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import app.sagar.telesevek.PhoneAuthConsulation.MainActivity;


public class Doctowillcallyou extends AppCompatActivity{
    Button past;
    Button buy;
    Button our;
    Button consult;
    private ProgressDialog mSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctowillcallyou);

        SharedPreferences prefs = getSharedPreferences("Image", MODE_PRIVATE);
        final String phonenumber = prefs.getString("pimageid", "nodata");


        past = findViewById(R.id.Past);
        past.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent chemistinten = new Intent(Doctowillcallyou.this, MainActivity.class);
                startActivity(chemistinten);
            }
        });
        buy = findViewById(R.id.card);
        buy.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent chemistinten = new Intent(Doctowillcallyou.this, Buycard.class);
                        startActivity(chemistinten);
                    }
                });

        our = findViewById(R.id.odoctor);
        our.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent chemistinten = new Intent(Doctowillcallyou.this, OurDoctor.class);
                        startActivity(chemistinten);
                    }
                });

        consult = findViewById(R.id.consult);
        consult.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent chemistinten = new Intent(Doctowillcallyou.this, ScratchCardNew.class);
                        startActivity(chemistinten);
                    }
                });



    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Are you sure?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(Doctowillcallyou.this,ScratchCardNew.class);
                        startActivity(intent);
                        finish();

                        System.exit(0);
                    }
                }).setNegativeButton("no", null).show();
    }










}