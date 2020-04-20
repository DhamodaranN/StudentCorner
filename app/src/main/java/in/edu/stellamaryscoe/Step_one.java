package in.edu.stellamaryscoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Step_one extends AppCompatActivity {
EditText reg,otp;
Button check;
Button verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_one);

        verify=(Button)findViewById(R.id.verify);
        verify.setVisibility(View.INVISIBLE);


        check =(Button) findViewById(R.id.check);
        reg =(EditText)findViewById(R.id.regno);
        otp =(EditText)findViewById(R.id.otp);
        otp.setVisibility(View.INVISIBLE);


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"please check the otp sent to xxxx",Toast.LENGTH_LONG).show();
                check.setVisibility(View.GONE);
                otp.setVisibility(View.VISIBLE);
                verify.setVisibility(View.VISIBLE);
            }
        });
verify.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View v) {
                                  Intent i =new Intent(Step_one.this,Steptwo.class);
                                  startActivity(i);
                              }
                          }
);

        }

    public void already(View view) {
        Intent i =new Intent(Step_one.this,StudentLogin.class);
        startActivity(i);
    }
}







