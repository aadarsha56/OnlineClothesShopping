package com.example.onlineclothesshopping.API;

import com.example.onlineclothesshopping.Model.ItemModel;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ItemAPI {

    @Multipart
    @POST("uploadimg")
    Call<String> uploadItemImage (@Part MultipartBody.Part multipartbody);

    @FormUrlEncoded
    @POST("insertitem")
    Call<ItemModel> insertItem(@Field("itemName") String itmname, @Field("itemPrice") String itmprice, @Field("itemImageName") String itmimgname, @Field("itemDescription") String itmdescription);

    @GET("showItems")
    Call<List<ItemModel>> getItems();
}
