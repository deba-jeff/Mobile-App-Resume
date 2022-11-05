package ukponahiunsijeffery.example.mobileappresume.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ukponahiunsijeffery.example.mobileappresume.R
import ukponahiunsijeffery.example.mobileappresume.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentHomeBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_home, container, false)

        binding.aboutMeButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)
        }

        binding.linkedIn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(LINKEDIN_URL)
            activity?.startActivity(intent)
        }

        binding.twitter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(TWITTER_URL)
            activity?.startActivity(intent)
        }

        return binding.root
    }


    /**
     *  Companion object used to hold constants
     */
    companion object {
        private const val LINKEDIN_URL =
            "https://www.linkedIn.com/in/osadebamwen-jeffery"
        private const val TWITTER_URL =
            "https://twitter.com/debaukpo"
    }


}