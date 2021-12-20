package com.tam.an.skyfly.view;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.tam.an.skyfly.Adapter.TransportAdapter;
import com.tam.an.skyfly.R;
import com.tam.an.skyfly.model.Place;
import com.tam.an.skyfly.model.TransportCategories;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    FirebaseFirestore mFirebaseFirestore;
    ArrayList<TransportCategories> mCategoriesList;
    RecyclerView mRcvTransport,mRcvPlace;
    TransportAdapter mTransportAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        mRcvTransport = findViewById(R.id.rcv_categories);
        mRcvPlace=findViewById(R.id.rcv_place);
        mCategoriesList = new ArrayList<>();

        mFirebaseFirestore = FirebaseFirestore.getInstance();
        //read data
        mFirebaseFirestore.collection("CATEGORIES").orderBy("index").get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {

                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot doc : task.getResult()) {
                                mCategoriesList.add(new TransportCategories(doc.get("transport").toString()));
                                Log.d("BBB", "HELLO");
                                mTransportAdapter = new TransportAdapter(HomeActivity.this, mCategoriesList);
                                mRcvTransport.setAdapter(mTransportAdapter);
                            }
                        } else {
                            String error = task.getException().getMessage();
                            Log.d("bbb", error);
                        }
                    }
                });
    }
    private void renderPlace(Place place){

    }

}