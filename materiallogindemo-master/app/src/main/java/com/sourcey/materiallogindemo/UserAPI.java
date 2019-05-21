package com.sourcey.materiallogindemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserAPI {
    @GET("/mihaicata/Android/master/{json}")
    Call<List<User>> getUsers(@Path("json") String jsonToFetch);

}
