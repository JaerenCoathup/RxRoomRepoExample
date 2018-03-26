//package com.example.jaerencoathup.exampleapp.Adapters;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import com.example.jaerencoathup.exampleapp.R;
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
///**
// * Created by jaerencoathup on 15/05/2017.
// */
//
//public class FollowersAdapter extends RecyclerView.Adapter<FollowersAdapter.ViewHolder> {
//
//    class ViewHolder extends RecyclerView.ViewHolder {
//
//        @BindView(R.id.followerName)
//        TextView followerName;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            ButterKnife.bind(this, itemView);
//        }
//    }
//
//    Context context;
//    List<Follower> followers;
//
//    public FollowersAdapter(Context context, List<Follower> followers) {
//        this.context = context;
//        this.followers = followers;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.follower_list_item, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        Follower follower = followers.get(position);
//        holder.followerName.setText(follower.getLogin());
//    }
//
//    @Override
//    public int getItemCount() {
//        return followers.size();
//    }
//
//}
