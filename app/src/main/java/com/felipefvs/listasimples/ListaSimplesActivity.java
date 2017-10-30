package com.felipefvs.listasimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.felipefvs.listasimples.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ListaSimplesActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText qtdEditText;
    private Button addButton;
    private ListView list;

    ArrayAdapter<Item> itemAdapter;
    List<Item> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_simples);

        nameEditText = findViewById(R.id.nameEditText);
        qtdEditText = findViewById(R.id.qtdEditText);
        addButton = findViewById(R.id.addButton);
        list = findViewById(R.id.listView);

        items = new ArrayList<Item>();
        itemAdapter = new ArrayAdapter<Item>(this, android.R.layout.simple_list_item_1, items);

        list.setAdapter(itemAdapter);



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Item item = new Item();
                item.setName(nameEditText.getText().toString());
                item.setQtd(Integer.parseInt(qtdEditText.getText().toString()));

                addItem(item);
            }
        });

    }

    void addItem(Item item)
    {
        itemAdapter.add(item);
    }
}
