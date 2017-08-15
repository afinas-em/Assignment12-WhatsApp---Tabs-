package com.example.afinas.whatsapp_affdroid;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Afinas on 8/13/2017.
 */

public class Status extends Fragment {

    ListView listView_status;
    private String[] status_title = {"Renji Mathew","Muthu","Subhilesh","Ashique","Ramees","Rafi","Shafi","Afsal","Abhi","Noufal"};
    private String[] status_time = {"10 minutes ago","12 minutes ago","45 minutes ago","Today, 4:43 PM","Today, 4:21 PM","Today, 4:07 PM","Today, 3:34 PM","Yesterday 11:18 PM","Yesterday 10:50 PM","Yesterday 10:05 PM"};
    private int[] status_img = {R.drawable.renji,R.drawable.mom,R.drawable.subhi,R.drawable.renji,R.drawable.job,R.drawable.android,R.drawable.me,R.drawable.trick,R.drawable.neymar,R.drawable.android,R.drawable.neymar};

    public Status(){
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.status,container,false);
        listView_status = (ListView) v.findViewById(R.id.status_listview_id);

        listView_status.setAdapter(new CustomAdapter());

        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_status,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    class MyHolder {

        TextView title;
        ImageView img;
        TextView time;

        MyHolder(View v) {

            title = (TextView) v.findViewById(R.id.status_name_id);
            img = (ImageView) v.findViewById(R.id.img_status_id);
            time = (TextView) v.findViewById(R.id.status_time_id);
        }

    }


    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return status_title.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getActivity().getLayoutInflater().inflate(R.layout.custom_status,null);
            MyHolder holder = new MyHolder(view);

            holder.title.setText(status_title[i]);
            holder.img.setImageResource(status_img[i]);
            holder.time.setText(status_time[i]);

            return view;
        }
    }
}
