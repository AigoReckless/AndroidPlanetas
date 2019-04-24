package com.example.planetas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class PlanetaFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_planeta, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String nombrePlaneta = this.getArguments().getString("tipoPlaneta");
        Toast.makeText(this.getContext(), nombrePlaneta, Toast.LENGTH_LONG).show();

        pintaPlaneta(nombrePlaneta);

    }

    public void pintaPlaneta(String nombrePlaneta) {
       ImageView imagenPlaneta = getView().findViewById(R.id.imagenPlaneta);
        TextView nombreDePlaneta = getView().findViewById(R.id.nombrePlaneta);
        nombreDePlaneta.setText(nombrePlaneta);
       switch (nombrePlaneta){
           case "Tierra":
               imagenPlaneta.setImageResource(R.drawable.earth);

               break;
           case "Mercurio":
               imagenPlaneta.setImageResource(R.drawable.mercury);
               break;
           case "Venus":
               imagenPlaneta.setImageResource(R.drawable.venus);
               break;
           case "Jupiter":
               imagenPlaneta.setImageResource(R.drawable.jupiter);
               break;
           case "Saturno":
               imagenPlaneta.setImageResource(R.drawable.saturn);
               break;
           case "Urano":
               imagenPlaneta.setImageResource(R.drawable.uranus);
               break;
           case "Marte":
               imagenPlaneta.setImageResource(R.drawable.mars);
               break;
           case "Pluton":
               imagenPlaneta.setImageResource(R.drawable.pluton);
               break;
           case "Neptuno":
               imagenPlaneta.setImageResource(R.drawable.neptune);
               break;
       }
    }
}
