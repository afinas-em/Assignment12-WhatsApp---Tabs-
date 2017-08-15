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

public class Chats extends Fragment {

    String[] chat_title = {"Android Hive", "Chunks @ NMSM", "Neymar Fans", "Renji Mathew", "Subhilesh", "Tech Builder", "Technical Jobs", "BSC CS 2014-2017", "UDSF NMSM", "HACKERS", "+9180806922927", "Umma"};
    String[] chat_text = {"muthu: Adipoly", "Renji Mathew :GudMng", "Muthalib P A :Entha pani", "Renji Mathew :Da", "Subhilesh :Nale ponde", "# : Thats good", "+9165454545 :Opertunity in Bangaluru", "Ramees :Onn podey", "Aslam :meeting maattiyaalo", "Hacker1 :WPA Tester", "+918086922927 :Hii", "Umma : Abi"};
    String[] chat_time = {"10:45 PM", "10:30 PM", "5:00 PM", "4:59 PM", "4:59 PM", "4:00 PM", "10:00 AM", "10:00 AM", "10:00 AM", "10:00 AM", "10:00 AM", "9:30 AM"};
    String[] chat_notification = {"45", "50", "2", "1", "5", "25", "40", "", "", "", "", ""};
    int[] chat_img = {R.drawable.android, R.drawable.job, R.drawable.neymar, R.drawable.renji, R.drawable.subhi, R.drawable.trick, R.drawable.job, R.drawable.bsc, R.drawable.udsf, R.drawable.trick, R.drawable.me, R.drawable.mom};

    ListView chat_list;

    public Chats(){
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.chats, container, false);

        chat_list = (ListView) v.findViewById(R.id.chat_listview_id);
        chat_list.setAdapter(new CustomAdapter());

        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    class MyHolder {

        TextView title;
        ImageView img;
        TextView text;
        TextView time;
        TextView notification;

        MyHolder(View v) {

            title = (TextView) v.findViewById(R.id.group_name_id);
            img = (ImageView) v.findViewById(R.id.img_chat_id);
            text = (TextView) v.findViewById(R.id.group_text_id);
            time = (TextView) v.findViewById(R.id.group_time_id);
            notification = (TextView) v.findViewById(R.id.group_notification_id);
        }

    }


    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return chat_title.length;
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

            view = getActivity().getLayoutInflater().inflate(R.layout.custom_chat,null);
            MyHolder holder = new MyHolder(view);

            holder.title.setText(chat_title[i]);
            holder.img.setImageResource(chat_img[i]);
            holder.text.setText(chat_text[i]);
            holder.time.setText(chat_time[i]);

            if (chat_notification[i] != "")
                holder.notification.setText(chat_notification[i]);
            else {
                holder.notification.setVisibility(View.GONE);
                holder.time.setTextColor(Color.BLACK);
            }
            return view;
        }
    }

}
