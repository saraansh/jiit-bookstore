package com.inducesmile.androidpayexample;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.inducesmile.androidpayexample.adapters.ShopRecyclerViewAdapter;
import com.inducesmile.androidpayexample.entities.ProductObject;
import com.inducesmile.androidpayexample.helpers.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class ShoppingActivity extends AppCompatActivity {

    private static final String TAG = ShoppingActivity.class.getSimpleName();

    private RecyclerView shoppingRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        shoppingRecyclerView = (RecyclerView)findViewById(R.id.product_list);
        GridLayoutManager mGrid = new GridLayoutManager(ShoppingActivity.this, 2);
        shoppingRecyclerView.setLayoutManager(mGrid);
        shoppingRecyclerView.setHasFixedSize(true);
        shoppingRecyclerView.addItemDecoration(new SpacesItemDecoration(2, 12, false));

        ShopRecyclerViewAdapter shopAdapter = new ShopRecyclerViewAdapter(ShoppingActivity.this, getAllProductsOnSale());
        shoppingRecyclerView.setAdapter(shopAdapter);
    }


    private List<ProductObject> getAllProductsOnSale(){
        List<ProductObject> products = new ArrayList<ProductObject>();
        products.add(new ProductObject(1, "Book-1", R.drawable.productonesmall, "Reader Favourite", 20, 38, "Hard"));
        products.add(new ProductObject(1, "Book-2", R.drawable.producttwo, "Reader Favourite", 20, 38, "Soft"));
        products.add(new ProductObject(1, "Book-3", R.drawable.productthree, "Reader Favourite", 20, 38, "Soft"));
        products.add(new ProductObject(1, "Book-4", R.drawable.productfour, "Reader Favourite", 20, 38, "Hard"));
        products.add(new ProductObject(1, "Book-5", R.drawable.productfive, "Reader Favourite", 20, 38, "Hard"));
        products.add(new ProductObject(1, "Book-6", R.drawable.productsix, "Reader Favourite", 20, 38, "Soft"));
        return products;
    }
}
