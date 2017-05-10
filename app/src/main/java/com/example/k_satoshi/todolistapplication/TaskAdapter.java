package com.example.k_satoshi.todolistapplication;

import android.icu.text.SimpleDateFormat;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;
import io.realm.internal.Context;

/**
 * Created by k-satoshi on 2017/03/19.
 */

public class TaskAdapter extends RealmBaseAdapter<Task> {

    private static class ViewHolder {
        TextView deadLine;
        TextView title;
    }

    public TaskAdapter(MainActivity context, OrderedRealmCollection<Task> data) {
        super(context, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(android.R.layout.simple_expandable_list_item_2, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.deadLine = (TextView) convertView.findViewById(android.R.id.text1);
            viewHolder.title = (TextView) convertView.findViewById(android.R.id.text2);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Task task = adapterData.get(position);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
        String formatDate = sdf.format(task.getDeadline());
        viewHolder.deadLine.setText(formatDate);
        viewHolder.title.setText(task.getTitle());
        return convertView;
    }
}
