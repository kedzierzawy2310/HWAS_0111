package com.example.hwas_011;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class change_contact extends AppCompatActivity {
    int cname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_contact);
        setSpinnerItemSelectedListener();
    }
    public void setSpinnerItemSelectedListener(){
        Spinner contacts = (Spinner) findViewById(R.id.spinner);
        contacts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    cname = position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }



            });

    }
    public void setContactClick(View view3) {
        Button button = (Button) findViewById(R.id.button);
        Intent data = new Intent();
        button.getId();
        data.putExtra(MainActivity.CONTACT_ID, cname);
        setResult(RESULT_OK, data);
        finish();
    }
}
