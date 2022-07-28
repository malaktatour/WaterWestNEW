package com.example.waterwestnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AlertActivity extends AppCompatActivity {

    Button Home;
    private View _bg__alerts_ek2;
    private View rectangle_40;
    private View rectangle_39;
    private TextView alerts_ek3;
    private ImageView untitled_design__3__2;
    private View rectangle_37;
    private TextView water_is_running_low_;
    private TextView _16_7_22;
    private TextView resolved;
    private View rectangle_40_ek1;
    private TextView you_might_have_a_leak_;
    private TextView _19_7_22;
    private TextView resolved_ek1;
    private View rectangle_41;
    private TextView water_is_running_low__ek1;
    private TextView _22_7_22;
    private TextView resolved_ek2;
    private View rectangle_42;
    private TextView water_is_flowing_;
    private TextView just_now;
    private TextView active;
    private ImageView rectangle_42_ek1;
    private TextView log_out;
    private ImageView icon_ek1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);



        //custom code goes here
        Home = findViewById(R.id.HomeBt);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlertActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}