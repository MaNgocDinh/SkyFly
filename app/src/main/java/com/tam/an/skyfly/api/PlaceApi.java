package com.tam.an.skyfly.api;


import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.tam.an.skyfly.ArrayCallback;
import com.tam.an.skyfly.model.Place;

import org.json.JSONObject;

public class PlaceApi {
    private Context ctx;

    public PlaceApi(Context ctx) {
        this.ctx = ctx;
    }


}
