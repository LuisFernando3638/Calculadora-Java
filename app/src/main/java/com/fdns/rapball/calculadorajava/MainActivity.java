package com.fdns.rapball.calculadorajava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button BC, BCE, B7, B8, B9, BEn, B4, B5, B6, BPor, B1, B2, B3, BMen, BP, B0, BI, BMas;
    int operador, num1, num2;
    TextView Pantalla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BC=(Button)findViewById(R.id.BC);
        BCE=(Button)findViewById(R.id.BCE);
        B7=(Button)findViewById(R.id.B7);
        B8=(Button)findViewById(R.id.B8);
        B9=(Button)findViewById(R.id.B9);
        BEn=(Button)findViewById(R.id.BEn);
        B4=(Button)findViewById(R.id.B4);
        B5=(Button)findViewById(R.id.B5);
        B6=(Button)findViewById(R.id.B6);
        BPor=(Button)findViewById(R.id.BPor);
        B1=(Button)findViewById(R.id.B1);
        B2=(Button)findViewById(R.id.B2);
        B3=(Button)findViewById(R.id.B3);
        BMen=(Button)findViewById(R.id.BMen);
        BP=(Button)findViewById(R.id.BP);
        B0=(Button)findViewById(R.id.B0);
        BI=(Button)findViewById(R.id.BI);
        BMas=(Button)findViewById(R.id.BMas);

        Pantalla=(TextView)findViewById(R.id.Pantalla);
    }
    public void cero(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("0");
        Pantalla.setText(aux + "0");
    }
    public void uno(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("1");
        Pantalla.setText(aux + "1");
    }
    public void dos(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("2");
        Pantalla.setText(aux + "2");
    }
    public void tres(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("3");
        Pantalla.setText(aux + "3");
    }
    public void cuatro(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("4");
        Pantalla.setText(aux + "4");
    }
    public void cinco(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("5");
        Pantalla.setText(aux + "5");
    }
    public void seis(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("6");
        Pantalla.setText(aux + "6");
    }
    public void siete(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("7");
        Pantalla.setText(aux + "7");
    }
    public void ocho(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("8");
        Pantalla.setText(aux + "8");
    }
    public void nueve(View view){
        double aux=Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("9");
        Pantalla.setText(aux + "9");
    }
    public void c(View view){
        String aux=Pantalla.getText().toString();
        String a=aux.substring(0, Pantalla.length()-1);
        Pantalla.setText(a);
    }
    public void ce(View view){
        Pantalla.setText((""));
        num1=0;
        num2=0;
        operador=1;
    }
    public void div(View view){
        num1=Integer.parseInt(Pantalla.getText().toString());
        operador=2;
    }
    public void mul(View view){
        num1=Integer.parseInt(Pantalla.getText().toString());
        operador=3;
    }
    public void mas(View view){
        num1=Integer.parseInt(Pantalla.getText().toString());
        operador=4;
    }
    public void menos(View view){
        num1=Integer.parseInt(Pantalla.getText().toString());
        operador=5;
    }
    public void punto(View view){
        Pantalla.setText(".");
    }
    public void igual(View view){

    }
}
