package com.example.vibhor.t2s;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import java.util.Locale;

public class Audio extends AppCompatActivity {
private TextToSpeech ntts;
private View nEditText;
private SeekBar nSeekBarPitch;
private  SeekBar nSeekBarSpeed;  
private Button nButtonSpeak;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        nButtonSpeak = findViewById(R.id.button_speak);
        ntts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = ntts.setLanguage(Locale.ENGLISH);
                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        nButtonSpeak.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Intialization failed");
                }
            }
        });
        nEditText=findViewById(R.id.et_string);
        nSeekBarPitch = findViewById(R.id.seek_bar_pitch);
        nSeekBarSpeed = findViewById(R.id.seek_bar_speed);

        nButtonSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });

    }
    private void speak(){
        String text = nEditText.getText().toString();
        float pitch =(float)nSeekBarPitch.getProgress()/50;
        if (pitch<0.1) pitch=0.1f;
        float speed =(float)nSeekBarSpeed.getProgress()/50;
        if (speed<0.1) pitch=0.1f;
        ntts.setPitch(pitch);
        ntts.setSpeechRate(speed);
        
        ntts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
        
    }

    @Override
    protected void onDestroy() {
        if(ntts !=null){
            ntts.stop();
            ntts.shutdown();
        }
        super.onDestroy();
    }
}

