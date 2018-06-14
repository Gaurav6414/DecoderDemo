package com.grv.dev.decoderdemo.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.grv.dev.decoderdemo.Model.RootObject;
import com.grv.dev.decoderdemo.R;
import com.squareup.picasso.Picasso;

import java.util.List;



public class ChatAdapter extends RecyclerView.Adapter{

    public final static int MSG_TYPE_SENT = 100;

    public final static int MSG_TYPE_RECEIVED = 101;

    TextView user,text_sent,text_rec;
    ImageView user_image;



    private List<RootObject> objects;
    Context mContext;

    public ChatAdapter(List<RootObject> objects, Context mContext) {
        this.objects = objects;
        this.mContext = mContext;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        if (viewType == MSG_TYPE_SENT) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.chat_ui, parent, false);
            return new SentMessageHolder(view);
        } else if (viewType == MSG_TYPE_RECEIVED) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.chat_ui2, parent, false);
            return new ReceivedMessageHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RootObject message = (RootObject) objects.get(position);

        switch (holder.getItemViewType()) {
            case MSG_TYPE_SENT:
                ((SentMessageHolder) holder).bind(message);
                break;
            case MSG_TYPE_RECEIVED:
                ((ReceivedMessageHolder) holder).bind(message);
        }




    }


    @Override
    public int getItemCount() {
        return objects.size();
    }

    @Override
    public int getItemViewType(int position) {
        RootObject object = this.objects.get(position);

        if (object.getIs_sent_by_me()) {
            // If the current user is the sender of the message
            return MSG_TYPE_SENT ;
        } else {
            // If some other user sent the message
            return MSG_TYPE_RECEIVED;
        }
    }

    class SentMessageHolder extends RecyclerView.ViewHolder {



        public SentMessageHolder(View itemView) {
            super(itemView);


                text_sent = itemView.findViewById(R.id.text_message_body);
                user = itemView.findViewById(R.id.text_message_name);
            user_image =itemView.findViewById(R.id.image_message_profile);


        }
        void bind(RootObject objects) {
            text_sent.setText(objects.getText());
            user.setText(objects.getUser_name());
            Picasso.get().load(objects.getUser_image_url()).into(user_image);
        }

    }

    class ReceivedMessageHolder extends RecyclerView.ViewHolder {





        public ReceivedMessageHolder(View itemView) {
            super(itemView);



            text_rec = itemView.findViewById(R.id.text_message_body);
            user = itemView.findViewById(R.id.text_message_name);
            user_image =itemView.findViewById(R.id.image_message_profile);



        }

        void bind(RootObject object) {
            text_rec.setText(object.getText());
            user.setText(object.getUser_name());
            Picasso.get().load(object.getUser_image_url()).into(user_image);
        }
    }
}


