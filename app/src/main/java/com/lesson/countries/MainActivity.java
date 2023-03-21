package com.lesson.countries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetData();
        RecyclerView recyclerView=findViewById(R.id.rv);
        CountryAdapter.OnCountryClickListener onCountryClickListener=new CountryAdapter.OnCountryClickListener() {
            @Override
            public void onCountryClick(Country country, int position) {
                Intent intent=new Intent(MainActivity.this,CountryActivity.class);
                intent.putExtra(Country.class.getSimpleName(),country);
                startActivity(intent);
            }
        };
        CountryAdapter adapter=new CountryAdapter(this,list,onCountryClickListener);
        recyclerView.setAdapter(adapter);
    }
    private void SetData()
    {
        list.add(new Country(R.drawable.belorus,"Белоруссия","Минск", 30000000));
        list.add(new Country(R.drawable.kazahstan,"Казахстан","Астана", 50000000));
        list.add(new Country(R.drawable.litva,"Литва","Вильнюс", 1000000));
        list.add(new Country(R.drawable.belorus,"Белоруссия","Минск", 30000000));
        list.add(new Country(R.drawable.kazahstan,"Казахстан","Астана", 50000000));
        list.add(new Country(R.drawable.litva,"Литва","Вильнюс", 1000000));
        list.add(new Country(R.drawable.belorus,"Белоруссия","Минск", 30000000));
        list.add(new Country(R.drawable.kazahstan,"Казахстан","Астана", 50000000));
        list.add(new Country(R.drawable.litva,"Литва","Вильнюс", 1000000));
        list.add(new Country(R.drawable.belorus,"Белоруссия","Минск", 30000000));
        list.add(new Country(R.drawable.kazahstan,"Казахстан","Астана", 50000000));
        list.add(new Country(R.drawable.litva,"Литва","Вильнюс", 1000000));

    }
}