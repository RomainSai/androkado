package com.example.androkado;

import android.app.Activity;

import com.example.androkado.entities.Article;

import java.util.ArrayList;
import java.util.List;

public class ListeArticles {

    public static List<Article> LIST = new ArrayList<Article>(){
        {
            add(new Article("Article1", 5.0f, "desctription article1",2,"url1"));
            add(new Article("Article2",4.0f,"description article2",2,"url2"));
            add(new Article("Article3",6.0f,"description article3",2,"url3"));
        }

    };
}
