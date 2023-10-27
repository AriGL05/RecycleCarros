package com.example.recyclecarros.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclecarros.R;
import com.example.recyclecarros.models.Carro;

import java.util.List;

public class CarroAdapter extends RecyclerView.Adapter<CarroAdapter.CarroHolder> {
    private List<Carro> listaCarros;

    public CarroAdapter(List<Carro> listaCarros){
        this.listaCarros=listaCarros;
    }

    @NonNull
    @Override
    public CarroAdapter.CarroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly=LayoutInflater.from(parent.getContext());
        View view=ly.inflate(R.layout.itemscarro,parent,false);
        return new CarroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdapter.CarroHolder holder, int position) {
        Carro c=listaCarros.get(position);
        holder.setdata(c);
    }

    @Override
    public int getItemCount() {
        return listaCarros.size();
    }
    public class CarroHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvcolor;
        TextView tvmodelo;
        Carro carro;
        public CarroHolder(@NonNull View itemView) {
            super(itemView);
            tvcolor=itemView.findViewById(R.id.tvColor);
            tvmodelo=itemView.findViewById(R.id.tvModelo);
            tvcolor.setOnClickListener(this);
        }

        public void setdata(Carro c) {
            carro=c;
            tvcolor.setText(c.getColor());
            tvmodelo.setText(c.getModelo());
        }

        @Override
        public void onClick(View view) {
            Log.i("mivalor",carro.getColor());
        }
    }
}
