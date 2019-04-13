package com.example.androkado;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.androkado.entities.Article;

public class InfoUrlActivity extends AppCompatActivity implements ArticleFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_url);

        Intent intent = this.getIntent();
        //Article myArticle = (Article) intent.getSerializableExtra("myArticle");

        //TextView nom = this.findViewById(R.id.textViewInfoUrl);
        //nom.setText(myArticle.getUrl());
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = new ArticleFragment();
        fragmentTransaction.add(R.id.fragmentInfoUrl, fragment);
        fragmentTransaction.commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public void onListFragmentInteraction(Article article) {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.itel_configuration :
                Intent navigation = new Intent(this, ConfigurationActivity.class);
                this.startActivity( navigation );
                break;
        }
        return super.onOptionsItemSelected( item );
    }
}
