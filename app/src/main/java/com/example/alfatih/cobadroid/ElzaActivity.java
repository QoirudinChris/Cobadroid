package com.example.alfatih.cobadroid;

import android.os.Bundle;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ElzaActivity extends AppCompatActivity {


    Integer i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elza);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final String[] kata = new String[] {"Dear,", "Elza", "Riza", "Puspita", "Aku","Mau", "Ngomong", "Sesuatu"};
        final Button btnNext1 = (Button) findViewById(R.id.btnNext1);
        final TextView tv8 = (TextView) findViewById(R.id.tv8);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i==8){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(btnNext1.getContext());
                    builder1.setTitle("Will you marry me? :)");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        tv8.setText("Love You... :) :*");

                        }
                    });

                    builder1.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            tv8.setText(":( :( :( :(");
                        }
                    });

                    AlertDialog alert1 = builder1.create();
                    alert1.show();
                } else {
                    tv8.setText(kata[i].toString());
                    i++;
                }
            }
        });
    }

}
