package hi.dude.leroymerlin.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import hi.dude.leroymerlin.*

class MainFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = MainFragmentViewModel(activity!!.application, resources)
        val recyclerCategories = view.findViewById<RecyclerView>(R.id.rv_categories)
        val adapterCategory = CategoryRecyclerAdapter(viewModel.getCategories())
        recyclerCategories.adapter = adapterCategory

        val recyclerLimitedOffer = view.findViewById<RecyclerView>(R.id.rv_limited_offer)
        val adapterLimitedOffer = ProductsRecyclerAdapter(viewModel.getProducts())
        recyclerLimitedOffer.adapter = adapterLimitedOffer

        val recyclerBest = view.findViewById<RecyclerView>(R.id.rv_best_price)
        val adapterBest = ProductsRecyclerAdapter(viewModel.getProducts())
        recyclerBest.adapter = adapterBest
    }
}