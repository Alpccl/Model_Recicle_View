package com.example.model_recicle_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.model_recicle_view.databinding.WordItemListBinding;

import java.util.List;
                                //3. extender Recycler view
                                //4. Implementar Method
public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder>{

    //1. añadir representacion de datos

    private List<String>mWordList;

    //Constructor para Pasar datos
    public WordAdapter(List<String> mWordList) {
    this.mWordList = mWordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //6.  Instaciar ViewBinding para retornar nuestro viewHolder con esa dependencia
        WordItemListBinding mBinding = WordItemListBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new WordViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {

        //Creamos variable de referencia
        //Visual que tiene el Holder
        String element = mWordList.get(position);
        holder.textView.setText(element);

    }

    @Override
    public int getItemCount() {

        //Cantidad de Datos a Mostrar
        return mWordList.size();
    }

    // 2. crear nueva clase

    public class WordViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public WordViewHolder(@NonNull WordItemListBinding mBinding) {
            super(mBinding.getRoot());
            textView = mBinding.textView;
        }
    }


}
