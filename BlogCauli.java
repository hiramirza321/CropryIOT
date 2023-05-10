package com.lproject.cropryiot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;

public class BlogCauli extends AppCompatActivity {

    public RecyclerView featuredRecyclerView;
    public RecyclerView featuredRecyclerView1;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_blog_cauli);
        featuredRecyclerView = findViewById(R.id.featured_recyclerview);
        featuredRecyclerView1 = findViewById(R.id.featured_recyclerview1);
        featuredRecyclerView();
        featuredRecyclerView1();
    }

    private void featuredRecyclerView1() {
        featuredRecyclerView1.setHasFixedSize(true);
        featuredRecyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.downy, "Downy Mildew", "a fluffy or powdery-white mass of spores on the under surface of brassica seed leaves (cotyledons) followed by black speckling and puckering of the upper surface"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.damingoff, "Damping Off", "Damping off affects many vegetables and flowers. It is caused by a fungus or mold that thrive in cool, wet conditions."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.bacterialsoft, "Bacterial Soft Rot", "Bacterial soft rot is a major problem during wet weather and can be more severe when plants lack sufficient calcium."));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecyclerView1.setAdapter(adapter);
    }

    private void featuredRecyclerView() {
        featuredRecyclerView.setHasFixedSize(true);
        featuredRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.seedcauli, "Seeding", "cauliflower seeds which are dark brown in color and has round shape. Spring and summers are the best seasons to grow them."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.pot, "Pot", "Choose a pot having at least 12 inches in diameter and 16 to 18 inches across. Fill the pot with potting soil, leaving 1/2 inch of space at the top. Place four seeds in the center of the pot and lightly cover the seeds with soil."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.moist, "Moist the Soil", "Keep the soil moist but not wet. Once the seeds sprout, place the pots near a sunny window or under a grow lamp. It requires about 50 to 80 degrees Fahrenheit."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.support, "Provide Support", "After the seedlings reach 2 inches tall, thin the seedlings to one plant in the pot. Keep the seedlings in six to eight hours of sun every day"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.shade, "Make a Shade","Blanch your cauliflower plant when the head is 2 to 3 inches across. To do this, tie the plant's leaves together to form a shade over the head."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.hharvesttt, "Harvest","The plant takes about 50 to 120 days to mature. You can harvest them once the head size is around 6 to 8 inch across."));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecyclerView.setAdapter(adapter);


    }
}