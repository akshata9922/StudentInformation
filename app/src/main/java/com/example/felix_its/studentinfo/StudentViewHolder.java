package com.example.felix_its.studentinfo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
ImageView img1;
TextView txtName,txtclgname,txtaddress,txtcourse,txtbranch;
RecyclerViewClickListener listener;


public StudentViewHolder(View itemView ,RecyclerViewClickListener listener)
{
    super(itemView);

    txtName=itemView.findViewById(R.id.txtName);
    this.listener=listener;
    txtclgname=itemView.findViewById(R.id.txtclgname);
    txtcourse=itemView.findViewById(R.id.txtcourse);
    txtbranch=itemView.findViewById(R.id.txtbranch);
    txtaddress=itemView.findViewById(R.id.txtaddress);


    itemView.setOnClickListener(this);

}

    @Override
    public void onClick(View view) {
    listener.onClick(view,getAdapterPosition());

    }
}
