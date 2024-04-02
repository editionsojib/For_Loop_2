package com.editions.for_loop_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button button, button2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editText= findViewById(R.id.edText);
        button= findViewById(R.id.btn);
        button2= findViewById(R.id.btn_2);
        textView= findViewById(R.id.textView);



       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String S_edText= editText.getText().toString();

               if (S_edText.isEmpty()){
                   editText.setText("1");
               }else {
                   int i_edtText= Integer.parseInt(S_edText);

                   int x= 0;
                   for (x=1; x<=10; x++){

                       textView.append(" "+i_edtText+"*"+x+"="+x*i_edtText+"\n");
                   }

               }


           }
       });

       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               textView.setText("");
               editText.setText("");
           }
       });








//Test namta ==============================================================
//        int x= 0;
//        for (x=1; x<=10;x++){
//
//            textView.append(" 5*"+x+"="+x*5+"\n");
//        }
//Test namta ==============================================================




    }
}