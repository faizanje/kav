import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.hfdevs.kav.R
import com.hfdevs.kav.data.model.KavNewOrderItemData
import com.hfdevs.kav.databinding.NeworderLayout1Binding
import com.hfdevs.kav.data.model.NewOrderItemData
import com.hfdevs.kav.databinding.KavNeworderLayoutBinding

class KavNewOrderAdapter(var datalist:List<KavNewOrderItemData>) : RecyclerView.Adapter<KavNewOrderAdapter.MyViewHolder>(){

    class MyViewHolder( var binding: KavNeworderLayoutBinding) :RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(KavNeworderLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


           holder.binding.tvTitle.setText(datalist[position].title)
           holder.binding.tvSubTitle.setText(datalist[position].subTitle)
           holder.binding.imIcon.setImageResource(datalist[position].image)


        holder.binding.btnLayout.setOnClickListener{ view ->
                 if(position==0){
                    view.findNavController().navigate(R.id.action_overviewFragment_to_kavNewOrderFragment)
//                  Navigation.createNavigateOnClickListener(R.id.clientNewOrderFragment,null)
                 }
            if(position==1){
                view.findNavController().navigate(R.id.action_overviewFragment_to_clientNewOrderFragment)
//                  Navigation.createNavigateOnClickListener(R.id.clientNewOrderFragment,null)
            }

           }

    }

    override fun getItemCount(): Int {
        return  datalist.size
    }

}