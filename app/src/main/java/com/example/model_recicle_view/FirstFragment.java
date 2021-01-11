package com.example.model_recicle_view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.model_recicle_view.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {


    private FragmentFirstBinding mBinding;
    private List<String> datalist = new ArrayList<>();


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {


        mBinding = FragmentFirstBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Instancia el adapter y se pasa el listado de datos con el metodo SetData

        WordAdapter wordAdapter = new WordAdapter(setData());

        mBinding.recyclerView.setAdapter(wordAdapter);

        //indicamos para mostrar los elememtos, puede usarse tambien GridLayout o StaggeredLayout

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));



    }

    private List<String> setData(){
        for (int i=0; i <99;i ++){
            datalist.add("Palabra : " + i );
        }
        return datalist;
    }
}