package com.example.childknowledge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String listnumtext[]={"un 1","deux 2","trois 3","quatre 4","cinq 5","six 6","sept 7","huit 8","neuf 9"};
    int listnumimg[]={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9};
    int listnumaudio[]={R.raw.a1,R.raw.a2,R.raw.a3,R.raw.a4,R.raw.a5,R.raw.a6,R.raw.a7,R.raw.a8,R.raw.a9};
    String listanimalstext[]={"baline","cat","chicken","dog","donkey","goat","goose","horse" ,"pig","tortule"};
    int listanimalsimg[]={R.drawable.baline,R.drawable.cat,R.drawable.chicken,R.drawable.dog,R.drawable.donkey,R.drawable.goat,R.drawable.goose,R.drawable.horse,R.drawable.pig,R.drawable.tortule};
    int listanimalaudio[]={R.raw.whale,R.raw.cat,R.raw.chicken,R.raw.dog,R.raw.whale,R.raw.whale,R.raw.whale,R.raw.horse,R.raw.pig,R.raw.tortule};
    String listformetext[]={"cercle","rectangle","rhombus","square","star","trapezium","triangle"};
    int listformeimg[]={R.drawable.circle,R.drawable.rectangle,R.drawable.rhombus,R.drawable.square,R.drawable.star,R.drawable.trapezium,R.drawable.triangle};
    int listformeaudio[]={R.raw.circle,R.raw.rectangle,R.raw.rhambus,R.raw.square,R.raw.star,R.raw.trapesium,R.raw.triangle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button numero = findViewById(R.id.numero);
        numero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numeroIntent = new Intent(getApplicationContext(),NumActivity.class);
                numeroIntent.putExtra("listnum",listnumtext);
                numeroIntent.putExtra("listimg",listnumimg);
                numeroIntent.putExtra("listaudio",listnumaudio);
                startActivity(numeroIntent);
            }
        });
        Button animal=findViewById(R.id.animal);
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numeroIntent = new Intent(getApplicationContext(),NumActivity.class);
                numeroIntent.putExtra("listnum", listanimalstext);
                numeroIntent.putExtra("listimg", listanimalsimg);
                numeroIntent.putExtra("listaudio", listanimalaudio);
                startActivity(numeroIntent);

            }
        });
        Button forme = findViewById(R.id.formes);
        forme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formeIntent = new Intent (getApplicationContext(),NumActivity.class);
                formeIntent.putExtra("listnum",listformetext);
                formeIntent.putExtra("listimg",listformeimg);
                formeIntent.putExtra("listaudio",listformeaudio);
                startActivity(formeIntent);
            }
        });
    }
}