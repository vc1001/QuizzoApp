package com.example.quizzoappwithrecyclerviewstaggered;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.os.Bundle;

import com.example.quizzoappwithrecyclerviewstaggered.CustomAdapter.CustomAdapter;
import com.example.quizzoappwithrecyclerviewstaggered.CustomAdapter.mycustomadapter;
import com.example.quizzoappwithrecyclerviewstaggered.Model.model;
import com.example.quizzoappwithrecyclerviewstaggered.Model.quizmodel;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1,recyclerView;
    List<quizmodel> quizmodelList;
    List<model> modelList;
    mycustomadapter myCustomAdapter;
    CustomAdapter mycustomadapter1;
    StaggeredGridLayoutManager staggeredGridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView1=findViewById(R.id.recyclerview1);
        quizmodelList=new ArrayList<>();
        modelList=new ArrayList<>();
        quizmodel c1=new quizmodel("Special Contest",500);
        quizmodel c2=new quizmodel("Premium Contest",1000);
        quizmodel c3=new quizmodel("Special Contest",500);
        quizmodel c4=new quizmodel("Premium Contest",1000);
        quizmodelList.add(c1);
        quizmodelList.add(c2);
        quizmodelList.add(c3);
        quizmodelList.add(c4);

        myCustomAdapter=new mycustomadapter(quizmodelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(myCustomAdapter);
        mycustomadapter1=new CustomAdapter(modelList);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,staggeredGridLayoutManager.VERTICAL);
        recyclerView1.setLayoutManager(staggeredGridLayoutManager);
        recyclerView1.setAdapter(mycustomadapter1);
        IntializeDataintoRecycleview();
    }
    private void  IntializeDataintoRecycleview(){
        model a1=new model("Messi",R.drawable.player1);
        model a2=new model("Ronaldo",R.drawable.player2);
        model a3=new model("Neimar",R.drawable.player3);
        model a4=new model("Messi",R.drawable.player4);
        model a5=new model("Ronaldo",R.drawable.player3);
        modelList.add(a1);
        modelList.add(a2);
        modelList.add(a3);
        modelList.add(a4);
        modelList.add(a5);
        mycustomadapter1.notifyDataSetChanged();

    }
}