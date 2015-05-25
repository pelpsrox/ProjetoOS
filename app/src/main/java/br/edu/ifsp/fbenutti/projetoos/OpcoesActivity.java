package br.edu.ifsp.fbenutti.projetoos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class OpcoesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);

        addListenerOnButtonListagemOS();
        //addListenerOnIButtonNovaOS();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_opcoes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addListenerOnIButtonNovaOS() {

        ImageButton imageButton = (ImageButton) findViewById(R.id.ibtnNovaOS);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent it = new Intent(OpcoesActivity.this, OpcoesActivity.class);
                startActivity(it);
            }

        });

    }

    private void addListenerOnButtonListagemOS() {

        Button btnLogar = (Button) findViewById(R.id.btnListagemOS);

        btnLogar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(OpcoesActivity.this, ListagemActivity.class);
                startActivity(it);
            }
        });

    }
}
