package com.grv.dev.decoderdemo.Interface;



import com.grv.dev.decoderdemo.Model.RootObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ChatService {

    @GET ("test_json/chat.json")

    Call<List<RootObject>> getRootObject();


}
