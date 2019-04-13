package com.example.androkado;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.androkado.database.daos.BaseDAO;
import com.example.androkado.database.daos.UtilisateurDAO;
import com.example.androkado.entities.Article;
import com.example.androkado.entities.Utilisateur;

public class MainActivity extends FragmentActivity implements BlankFragment.OnFragmentInteractionListener {

    private static final  String TAG = "MainActivity";
    private Article article = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* début de l'implémentation du fragment 2 */
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        BlankFragment fragment = new BlankFragment();
        fragmentTransaction.add(R.id.fragment1, fragment);
        fragmentTransaction.commit();
        /* Fin de fragment 2 */


        final Article article = new Article("Pain au chocolat",
                1.0f,
                "Une vienoiserie au beurre et au chocolat",
                3,
                "test url");
        TextView nom = this.findViewById(R.id.textView);
        nom.setText(article.getLibelle());
        EditText prix = this.findViewById(R.id.editText);
        prix.setText(article.getPrice().toString() + " €");
        TextView description = this.findViewById(R.id.textView2);
        description.setText(article.getDescription());
        RatingBar rating = this.findViewById(R.id.ratingBar);
        rating.setRating(article.getDegree());
        ImageButton button = this.findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigation = new Intent(MainActivity.this, InfoUrlActivity.class);
                // on utilise MainActivity.this devqnt le this car on est dans une fonction anonyme
                MainActivity.this.startActivity(navigation);
            }
        });
        BaseDAO<Utilisateur> daoUtilisateur = new UtilisateurDAO(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public void onFragmentInteraction() {
        Toast.makeText(this,"hi from fragment",Toast.LENGTH_SHORT).show();
    }
}
