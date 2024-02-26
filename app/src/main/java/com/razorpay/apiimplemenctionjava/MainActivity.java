package com.razorpay.apiimplemenctionjava;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


  textView=findViewById(R.id.setdata);





        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dummyjson.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface apiService = retrofit.create(ApiInterface.class);
        Call<MyData> call = apiService.getProductData();

        call.enqueue(new Callback<MyData>() {
            @Override
            public void onResponse(Call<MyData> call, Response<MyData> response) {
                if (response.isSuccessful()) {
                    MyData apiResponse = response.body();
                    if (apiResponse != null) {
                        List<Product> products = apiResponse.getProducts();
                        for (Product product : products) {
                            Log.e("Product", "Title: " + products + ", Price: " + product.getPrice());







                        }
                    }
                } else {
                    Log.e("API Call", "Failed to fetch data");
                }
            }

            @Override
            public void onFailure(Call<MyData> call, Throwable t) {
                Log.e("API Call", "Error: " + t.getMessage());
            }
        });
    }
}
