package tw.org.cic.morsenser_example_api;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent it = getIntent();
        Bundle bundle = it.getBundleExtra("send");


        TextView city = (TextView) findViewById(R.id.city);
        TextView temp_value2 = (TextView) findViewById(R.id.temp_value2);
        TextView humid_value2 = (TextView) findViewById(R.id.humid_value2);
        TextView sun_value2 = (TextView) findViewById(R.id.sun_value2);

        String get = bundle.getString("County");
        String UV_SENSOR = bundle.getString("UV_SENSOR");
        String TEMP_SENSOR = bundle.getString("TEMP_SENSOR");
        String HUMID_SENSOR = bundle.getString("HUMID_SENSOR");

        city.setText(get);
        temp_value2.setText(TEMP_SENSOR+"°C");
        humid_value2.setText(HUMID_SENSOR+"%");
        sun_value2.setText(UV_SENSOR);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        String[] data = {"a","b","c","d"};
        int[] a = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};
        // specify an adapter (see also next example)

        mAdapter = new MyAdapter(data,a);
        mRecyclerView.setAdapter(mAdapter);


    }

}


