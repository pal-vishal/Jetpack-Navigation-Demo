package com.example.jetpacknavigationlearning

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_confirm_dialog.*

class ConfirmDialogFragment : BottomSheetDialogFragment() {

     private lateinit var args: SendCashFragmentArgs

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        /*
        kotlin synthetic does not work in onCreateView
         */
        return inflater.inflate(R.layout.fragment_confirm_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val receiverName = args.receiverName
        val amount = args.amount

        continueText.text = "Do you want to send $amount to $receiverName?"

        buttonYes.setOnClickListener {
            Toast.makeText(context,"Sent",Toast.LENGTH_SHORT).show()
            dismiss()
        }
        buttonNo.setOnClickListener { dismiss() }
    }
}