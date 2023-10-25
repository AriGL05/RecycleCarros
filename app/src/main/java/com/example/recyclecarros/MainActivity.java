package com.example.recyclecarros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recyclecarros.adapters.CarroAdapter;
import com.example.recyclecarros.models.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Carro> ListadeCarros=new ArrayList<>();
        ListadeCarros.add(new Carro("Rojo","Ferrari"));
        ListadeCarros.add(new Carro("Verde","BMW"));
        CarroAdapter ca=new CarroAdapter(ListadeCarros);
    }
}