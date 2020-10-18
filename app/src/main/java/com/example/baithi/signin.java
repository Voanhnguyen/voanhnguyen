package com.example.baithi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baithi.adapter.CustomAdapter;
import com.example.baithi.model.Contact;

import java.util.ArrayList;
import java.util.List;

import static com.example.baithi.R.id.back;

public class signin extends AppCompatActivity {
    ImageView imview;
    ImageView imview1, imview2;
    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        lvContact = (ListView) findViewById(R.id.lv_item);

        ArrayList<Contact> arrayList = new ArrayList<Contact>();

        Contact contact1 = new Contact(R.drawable.logo, "Võ Anh Nguyên","099 991 xxxx");
        Contact contact2 = new Contact(R.drawable.logo, "Võ Hoàng Lâm","099 991 2222");
        Contact contact3 = new Contact(R.drawable.logo, "Trương Minh Đạt","099 991 3333");
        Contact contact4 = new Contact(R.drawable.logo, "Trần Chí","099 991 5555");
        Contact contact5 = new Contact(R.drawable.logo, "Võ Thanh Thoại","099 991 4444");
        Contact contact6 = new Contact(R.drawable.logo, "Trương Minh Đạt","099 991 3333");
        Contact contact7 = new Contact(R.drawable.logo, "Trần Chí","099 991 5555");
        Contact contact8 = new Contact(R.drawable.logo, "Võ Thanh Thoại","099 991 4444");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item,arrayList);
        lvContact.setAdapter(customAdapter);
        imview = (ImageView) findViewById(R.id.back);
        imview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signin.this, profile.class);
                startActivity(intent);
            }
        });
        imview1 = (ImageView) findViewById(R.id.back2);
        imview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signin.this, MainActivity.class);
                startActivity(intent);
            }
        });
        imview2 = (ImageView) findViewById(R.id.bottom);
        imview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signin.this, profile.class);
                startActivity(intent);
            }
        });
    }
}

