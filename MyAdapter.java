package com.lproject.cropryiot;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Patient> {
    Context context;
    List <Patient> arrayListPatient;
    public MyAdapter(@NonNull Context context, List<Patient> arrayListPatient) {
        super(context, R.layout.custom_list_item, arrayListPatient);

        this.context= context;
        this.arrayListPatient= arrayListPatient;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item, null, true);

        TextView tvParam = view.findViewById(R.id.txt_id);
        TextView tvValue = view.findViewById(R.id.txt_tempF);

        tvParam.setText(arrayListPatient.get(position).getParam());
        tvValue.setText(arrayListPatient.get(position).getValue());


        return view;
    }
}
