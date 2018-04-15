package com.example.vibhor.handicapped;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Hear extends AppCompatActivity {
    Button btnspeech;
    TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hear);
        btnspeech=(Button)findViewById(R.id.b_play);
        textToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                textToSpeech.setLanguage(Locale.ENGLISH);
            }
        });
        btnspeech.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

             textToSpeech.speak("Hello User , Following are d schemes,The list of posts in Group ‘A’, ‘B’, ‘C’ & ‘D’ identified suitable for persons with disabilities is at Annexure – C, for information and further necessary action by the concerned appointing authorities. This list supersedes the list of posts for Group ‘A’, ‘B’, ‘C’ & ‘D’ notified through notification No. 16 – 70/2004-DD-III dated the 18th February, 2007 and 15th March, 2007.Age relaxation of 10 years (15 years for SC/ST and 13 years for OBC candidates) in upper age limit shall be allowed to persons suffering from (a) blindness or low vision, (b) hearing impairment and (c) locomotor disability or cerebral palsy in case of direct recruitment to all civil posts/services under the Central Government identified suitable to be held by persons with such disabilities, subject to the condition that maximum age of the applicant on the crucial date shall not exceed 56 years.Induction training is an essential component of the service requirement of an employee. Induction training programme for the persons with disabilities should be imparted together with the other employees.\n  Job specific post-recruitment as well as pre-promotion training programmes are required to be organised for the persons with disabilities. Outlining a specific module/norm for training programme for the persons with disabilities common to all the Ministries/Departments and their attached/subordinate offices, Central Public Sector. Each Ministry/Department of the Government of India, their attached and subordinate offices, Central Public Sector Enterprises, Cantonment Boards etc should identify the types of jobs which could be easily performed by them specially for Group B, C and D posts where the number of jobs are more. Such persons should preferably be posted to perform such identified jobs and they be allowed to continue performing such jobs, as far as possible. If the concerned PWD officer could perform all the jobs as people without disability or could perform several types of jobs efficiently, no effort should be made to instruct them to certain types of jobs only.\nAs far as possible, the persons with disabilities may be exempted from the rotational transfer policy/transfer and be allowed to continue in the same job, where they would have achieved the desired performance. Further, preference in place of posting at the time of transfer/promotion may be given to the persons with disability subject to the administrative constraints. The practice of considering choice of place of posting in case of persons with disabilities may be continued. To the extent feasible, they may be retained in the same job, where their services could be optimally utilised.\n. For the purposes of computation of vacancies, four percent of the total number of vacancies including vacancies arising in the identified and non -identified posts in the cadre strength in each group of posts shall be taken into account by the appropriate Government for the persons with benchmark disabilities: Reservation for the persons with disabilities in Group 'A' or Group 'posts shall be computed on the basis of total number of vacancies occurring in direct recruitment quota in all the Group 'A' posts or Group '6' posts respectively, in the cadre. A request/application for change of cadre by an IAS officer appointed against a vacancy reserved for PH category has to be made to the DoPT through the parent cadre/LBSNAA as the case may be so as to reach DoPT within three months from the date of notification of the cadre allocation in the official website of the DoPT.MID-WAY HOME (MHW) is an organization   designed to provide well-being for individuals with special needs.It offers services based on level of functioning, ensures least restrictive environment towards independent living and decision making.The government of India has a reserved quota for all handicapped persons. Based on their age, disabilities, and educations, the candidates are selected into different post. The job category includes airport, bank, call centres, hospitals, post office, etc. Apart from these, the UPSC- Union Public Service Commission provides reservations for physically disabled candidates in the civil service exams. Every year limited seats about 27 to 30 are reserved for the physically disabled category.PWD Category: Visual impairment, speech and hearing disability, orthopaedic disability, multiple disabilities. A total number of attempts: Candidates belonging to PH or PWD category are eligible to have ten attempts.Health Ministry has granted approval for admission under Disabilities Quota 3% to 5%. The Ministry of Health and Family Welfare has granted approval to amend the regulation for admission to PG medical courses in order to expand the scope of persons with disabilities . The percentage of seats to be filled up by persons with disabilities has been increased from 3% to 5% in accordance with the Rights of Persons with Disabilities Act, 2016.According to the amended provision, 21 kinds of Disabilities (as per Rights of Persons with Disabilities Act, 2016)",TextToSpeech.QUEUE_FLUSH
                  ,null   );
            }
        });
    }
}
