package com.example.androkado.database.daos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.androkado.database.DbOpenHelper;
import com.example.androkado.entities.Utilisateur;

public class UtilisateurDAO implements BaseDAO<Utilisateur> {

    private DbOpenHelper dbOpenHelper = null;
    private SQLiteDatabase db = null;

    public UtilisateurDAO(Context context) {
        dbOpenHelper = new DbOpenHelper(context);
        db = dbOpenHelper.getWritableDatabase();
    }

    @Override
    public Utilisateur select(Long id) {
        return null;
    }

    @Override
    public boolean update(Utilisateur item) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Utilisateur insert(Utilisateur item) {
        return null;
    }
}
