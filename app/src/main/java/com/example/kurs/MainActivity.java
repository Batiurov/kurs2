package com.example.kurs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) this.findViewById(R.id.listViews);

        // Создаём ListView, в котором будут храниться данные для списка
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        /* Наполняем List данным. В данном случае данные передаются Объектом,
         * в котором хранятся id, указывающие на флаги в ресурсах, а также
         * на Строки, в которых прописаны названия валют стран и аббревиатуры этих валют */
        list.add(new DataFlags(R.drawable.rus, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.bel, R.string.africa, R.string.africaZAR));
        list.add(new DataFlags(R.drawable.ger, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.arm, R.string.turkish, R.string.turkishTRY));

        /* Создаём адаптер, который будет передавать данные из List`а в
         * элемент ListView и подключаем его непосредственно к ListView`у
         */
        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }
}