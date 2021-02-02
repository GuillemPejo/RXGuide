package me.guillem.rxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btRX00Introduccion;
    private Button btRX01Disposable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();
    }

    private void setUpView() {
        btRX00Introduccion = findViewById(R.id.btRX00Introduccion);
        btRX00Introduccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RX00IntroductionActivity.class));
            }
        });


        btRX01Disposable = findViewById(R.id.btRX01Disposable);
        btRX01Disposable.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), RX01DisposableActivity.class));
        }
    });
    }

}
