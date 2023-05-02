package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    fun getCharacter(): Call<CharacterList>

    @GET("character/{id}")
    fun getSingleCharacter(@Path("id") id: Long): Call<br.senai.sp.jandira.rickandmorty.model.Character>

}