package com.lproject.cropryiot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class BlogBananaActivity extends AppCompatActivity {
    public RecyclerView featuredRecyclerView;
    public RecyclerView featuredRecyclerView1;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_blog_banana);
        featuredRecyclerView = findViewById(R.id.featured_recyclerview);
        featuredRecyclerView1 = findViewById(R.id.featured_recyclerview1);
        featuredRecyclerView();
        featuredRecyclerView1();
    }

    private void featuredRecyclerView1() {
        featuredRecyclerView1.setHasFixedSize(true);
        featuredRecyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.sigatoka, "Sigatoka", "infected leaves can die,  reducing fruit yield, and causing mixed and premature ripening of fruit bunches"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.nematode, "Nematode", "the most economically important nematode parasite of banana in the world. Infection by burrowing nematode causes toppling disease of banana, yellows disease of pepper and spreading decline of citrus."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.crownrot, "Crownrot", "The disease causes blackening and softening of tissues and begins at or near the cut surface of the crescent-shaped crown where the hand is detached from the main fruit stalk."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.leaverust, "LeaveRust", "It is cause by fungus Uredo musae.  it is seen within plantations near tree lines Banana rust occurs predominantly on older leaves."));

        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecyclerView1.setAdapter(adapter);

    }

    private void featuredRecyclerView() {
        featuredRecyclerView.setHasFixedSize(true);
        featuredRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.soak, "Soak", "Give the seeds a headstart by softening and warming them up. Put the seeds in a bowl and cover them with warm water, changing the water when it cools down. Leave the seeds to soak for 48 hours to help the embryo sprout"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.prepare, "Prepare", "Put seeds in a seed tray indoors. Use potting soil with lots of organic compost and more than half sandy/airy loam. As the seed sprouts and matures, it will need the nutrients provided by the compost."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.sow, "Sow", "Sow seeds 1/4 inches deep in the tray. Sowing seeds outdoors in a bed is not possible unless the soil temperature remains above 68 degrees Fahrenheit."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.water, "Water", "Water the tray so that the soil becomes moist, but not soggy. Take care not to drown the seed, only maintain conditions that are damp as the seed settles in and begins to germinate. Soil that is too wet can cause the seed to rot"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.temperature, "Temperature", "Use a heat mat on a timer to maintain an indoor soil temperature of at least 60 degrees Fahrenheit. Depending on the variety of the banana, it may need as much as 19 hours of cool temperatures and only 5 hours of warm, but research your seed to maintain the correct ratio"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.time, "Give it Time", "You can't rush banana seed germination. Depending on your variety, seeds could germinate in two to three weeks or it could happen in two or more months."));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecyclerView.setAdapter(adapter);


    }
}