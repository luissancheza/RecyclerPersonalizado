package com.example.luis.recyclerpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();
        AdaptadorPersonajes adapter = new AdaptadorPersonajes(listaPersonajes);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Seleccion: "+listaPersonajes.get(
                        recyclerPersonajes.getChildAdapterPosition(view)).getNombre(),Toast.LENGTH_LONG).show();
            }
        });
        recyclerPersonajes.setAdapter(adapter);
    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("Krusty", " Krusty el Payaso en Hispanoamérica, es un personaje de ficción de la serie de dibujos animados Los Simpson. Su voz original se la da Dan Castellaneta.", R.drawable.krusti));
        listaPersonajes.add(new PersonajeVo("Homero", "Homer Jay Simpson (Homero Simpson en Hispanoamérica y Homer Simpson en España) es un personaje ficticio protagonista de la serie de televisión de dibujos animados Los Simpson.", R.drawable.homero));
        listaPersonajes.add(new PersonajeVo("Marge", "Marjorie Marge Bouvier Simpson es un personaje ficticio de la serie de televisión de dibujos animados Los Simpson. Es la esposa de Homer Simpson y madre de los tres hijos que ha tenido de esta unión amorosa: Bart, Lisa y Maggie.", R.drawable.marge));
        listaPersonajes.add(new PersonajeVo("Bart", "Bartholomew JoJo «Bart» Simpson1 (Bartolomeo J. Simpson en Hispanoamérica), es uno de los personajes ficticios protagonistas de la serie de televisión de dibujos animados Los Simpson. Bart tiene 10 años y es el primogénito,", R.drawable.bart));
        listaPersonajes.add(new PersonajeVo("Lisa", "Lisa fue concebida por el caricaturista Matt Groening y debutó en la televisión el 19 de abril de 1987, en el cortometraje de dibujos animados titulado Good Night del programa de variedades El show de Tracey Ullman.", R.drawable.lisa));
        listaPersonajes.add(new PersonajeVo("Magie", "Maggie fue creada por el dibujante Matt Groening en el vestíbulo de la oficina de James L. Brooks, para debutar en televisión el 19 de agosto de 1985, en el corto Good Night para el programa El show de Tracey Ullman.1", R.drawable.magie));
        listaPersonajes.add(new PersonajeVo("Flanders", "Nedward «Ned» Flanders2 es un personaje ficticio de la serie de televisión de dibujos animados Los Simpson. La voz original en inglés es de Harry Shearer.", R.drawable.flanders));
        listaPersonajes.add(new PersonajeVo("MiltHouse", "Milhouse Mussolini Van Houten es un personaje ficticio de la serie animada Los Simpson, creado por Matt Groening. Es el mejor amigo de Bart Simpson, cursan juntos cuarto grado en la Escuela Primaria de Springfield como alumno de la clase de la profesora Edna Krabappel.", R.drawable.milhouse));
        listaPersonajes.add(new PersonajeVo("Mr. Burns", "Charles Montgomery Burns, más conocido como el señor Burns o Monty Burns, es un personaje ficticio recurrente de la serie de televisión de dibujos animados Los Simpson, creada por Matt Groening.", R.drawable.burns));
    }
}
