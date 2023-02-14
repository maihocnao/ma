package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Event;
import com.example.myapplication.adapter.EventCurrentAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Current2Fragment extends Fragment {
    private EventCurrentAdapter eventCurrentAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =LayoutInflater.from(getContext()).inflate(R.layout.fragment_current, container,false);
        RecyclerView recyclerView = view.findViewById(R.id.rcv_current_event);
        eventCurrentAdapter = new EventCurrentAdapter(this.getContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        eventCurrentAdapter.setData(getListEvent());
        recyclerView.setAdapter(eventCurrentAdapter);
        return  view;
    }
    private List<Event> getListEvent() {
        List<Event> list = new ArrayList<>();
        list.add(new Event("FPT Korean Festival  (F-Festival)",R.drawable.img_2,"6:00 - 8:00", "AL - 407",120,200));
        list.add(new Event("FPT Korean Festival  (F-Festival)",R.drawable.img_2,"6:00 - 8:00", "AL - 407",130,200));
        list.add(new Event("FPT Korean Festival  ",R.drawable.img_2,"6:00 - 8:00", "AL - 417",123,400));
        list.add(new Event("FPT Korean Festival  (F-Festival)",R.drawable.img_2,"6:00 - 8:00", "AL - 407",110,200));
        return  list;

    }
}
