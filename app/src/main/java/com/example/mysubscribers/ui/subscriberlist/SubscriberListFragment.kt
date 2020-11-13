package com.example.mysubscribers.ui.subscriberlist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mysubscribers.R
import com.example.mysubscribers.data.db.entity.SubscriberEntity
import kotlinx.android.synthetic.main.subscriber_list_fragment.*

class SubscriberListFragment : Fragment(R.layout.subscriber_list_fragment) {

    private lateinit var viewModel: SubscriberListViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val subscriberListAdapter = SubscriberListAdapter(
            listOf<SubscriberEntity>(
                SubscriberEntity(1, "Fábio Sales", "fabio@gmail.com"),
                SubscriberEntity(2, "Rose", "rose@gmail.com")
            )
        )

        recycler_subscribers.run{
            setHasFixedSize(true)
            adapter = subscriberListAdapter
        }
    }

}