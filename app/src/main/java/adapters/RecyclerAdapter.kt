package adapters

    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView
    import com.example.application.R
    import elements.Model


class RecyclerAdapter(private val items: List<Model>,
                      private val event: (View) -> Unit) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.text_recycler1)
        val descriptionTextView: TextView = itemView.findViewById(R.id.text_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle, parent, false)
        itemView.setOnClickListener {
            event(it)
        }
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            titleTextView.text = items[position].title
            descriptionTextView.text = items[position].description

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
