package com.lproject.cropryiot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class BlogBarley extends AppCompatActivity {
    public RecyclerView featuredRecyclerView;
    public RecyclerView featuredRecyclerView1;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_blog_barley);

        featuredRecyclerView = findViewById(R.id.featured_recyclerview);
        featuredRecyclerView1 = findViewById(R.id.featured_recyclerview1);
        featuredRecyclerView();
        featuredRecyclerView1();
    }

    private void featuredRecyclerView1() {
        featuredRecyclerView1.setHasFixedSize(true);
        featuredRecyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.brownrust, "Brown Rust", "Severe attacks of brown rust in barley occur mainly in late season. While losses of 15% are quite common, yields can be reduced by up to 50%. However, brown rust in barley is rarely a problem in barley crops treated with a fungicide"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.powdery, "Powdery Mildewpple", "The disease can arise from infected seed but the main source of inoculum is infected stubble and volunteer plants.  The disease spreads by air-borne spores and rain splash."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.ramularia, "Ramularia", "The main source of Ramularia is seed infection, although secondary infections can occur during the season from airborne spores released from infected crops, grasses or volunteers."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.yellowrust, "Yellow Rust", "Stripe (yellow) rust, caused by Puccinia striiformis f. sp. tritici (Pst), is a serious disease of wheat occurring in most wheat areas with cool and moist weather conditions during the growing season"));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecyclerView1.setAdapter(adapter);
    }

    private void featuredRecyclerView() {
        featuredRecyclerView.setHasFixedSize(true);
        featuredRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.spacing, "Spacing", "Scatter seed across a fallow bed, or sow in the rows with twenty– twenty-five seeds per foot."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.bearing, "Months to Bearing", "Two months once growth begins in spring"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.pruning, "Pruning", "It doesn't require pruning"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.harvest, "Harvest", "Spring-sown barley matures in about 70 days; fall-planted barley ripens about 60 days after growth resumes in the spring. Reap when barley is dry."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.type, "Barley Type","Barley comes in two distinct types: two-row or six-row. The type you choose will depend, in part, on your region."));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecyclerView.setAdapter(adapter);

    }
}