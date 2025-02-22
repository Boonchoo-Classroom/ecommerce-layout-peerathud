package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import scisrc.mobiledev.ecommercelayout.R
import android.widget.Button
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProductListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_list, container, false)

        val buttonStationery: Button = view.findViewById(R.id.category_stationery)
        val buttonOutfit:Button =view.findViewById(R.id.category_clothing)
        val buttonsport:Button =view.findViewById(R.id.category_sports)
        val buttonheadphone:Button=view.findViewById(R.id.category_gadgets)

        buttonStationery.setOnClickListener { navigateToCategory(StationaryFragment()) }
        buttonOutfit.setOnClickListener { navigateToCategory(OutfitFragment()) }
        buttonsport.setOnClickListener { navigateToCategory(SportFragment()) }
        buttonheadphone.setOnClickListener { navigateToCategory(HeadphoneFragment()) }
        return view
    }

    private fun navigateToCategory(fragment: Fragment) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}