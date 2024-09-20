package com.example.appbanhang.retrofit;

import com.example.appbanhang.model.LoaiSpModel;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiBanHang {
    @GET("getloadsp.php")
    Observable<LoaiSpModel> getLoaiSp();
}
