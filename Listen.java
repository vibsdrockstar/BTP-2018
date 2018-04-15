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
        final Button button = (Button) findViewById(R.id.et_lan);
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
                textToSpeech.speak("Hello user,Following are the schemes. Age relaxation of 10 years (15 years for SC/ST and 13 years for OBC candidates) in upper age limit shall be allowed to persons suffering from (a) blindness or low vision, (b) hearing impairment and (c) locomotor disability or cerebral palsy in case of direct recruitment to all civil posts/services under the Central Government identified suitable to be held by persons with such disabilities, subject to the condition that maximum age of the applicant on the\n" +
                        "\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"crucial date shall not exceed 56 years/n 2.\tThe head of the establishment shall ensure that the provision of sub-section (3) of section 3 of the Act are not misused to deny any right or benefit to persons with disabilities covered under the Act..- No person with disability shall be a subject of research except when the research involves physical impact on his body.The persons with disabilities could perform their duties efficiently if they are provided with aids and appliances which are suitable to their needs. Ministries /Departments and their attached and subordinate offices, Central Public Sector Enterprises, Cantonment Board, etc. should assist the persons with disabilities by providing them high tech/latest technology led assistive devices (including low vision aids, hearing aids with battery), special furniture, wheel chairs (motorised if required by the employee), software scanners, computer and other hardware, etc. in accordance with their requirement, which would improve their efficiency.\n" +
                        "\n In addition to the guidelines for modification in all public buildings including Government offices to provide easy accessibility and barrier free environment for PWDs as per the provisions of the PWD Act, all Government offices should take special steps to provide barrier free and accessible work stations to PWD employees, access from main building entrance to their work stations and access to common utility areas such as Toilets, canteens etc. Lifts/elevators should be made accessible by providing Braille signage and audio outputs. Wherever required, suitable colour contrast may also be made available in buildings, utilities, staircases, etc. for the benefit of low vision employees.\n" +
                        " \n" +
                        "\n.Employees with disability would be given option to apply for the items mentioned above to the Administration Division through proper channel, which will be examined on case to case basis and decided with the approval of competent authority , If an employee, after acquiring disability is not suitable for the post he, could be shifted to some other post with the same pay scale arid service benefits.Women with disabilities shall be paid Rs.3000/-per month as Special Allowance for Child care. The allowance shall be payable from the time of the child’s birth till the child is two years old.\n.Disability means a person having a minimum Disability of 40% as elaborated in Ministry of Welfare’s Notification No. 16- 18/97-NI.I dated 1.6.2001 and amended from time to time. According to Swabhimann scheme whose main objective is to To Provide affordable Health Insurance to persons with Blindness, Low Vision, leprosy-Cured, Hearing Impairment, Loco-Motor disability, Mental-Retardation and mental illness.\n" +
                        " and to Improve general Health condition & Quality of life of persons with Disabilities states that Sum insured of Rs 2 lacs on family floater for 12 months. Age band is from 0 to 65 years.Available for persons with disabilities with family annual income of Rs. 3 lacs and below on declaration basis in proposal form.Uniform premium contribution of Rs. 357 per person / family ( incl tax).\n" +
                        "OPD cover for corrective therapy up to Rs. 10,000 a year for person with disability. For persons with mental retardation and mental illness, OPD cover is Rs. 3000 per annum.",TextToSpeech.QUEUE_FLUSH,null);

               /* String filename ="C:\\Users\\vibhor\\Desktop\\Jobs.txt";

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
                textToSpeech.speak("Age relaxation of 10 years (15 years for SC/ST and 13 years for OBC candidates) in upper age limit shall be allowed to persons suffering from (a) blindness or low vision, (b) hearing impairment and (c) locomotor disability or cerebral palsy in case of direct recruitment to all civil posts/services under the Central Government identified suitable to be held by persons with such disabilities, subject to the condition that maximum age of the applicant on the\n" +
                        "\n" +
                        "crucial date shall not exceed 56 years.",TextToSpeech.QUEUE_FLUSH,null)*/;

            }
            });

    }

}
