package com.example.jetpacknavigationlearning

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val navController = findNavController()

        /*
        first way for navigation is using navigation ids of destination fragment.
        not recommended, bcoz we need to use bundle for data sharing.
        next method  for navigation is using action id.
        last way is using direction classes generated by safe args plugin

         */

        sendMoney.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToReceiverFragment()
            navController.navigate(action)

            // navController.navigate(R.id.action_homeFragment_to_receiverFragment)


        }

        viewBalance.setOnClickListener { navController.navigate(R.id.viewBalanceFragment) }

        viewTrans.setOnClickListener { navController.navigate(R.id.viewTransactionFragment) }

        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}