package com.catalyst.travller.app.services.gears;

import com.catalyst.travller.app.model.MakesData;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by mudesai on 9/17/16.
 */
public interface GearsService {

    @GET("rest/list_makes")
    Observable<MakesData> getRepos();

}
