package com.example.tourmatebase03;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {


    List<Event> eventList;
    private Context context;



    public EventAdapter(List<Event> eventList, Context context) {
        this.eventList = eventList;
        this.context = context;


    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from( context )
                .inflate( R.layout.event_row,viewGroup,false );

        EventViewHolder eventViewHolder = new EventViewHolder( view);
        return eventViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, int i) {

        final Event event = eventList.get( i );

        eventViewHolder.eventName.setText( event.getName() );
        eventViewHolder.eventDestination.setText( event.getDestination() );
        eventViewHolder.eventBudget.setText( String.valueOf(event.getBudget()) );

        eventViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context,ExpenseList.class));


            }
        });


    }

    @Override
    public int getItemCount() {

        return eventList.size();
    }


    class EventViewHolder extends RecyclerView.ViewHolder  {

        TextView eventName, eventDestination, eventBudget;


        public EventViewHolder(@NonNull View itemView) {
            super( itemView );
            eventName = itemView.findViewById( R.id.row_eventNameTV );
            eventDestination = itemView.findViewById( R.id.row_eventDestinationTV );
            eventBudget = itemView.findViewById( R.id.row_eventBudgetTV );


        }



    }



}