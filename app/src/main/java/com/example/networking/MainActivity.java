package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    private RecyclerView recyclerView;

    private ArrayList<Mountain> mountains;
    private MountainAdapter mountainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask(this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        mountains = gson.fromJson(json, new TypeToken<ArrayList<Mountain>>(){}.getType());

        // replace broken hyperlinks
        mountains.get(0).auxdata.img = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Chogori.jpg/1920px-Chogori.jpg";
        mountains.get(2).auxdata.img = "https://upload.wikimedia.org/wikipedia/commons/6/60/Matterhorn_from_Domh%C3%BCtte_-_2.jpg";

        recyclerView = findViewById(R.id.mountains);
        mountainAdapter = new MountainAdapter(mountains);
        recyclerView.setAdapter(mountainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
