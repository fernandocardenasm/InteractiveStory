package com.example.usuario.interactivestory.model;

/**
 * Created by usuario on 12/03/2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

}
