package ukponahiunsijeffery.example.mobileappresume.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import ukponahiunsijeffery.example.mobileappresume.R
import ukponahiunsijeffery.example.mobileappresume.databinding.FragmentDetailsBinding

class DetailsFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentDetailsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_details, container, false)

        return binding.root
    }

}