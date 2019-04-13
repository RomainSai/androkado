package com.example.androkado;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Switch;

public class ConfigurationActivity extends AppCompatActivity {

    public final static String CLE_TRI = "CLE_TRI";
    public final static String CLE_PRIX_DEFAUT = "CLE_PRIX_DEFAUT";

    EditText etPrixDefaut;
    Switch tri = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_configuration );
        setTitle( "Configuration" );

        SharedPreferences spIntra = getSharedPreferences( "configuration", MODE_PRIVATE );
        String valeurPrixDefaut = spIntra.getString( CLE_PRIX_DEFAUT,"" );
        Boolean valeurTri = spIntra.getBoolean( CLE_TRI, false );

        etPrixDefaut = findViewById( R.id.et_prixDefaut );
        tri = findViewById( R.id.switchConfiguration );

        

    }
}
