package com.skills.interapt.pokemonretrofitworkshop;

import com.google.gson.annotations.SerializedName;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonAPIClass {

    @GET("{name}/{id}/{ability}")
    Call<Pokemon> getPokemon (@Path("name") String name, @Path("id") int id);


    class Pokemon {

        @SerializedName("name")
        private String name;

        @SerializedName("int")
        private int id;

        public String getName() {
            return name;
        }

        public int getId(){
            return id;
        }
    }



}
