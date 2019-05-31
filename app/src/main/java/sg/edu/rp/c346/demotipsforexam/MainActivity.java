package sg.edu.rp.c346.demotipsforexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayAdapter examTipsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        String[] examTips;

        examTips = new String[5];

        examTips[0] = "Prepare way befor the exam";
        examTips[1] = "Practice coding";
        examTips[2] = "Seek help from lecturer";
        examTips[3] = "Prepare template code";
        examTips[4] = "Create empty projects for MSA";

        examTipsArray = new ArrayAdapter(this, android.R.layout.simple_list_item_1, examTips);
        lvExamTips.setAdapter(examTipsArray);

    }
}
