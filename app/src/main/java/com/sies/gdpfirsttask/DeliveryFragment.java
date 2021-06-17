package com.sies.gdpfirsttask;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class DeliveryFragment extends Fragment {

    RecyclerView recyclerView;
    CollapsingToolbarLayout collapsingToolbarLayout;
    TextView noOfHotels;
    private final String[][] details = {
            { "Heirloom Cafe", "Lord of the Fries", "Planet of the Grapes", "Rich Table", "Montana Restaurant", "Mama’s Fish House", "Eatmore Fried Chicken", "California Pizza Kitchen", "Hungry Puppets", "Indian tulip", "Desi Addict", "Double Dell Restaurant", "Crazy Grill", "Sling Delight", "Food Sparks", "Foody Dots", "Red Caffino", "Tasty Elements", "Zoës Kitchen", "The Saddle River Inn", "Rainforest Cafe", "Peking Inn", "Juan in a Million", "Fishing With Dynamite", "Famous Lunch", "Pro Fast Food Link", "Urbane Food", "Divine lunch", "Healthy Food Restaurant", "Rabbit food house", "Decadent Desire", "Cube Eatery", "Backyard Bowls", "The supper club", "Dinning Terris", "Paradise food zone", "Spice mystery", "Vintage Kitchen", "Salty Sow", "Ancient Steak House", "Sandwich Society", "4th Street Dining Hall" },
            { "2.3", "5.0", "4.9", "3.7", "3.6", "2.3", "4.5", "4.8", "2.9", "4.2", "2.7", "2.0", "2.1", "3.4", "2.4", "3.6", "3.0", "2.9", "3.6", "2.9", "2.8", "4.4", "2.9", "4.4", "4.6", "4.6", "3.5", "2.6", "1.9", "4.6", "4.1", "4.8", "5.0", "4.0", "5.0", "2.6", "4.7", "3.8", "2.2", "4.6", "3.2", "4.2" },
            { "09:00 to 21:05", "09:05 to 21:15", "09:10 to 21:25", "09:20 to 21:30", "09:25 to 21:35", "09:30 to 21:45", "09:40 to 22:00", "09:45 to 22:05", "09:50 to 22:20", "09:55 to 22:25", "10:00 to 22:30", "10:05 to 22:35", "10:10 to 22:45", "10:15 to 22:50", "10:20 to 22:55", "10:30 to 23:00", "10:35 to 23:15", "10:45 to 23:20", "10:55 to 23:25", "11:00 to 23:25", "09:00 to 21:05", "09:05 to 21:15", "09:10 to 21:25", "09:20 to 21:30", "09:25 to 21:35", "09:30 to 21:45", "09:40 to 22:00", "09:45 to 22:05", "09:50 to 22:20", "09:55 to 22:25", "10:00 to 22:30", "10:05 to 22:35", "10:10 to 22:45", "10:15 to 22:50", "10:20 to 22:55", "10:30 to 23:00", "10:35 to 23:15", "10:45 to 23:20", "10:55 to 23:25", "11:00 to 23:25", "10:35 to 23:15", "10:45 to 23:20", "10:35 to 23:00" },
            { "282 Longbranch Street Dearbor", "26 Temple Ave. Lithonia", "639 Longbranch Lane Detroit", "7409 Riverside Dr. Massapequ", "50 Peachtree Circle Sewell", "210 Peg Shop Rd. Mancheste", "3 High St. Clover", "407 Mountainview Street Lad", "751 Willow St. Mishawaka", "5B Sunset St. Quincy", "401 Edgewood Ave. Summerville", "232 Hill Court Cheshire", "8393 Princess Street Sandusky", "323 Lafayette Avenue Sout", "78 Rockville Dr. Kalispell", "7606 Charles Lane Verno", "881 Lees Creek St. Lakewood", "446 N. Newport St. Chatsworth", "677 Buckingham Ave. Wilmette", "29 Somerset St. Lombard", "732 Union Ave. Parkville", "482 Van Dyke Court Mchenry", "284 South Arnold Ave. Clemmons", "8772 St Louis St. Titusville", "1 Bayport Ave. Chesterfield", "8981 Vermont Dr. Niceville", "840 S. New Saddle Street Shepherdsville", "8149 Briarwood Court Roseville", "79 North Glendale St. Willingboro", "812 Shadow Brook Dr. Middleton", "971 Pennsylvania Street Beave", "973 Valley Drive Chesapeake", "255 Lancaster St. Ozon", "7650 Surrey Street Havertown", "461 El Dorado Avenue Parkersburg", "303 Blue Spring St. Ne", "726 Edgewater Street Harvey", "7434 4th St. Florence", "7374 Greenview Street Clearwater", "9131 Sycamore Drive Rapi", "8547 Thatcher St. Whitehall", "8848 3rd Dr. Acworth" },
            { "Indonesian Cuisine", "Sicilian Cuisine", "Seafood", "Laotian Cuisine", "Jewish Food", "Algerian Food", "Belgian Foods", "Mongolian Cuisine", "Cajun Food", "Thai Cuisine", "Cambodian Cuisine", "Mexican Cuisine", "Chilean Cuisine", "Spanish Cuisine", "Pakistani Cuisine", "Russian Food", "Argentinian Cuisine", "Peruvian Food", "Scottish Food", "Iranian Cuisine", "Italian Cuisine", "Brazilian Food", "Cambodian Cuisine", "Ethiopian Food", "Thai Cuisine", "Chilean Cuisine", "Mongolian Cuisine", "Greek Cuisine", "Nepalese Cuisine", "Korean Food", "Seafood", "Algerian Food", "Sri Lankan Cuisine", "German Cuisine", "Cambodian Cuisine", "Australian Cuisine", "Malaysian Cuisine", "Portuguese Food", "German Cuisine", "Laotian Cuisine", "United Kingdom Cuisine", "Guatemalan Cuisine", "Indian Cuisine" }
    };

    private final int[] drawables = {
            R.drawable.pizza, R.drawable.food1, R.drawable.food2, R.drawable.food3, R.drawable.food4, R.drawable.food5, R.drawable.food6, R.drawable.food7, R.drawable.food8, R.drawable.food9, R.drawable.food10, R.drawable.pizza, R.drawable.food1, R.drawable.food2, R.drawable.food3, R.drawable.food4, R.drawable.food5, R.drawable.food6, R.drawable.food7, R.drawable.food8, R.drawable.food9, R.drawable.food10, R.drawable.pizza, R.drawable.food1, R.drawable.food2, R.drawable.food3, R.drawable.food4, R.drawable.food5, R.drawable.food6, R.drawable.food7, R.drawable.food8, R.drawable.food9, R.drawable.food10, R.drawable.pizza, R.drawable.food1, R.drawable.food2, R.drawable.food3, R.drawable.food4, R.drawable.food5, R.drawable.food6, R.drawable.food9, R.drawable.food10
    };
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_delivery, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        collapsingToolbarLayout = view.findViewById(R.id.collapsingToolbarLayout);

        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        noOfHotels = view.findViewById(R.id.noOfHotels);
        noOfHotels.setText(details[0].length + " Restaurants");

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new RecyclerAdapter(details, drawables));

        return view;
    }
}