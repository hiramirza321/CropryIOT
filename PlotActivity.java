package com.lproject.cropryiot;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
public class PlotActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

        EditText name, contact, dob;
        Button insert, update, delete, view;
        DBHelper DB;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_plot);
            Button button2 = (Button) findViewById(R.id.pick);
            name = findViewById(R.id.name);
            contact = findViewById(R.id.contact);
            dob = findViewById(R.id.dob);
            insert = findViewById(R.id.btnInsert);
            update = findViewById(R.id.btnUpdate);
            delete = findViewById(R.id.btnDelete);
            view = findViewById(R.id.btnView);
            DB = new DBHelper(this);
            button2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    DialogFragment datePicker = new DatePickerFragment();
                    datePicker.show(getSupportFragmentManager(),"datepicker");
                }
            });
            insert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String nameTXT = name.getText().toString();
                    String contactTXT = contact.getText().toString();
                    String dobTXT = dob.getText().toString();

                    Boolean checkinsertdata = DB.insertuserdata(nameTXT, contactTXT, dobTXT);
                    if (checkinsertdata == true)
                        Toast.makeText(PlotActivity.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(PlotActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
                }
            });
            update.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String nameTXT = name.getText().toString();
                    String contactTXT = contact.getText().toString();
                    String dobTXT = dob.getText().toString();

                    Boolean checkupdatedata = DB.updateuserdata(nameTXT, contactTXT, dobTXT);
                    if (checkupdatedata == true)
                        Toast.makeText(PlotActivity.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(PlotActivity.this, "New Entry Not Updated", Toast.LENGTH_SHORT).show();
                }
            });
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String nameTXT = name.getText().toString();
                    Boolean checkudeletedata = DB.deletedata(nameTXT);
                    if (checkudeletedata == true)
                        Toast.makeText(PlotActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(PlotActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
                }
            });

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Cursor res = DB.getdata();
                    if (res.getCount() == 0) {
                        Toast.makeText(PlotActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    StringBuffer buffer = new StringBuffer();
                    while (res.moveToNext()) {
                        buffer.append("Name of Crop:" + res.getString(0) + "\n");
                        buffer.append("Number of acre:" + res.getString(1) + "\n");
                        buffer.append("Planting Date :" + res.getString(2) + "\n\n");
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(PlotActivity.this);
                    builder.setCancelable(true);
                    builder.setTitle("User Entries");
                    builder.setMessage(buffer.toString());
                    builder.show();
                }
            });


        }

        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
            Calendar c = Calendar.getInstance();
            c.set(Calendar.YEAR,year);
            c.set(Calendar.MONTH,month);
            c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
            EditText textviewDate = findViewById(R.id.dob);
            textviewDate.setText(currentDate);

        }
    }