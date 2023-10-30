package com.example.quizzoappwithrecyclerviewstaggered.CustomAdapter;


        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.example.quizzoappwithrecyclerviewstaggered.Model.model;
        import com.example.quizzoappwithrecyclerviewstaggered.R;

        import java.util.List;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewholder> {
    List<model> modelList;
    Context context;
    public CustomAdapter(List<model> modelList) {
        this.modelList = modelList;
        this.context=context;
    }
    @NonNull
    @Override
    public CustomAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.practicequiz_layout,parent,false);
        return new viewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.viewholder holder, int position) {
        model model=modelList.get(position);
        holder.playername.setText(model.getPlayername());
        holder.playerimage.setImageResource(model.getPlayerimage());
    }
    @Override
    public int getItemCount() {
        return modelList.size();
    }
    public static class viewholder extends RecyclerView.ViewHolder{
        TextView playername;
        ImageView playerimage;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            playername=itemView.findViewById(R.id.name1);
            playerimage=itemView.findViewById(R.id.image1);
        }
    }
}
