package com.example.shoppingappui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewProducts);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        productList = new ArrayList<>();
        // Add sample mock data
        productList.add(new Product("Wireless Headphones", "$129.99", android.R.drawable.ic_menu_camera));
        productList.add(new Product("Smart Watch Series 5", "$199.99", android.R.drawable.ic_menu_mylocation));
        productList.add(new Product("Running Sneakers", "$89.50", android.R.drawable.ic_menu_compass));
        productList.add(new Product("Leather Backpack", "$75.00", android.R.drawable.ic_menu_send));

        productAdapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);
    }
}