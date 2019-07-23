package com.example.socialconnect;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import com.example.socialconnect.Object.Contact;


import java.util.ArrayList;
import java.util.List;

public class MainViewModel implements LifecycleObserver {

    private List<MainViewModel> itemViewModel = new ArrayList<>();
    public RecyclerAdapter adapter;
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void getData() {
        getDetailList();
        adapter = new RecyclerAdapter(itemViewModel);
    }
    private void getDetailList() {
        MainViewModel itemViewModel = new itemViewModel();
        itemViewModel.setName("Ramesh");
        itemViewModel.setContactType("Viber");
        itemViewModel itemViewModel1 = new itemViewModel();
        itemViewModel.add(itemViewModel);
        itemViewModel.add(itemViewModel);
        itemViewModel.add(itemViewModel);
        adapter.notifyDataSetChanged();
    }

    private void add(MainViewModel itemViewModel) {
    }

    private void setName(String ramesh) {
    }

    public RecyclerAdapter getAdapter() {
        return adapter;
    }
}
}
