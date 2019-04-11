package com.example.hwas_011;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class change_sound extends AppCompatActivity {
    private int selected_sound=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_sound);
        Intent recived_intent=getIntent();
        Integer sound_id = recived_intent.getIntExtra(MainActivity.SOUND_ID,0);

    }
    public void onRadioButtonClicked(View view){
        boolean checked=((RadioButton)view).isChecked();
        RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup);
        if(checked){
            switch (view.getId()){
                case R.id.sound1:
                    selected_sound = 0;
                    break;
                case R.id.sound2:
                    selected_sound = 1;
                    break;
                case R.id.sound3:
                    selected_sound = 2;
                    break;
                case R.id.sound4:
                    selected_sound = 3;
                    break;
                case R.id.sound5:
                    selected_sound=4;
                    break;
                case R.id.sound6:
                    selected_sound=5;
                    break;
            }
        }
    }
    public void setSoundClick(View view2){
        Button button=(Button)findViewById(R.id.button);
        Intent data=new Intent();
        button.getId();
        data.putExtra(MainActivity.SOUND_ID,selected_sound);
        setResult(RESULT_OK,data);
        finish();
    }
}
