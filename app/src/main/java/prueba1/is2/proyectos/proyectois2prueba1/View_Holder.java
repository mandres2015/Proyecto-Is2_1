package prueba1.is2.proyectos.proyectois2prueba1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import prueba1.is2.proyectos.proyectois2prueba1.Modelo.Hospitales;


/**
 * Created by Alex on 23/11/2017.
 */

public class View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener{

    Button btnHola, btnChao;
    TextView txtTexto;
    ImageView imagen;
    List<Hospitales> listaOb;

    public View_Holder(View itemView, List<Hospitales> listaOb) {
        super(itemView);

        btnHola = (Button) itemView.findViewById(R.id.btnHola);
        btnChao = (Button) itemView.findViewById(R.id.btnChao);
        txtTexto = (TextView) itemView.findViewById(R.id.txtTexto);
        imagen = (ImageView) itemView.findViewById(R.id.contentImage);
        this.listaOb = listaOb;
        /*
        Se usa si no se define el implents View.OnClickListener
        btnHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                }
        });
        */
        btnHola.setOnClickListener(this);
        btnChao.setOnClickListener(this);
        txtTexto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int posicion = getAdapterPosition();
        Hospitales oh = listaOb.get(posicion);
        if (v.getId() == btnHola.getId())
        {
            Toast.makeText(btnHola.getContext(), "He presionado el boton 1 de la imagen "+ posicion + "del item"+ oh.getNombre(), Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(btnHola.getContext(), "He presionado el boton 2 de la imagen "+ posicion + "del item"+ oh.getNombre(), Toast.LENGTH_LONG).show();
        }


    }
}
