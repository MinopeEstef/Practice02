package com.example.practice02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailValue = email.getText().toString();
                String passwordValue = password.getText().toString();

                if(emailValue.isEmpty() && passwordValue.isEmpty()){
                    Toast.makeText(MainActivity.this,"Campos Requeridos",Toast.LENGTH_LONG).show();
                }

                Toast.makeText(MainActivity.this,response(emailValue,passwordValue),Toast.LENGTH_LONG).show();
                email.setText("");
                password.setText("");
            }
        });

    }
    private String response(String value, String value2) {
        final String TXT_RESULTADO = "Usuario: %s, Contraseña: %s";
        return String.format(TXT_RESULTADO, value,value2);
    }
}