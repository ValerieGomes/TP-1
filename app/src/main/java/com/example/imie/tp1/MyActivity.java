package com.example.imie.tp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MyActivity extends Activity implements View.OnClickListener{

    private EditText txtNom;
    private Button monBoutonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        txtNom = (EditText) findViewById(R.id.editText);
        monBoutonOk = (Button) findViewById(R.id.button);
        monBoutonOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View vue) {
        Intent helloIntent;
        helloIntent = new Intent(MyActivity.this, MyActivity2.class);
        helloIntent.putExtra("texte", txtNom.getText().toString());
        startActivity(helloIntent);
        Log.i("Test : ", txtNom.getText().toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
