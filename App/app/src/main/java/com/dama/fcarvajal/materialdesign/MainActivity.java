package com.dama.fcarvajal.materialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.app.ToolbarActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        setFloatingActionButton();
    }

    public void setToolbar()
    {
        Toolbar toolbar = (Toolbar)findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Material Design");
        setSupportActionBar(toolbar);
    }

    public void setFloatingActionButton()
    {
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clic en boton flotante", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
