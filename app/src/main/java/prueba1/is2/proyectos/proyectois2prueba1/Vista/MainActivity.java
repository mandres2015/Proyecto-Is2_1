package prueba1.is2.proyectos.proyectois2prueba1.Vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import prueba1.is2.proyectos.proyectois2prueba1.Adaptador;
import prueba1.is2.proyectos.proyectois2prueba1.Modelo.Hospitales;
import prueba1.is2.proyectos.proyectois2prueba1.R;

public class MainActivity extends AppCompatActivity {

    TextView btnVentana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Hospitales> listaH = new ArrayList<>();
        listaH.add(new Hospitales("Teófilo Dávila", "Boyacá", "7-12", "Lunes-Domingo", "Hospital de Machala", R.drawable.imagenuno));
        listaH.add(new Hospitales("La Cigueña", "Colón", "7-12", "Lunes-Domingo", "Clinica de Machala", R.drawable.imagendos));
        listaH.add(new Hospitales("Suiza", "Boyacá", "7-12", "Lunes-Domingo", "Clihospital de Machala", R.drawable.imagentres));


        RecyclerView contenedor = (RecyclerView) findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new Adaptador(listaH));
        contenedor.setLayoutManager(layout);
//        btnVentana = (TextView) findViewById(R.id.btnVentana);
//        btnVentana.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v)
//            {
//                Intent t = new Intent(MainActivity.this, ActivityCard.class);
//                startActivity(t);
//                Toast.makeText(MainActivity.this, "LLegué a la ventana 2", Toast.LENGTH_SHORT).show();
//            }
//        });

    }



}
