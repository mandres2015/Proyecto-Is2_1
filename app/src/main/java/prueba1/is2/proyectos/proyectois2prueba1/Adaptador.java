package prueba1.is2.proyectos.proyectois2prueba1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

import prueba1.is2.proyectos.proyectois2prueba1.Modelo.Hospitales;

/**
 * Created by Alex on 25/11/2017.
 */

public class Adaptador extends RecyclerView.Adapter<View_Holder> {

    List<Hospitales> listaHospitales;

    public Adaptador(List<Hospitales> listaHospitales) {
        this.listaHospitales = listaHospitales;
    }


    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card, parent, false);
        return new View_Holder(vista, listaHospitales);
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {
        holder.txtTexto.setText(listaHospitales.get(position).getNombre());
        holder.imagen.setImageResource(listaHospitales.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return listaHospitales.size();
    }
}
