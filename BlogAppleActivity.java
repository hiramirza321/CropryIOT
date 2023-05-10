package com.lproject.cropryiot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class BlogAppleActivity extends AppCompatActivity {
    public RecyclerView featuredRecyclerView;
    public RecyclerView featuredRecyclerView1;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_blog_apple);
        featuredRecyclerView = findViewById(R.id.featured_recyclerview);
        featuredRecyclerView1 = findViewById(R.id.featured_recyclerview1);
        featuredRecyclerView();
        featuredRecyclerView1();
    }

    private void featuredRecyclerView1() {
        featuredRecyclerView1.setHasFixedSize(true);
        featuredRecyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.applescab, "Apple Scab", "Apple scab is caused by the fungus Venturia inaequalis. The apple scab fungus overwinters on fallen diseased leaves"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.appleblackrot, "AppleBlack Rot", "Black rot is caused by the bacteria Xanthamonas campestris pv campestris Black rot often enters farms and gardens via infected seed. Once present, black rot can persist in residues"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.ceddar, "Apple Ceddar Rust", "Cedar-apple rust is a common plant disease caused by the fungal pathogen Gymnosporangium juniperi-virginianae"));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecyclerView1.setAdapter(adapter);

    }

    private void featuredRecyclerView() {
        featuredRecyclerView.setHasFixedSize(true);
        featuredRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.watering, "Water", "Water regularly, but don’t soak. Apples like a moist, well-drained soil, but overwatering can lead to root rot."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.support, "Provide support", "In order to support heavier fruit production later, young trees need help establishing a sturdy frame of branches. Use trellises or posts, trained into a central leader system—a pruning technique that establishes one main trunk with supporting branches sprouting from either side"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.companion, "Practice companion planting", "Apple trees require cross-pollination (with the exception of many self-pollinating varieties like Honeycrisp, Gala, and Cortland) between different cultivars that bloom on the same schedule. Ensure your garden attracts plenty of pollinators by planting attractive, aromatic plants nearby.."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.mulch, "Mulch", "Mulching can help with moisture retention and soil temperature, but be sure to remove it in fall after the harvest to prevent mice from nesting in it over the winter and destroying the bark"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.prune, "Prune","There’s no need to over-prune during the growing season, but do remove any dead or broken branches as you see them. Regular yearly pruning provides good air circulation, which can curb diseases and allows the leaves to dry out quicker after a rain."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.pest1, "Pest", " Companion planting can help repel insects like aphids and mites, and apple maggots can be eradicated with a hanging sticky trap or two, but some trees may require an annual pesticide spraying to keep most bacterial diseases at bay"));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecyclerView.setAdapter(adapter);


    }
}