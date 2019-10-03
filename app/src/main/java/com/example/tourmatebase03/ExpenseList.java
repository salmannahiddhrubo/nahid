package com.example.tourmatebase03;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ExpenseList extends AppCompatActivity {
    private RecyclerView expenseRecyclerView;
    private FloatingActionButton expenseFab;
    private TextView showEventBudgetTV;
    Event event;
    private List<Event> eventList;
    private FirebaseDatabase efirebaseDatabase;
    DatabaseReference eventRef;
    private FirebaseUser user;
    EventAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_list);
        showEventBudgetTV = findViewById(R.id.showBudgetTV);
        expenseFab = findViewById(R.id.addexpenseFab);
        expenseRecyclerView = findViewById(R.id.expenseRecylerView);


    }

    public void addEvent(View view) {
        startActivity(new Intent(ExpenseList.this,AddExpense.class));
    }
}
