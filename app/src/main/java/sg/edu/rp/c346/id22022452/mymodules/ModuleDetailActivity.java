package sg.edu.rp.c346.id22022452.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView modNum;
    TextView details;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        modNum = findViewById(R.id.module);
        details = findViewById(R.id.info);
        back = findViewById(R.id.backbtn);

        Intent intentreceived = getIntent();
        String modCode = intentreceived.getStringExtra("ModuleCode");
        if (modCode.equals("C203"))
        {
            modNum.setText("C203");
            details.setText("Module Code: C203\nModule Name: Web Appln Development\n" +
                    "Academic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64N");
        }
        if (modCode.equals("C206"))
        {
            modNum.setText("C206");
            details.setText("Module Code: C206\nModule Name: Software Development Process\n" +
                    "Academic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64N");
        }
        if (modCode.equals("C218"))
        {
            modNum.setText("C218");
            details.setText("Module Code: C218\nModule Name: UI/UX Design for Apps\n" +
                    "Academic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64N");
        }
        if (modCode.equals("C235"))
        {
            modNum.setText("C235");
            details.setText("Module Code: C235\nModule Name: IT Security and Management\n" +
                    "Academic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64N");
        }
        if (modCode.equals("C346"))
        {
            modNum.setText("C346");
            details.setText("Module Code: C346\nModule Name: Mobile App Development\n" +
                    "Academic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: E63A");
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}