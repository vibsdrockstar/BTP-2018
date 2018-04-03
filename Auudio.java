package com.example.vibhor.handicapped;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Listen extends AppCompatActivity {
    EditText editText;
    Button btnspeech;
    TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);
        editText=(EditText) findViewById(R.id.et_lan);
        btnspeech=(Button)findViewById(R.id.b_play);
        textToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                textToSpeech.setLanguage(Locale.ENGLISH);
            }
                    });
        btnspeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.speak("Hello Patient",TextToSpeech.QUEUE_FLUSH,null);

                String filename ="C:\\Users\\vibhor\\Desktop\\Jobs.txt";
                String line = null;
                String textToSpeak = "";
                try{
                    FileReader fileReader = new FileReader(filename);
                    BufferedReader bufferedReader = new BufferedReader((fileReader));
                    while ((line = bufferedReader.readLine()) != null){
                        textToSpeak += line;
                    }
                    bufferedReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textToSpeech.speak(textToSpeak,TextToSpeech.QUEUE_FLUSH,null);

            }
            });

    }

}
