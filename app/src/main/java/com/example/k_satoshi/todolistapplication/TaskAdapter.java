package com.example.k_satoshi.todolistapplication;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

/**
 * Created by k-satoshi on 2017/03/19.
 */

public class TaskAdapter extends RealmBaseAdapter<Task> {

    public TaskAdapter(@Nullable OrderedRealmCollection<Task> data) {
        super(data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}