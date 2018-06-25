package com.skills.interapt.pokemonretrofitworkshop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonFragment extends Fragment {

    @BindView(R.id.ability_textview)
    protected TextView pokemonAbility;

    @BindView(R.id.pokemon_imageview)
    protected ImageView pokemonSpirte;

    @BindView(R.id.name_textview)
    protected TextView pokemonName;

    @BindView(R.id.go_back_button)
    protected Button goBackButton;


    //onCreate view used for fragments. take out the return.super. insert view. attachToRoot is always false.
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokemon, container, false);
        ButterKnife.bind(this, view);
        return view;
    }




}
