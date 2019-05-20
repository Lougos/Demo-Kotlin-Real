package gautier.lilian.zibossofdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_author.*

class AuthorFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_author, container,false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Author Info Perso

        val authorName = arguments!!.getString("AuthorName")
        val authorUsername = arguments!!.getString("AuthorUsername")
        val authorEmail = arguments!!.getString("AuthorEmail")

        // Author Info Address

        val authorStreet = arguments!!.getString("AuthorStreet")
        val authorSuite = arguments!!.getString("AuthorSuite")
        val authorCity = arguments!!.getString("AuthorCity")
        val authorZipcode = arguments!!.getString("AuthorZipcode")
        val authorLat = arguments!!.getString("AuthorLat")
        val authorLng = arguments!!.getString("AuthorLng")


        // Author Info Company

        val authorPhone = arguments!!.getString("AuthorPhone")
        val authorWebSite = arguments!!.getString("AuthorWebSite")
        val authorCompanyName = arguments!!.getString("AuthorCompany")
        val authorCompanyCatchPhrase = arguments!!.getString("AuthorCompanyCatchPhrase")
        val authorCompanyTeamBS = arguments!!.getString("AuthorCompanyTeamBS")

        // TextView Info Author

        name.text = authorName
        username.text = authorUsername
        email.text = authorEmail

        // TextView Info Author Address

        street.text = authorStreet
        suite.text = authorSuite
        city.text = authorCity
        zipcode.text = authorZipcode
        geoLat.text = authorLat
        geoLng.text = authorLng

        // TextView Info Author Company

        phone.text = authorPhone
        website.text = authorWebSite
        company.text = authorCompanyName
        companyCatchPhrase.text = authorCompanyCatchPhrase
        companyBs.text = authorCompanyTeamBS

    }

}