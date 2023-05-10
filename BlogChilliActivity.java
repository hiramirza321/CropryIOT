package com.lproject.cropryiot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class BlogChilliActivity extends AppCompatActivity {
    public RecyclerView featuredRecyclerView;
    public RecyclerView featuredRecyclerView1;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_blog_chilli);
                featuredRecyclerView = findViewById(R.id.featured_recyclerview);
                featuredRecyclerView1 = findViewById(R.id.featured_recyclerview1);
                featuredRecyclerView();
                featuredRecyclerView1();
            }

            private void featuredRecyclerView1() {
                featuredRecyclerView1.setHasFixedSize(true);
                featuredRecyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

                ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
                featuredLocations.add(new FeaturedHelperClass(R.drawable.mosaic, "Mosaic complex", " The mosaic incidence with leaf filiformity, mosaic mottling and stunted growth was observed in major chilli growing"));
                featuredLocations.add(new FeaturedHelperClass(R.drawable.powdery, "Powdery mildew", "powdery mildew is one of the serious threats to chilli production. The main cause of this disease is Leveilulla taurica fungus"));
                featuredLocations.add(new FeaturedHelperClass(R.drawable.cercospra, "Cercospora leaf spot", "Cercospora leaf spot symptoms are primarily circular lesions with a white center on pepper. The symptoms have a frog-eye appearance."));
                adapter = new FeaturedAdapter(featuredLocations);
                featuredRecyclerView1.setAdapter(adapter);
            }

            private void featuredRecyclerView() {
                featuredRecyclerView.setHasFixedSize(true);
                featuredRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

                ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
                featuredLocations.add(new FeaturedHelperClass(R.drawable.chillisoil, "Seeding", "Spread open a paper towel, place all chilli seeds evenly on it. Then spray some water on them and fold the paper towel close. Now keep this aside for about a week while making sure that the paper towel is regularly sprayed with water to keep it moist and damp. Keep it in a warm and humid place."));
                featuredLocations.add(new FeaturedHelperClass(R.drawable.chilliseed, "Soil and Germinate", "Chilli plants usually require an airy soil which is well drained. Add a little bit of compost to it and give it a good mix. Keep the soil moist but don't overwater it. Water every alternate day or every 2 days depending on the weather."));
                featuredLocations.add(new FeaturedHelperClass(R.drawable.watering, "Moist the Soil", "Once the plant is about 8-10 inches in height, it'll bring out small buds which will blossom into cute little white flowers about 1-1.5 months after planting them."));
                featuredLocations.add(new FeaturedHelperClass(R.drawable.flowering, "Water", "Regularly water and nourish the plant and the chillies will grow bigger and bigger. The bigger they are the more potent their spiciness is."));

                adapter = new FeaturedAdapter(featuredLocations);
                featuredRecyclerView.setAdapter(adapter);

            }
        }