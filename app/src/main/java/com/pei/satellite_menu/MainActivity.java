package com.pei.satellite_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ext.SatelliteMenu;
import android.view.ext.SatelliteMenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SatelliteMenu menu = (SatelliteMenu) findViewById(R.id.menu);
        List<SatelliteMenuItem> items = new ArrayList<>();
        items.add(new SatelliteMenuItem(4, R.mipmap.ic_launcher));
        items.add(new SatelliteMenuItem(4, R.mipmap.ic_launcher));
        items.add(new SatelliteMenuItem(4, R.mipmap.ic_launcher));
        items.add(new SatelliteMenuItem(3, R.mipmap.ic_launcher));
        items.add(new SatelliteMenuItem(2, R.mipmap.ic_launcher));
        items.add(new SatelliteMenuItem(1, R.mipmap.ic_launcher));

        menu.addItems(items);
        menu.setOnItemClickedListener(new SatelliteMenu.SateliteClickedListener() {
            @Override
            public void eventOccured(int id) {
                Toast.makeText(MainActivity.this, "id"+id, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
