import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.MountainAdapterViewHolder> {
    public MountainAdapter() {
        // TODO
    }

    @NonNull
    @Override
    public MountainAdapter.MountainAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MountainAdapter.MountainAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MountainAdapterViewHolder extends RecyclerView.ViewHolder {
        public MountainAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
