package com.example.recyclecarros.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdapter.CarroHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class CarroHolder extends RecyclerView.ViewHolder{

        public CarroHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
