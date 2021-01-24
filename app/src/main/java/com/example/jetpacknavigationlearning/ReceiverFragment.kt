package com.example.jetpacknavigationlearning

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_receiver.*

class ReceiverFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        buttonNext.setOnClickListener {
            val receiverName = edit_receiver_name.text.toString()
            //  val args = Bundle()

            //  args.putString("name", receiverName)

            /*
            safe args plugin let you show compile time error while passing data rather than at runtime
            if we use default value in navigation graph xml file , then that argument will become optional.
             */
            val action = ReceiverFragmentDirections.actionReceiverFragmentToSendCashFragment(
                receiverName,232)
            findNavController().navigate(action)
        }

        return inflater.inflate(R.layout.fragment_receiver, container, false)
    }
}