package com.uninorte.jugadores;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

public class listViewAc extends AppCompatActivity {
private String TAG = "El Tag List View";
private ListView lv;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtProduct = (TextView) findViewById(R.id.team_label);
        TextView txtEdad = (TextView) findViewById(R.id.team_edad);


        Intent i = getIntent();
        Intent j = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("Info");
        String edad = j.getStringExtra("Edad");
        // displaying selected product name
        txtProduct.setText(product);
        txtEdad.setText(edad);
    }
    /*public void onPause() {
        super.onPause();
        save(checkBox.isChecked());

    }

    @Override
    public void onResume() {
        super.onResume();
        checkBox.setChecked(load());
    }

    private void save(final boolean isChecked) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("check", isChecked);
        editor.commit();
    }

    private boolean load() {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("check", false);
    }*/
}






