package com.example.jetpacknavigationlearning

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_send_cash.*

class SendCashFragment : Fragment() {

    private lateinit var args:SendCashFragmentArgs
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    //    val receiverName  = arguments?.getString("name")
        val receiverName  = args.receiverName
        val amount  = args.amount

        textReceiverName.text = "Send cash to ${receiverName}"
        editAmount.setText(amount.toString())

        button.setOnClickListener {
            if(editAmount.text.toString().isEmpty())
                return@setOnClickListener
            val action = SendCashFragmentDirections.actionSendCashFragmentToConfirmDialogFragment(receiverName,amount)
            findNavController().navigate(action)
        }
        return inflater.inflate(R.layout.fragment_send_cash,container,false)
    }
}