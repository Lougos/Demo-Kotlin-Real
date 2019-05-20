package gautier.lilian.zibossofdemo

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

class PostActivity : AppCompatActivity() {

    lateinit var post: Post
    lateinit var user: User

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_text -> {

                val textFragment = TextFragment()
                val args = Bundle()
                args.putString("text", post.body)
                textFragment.arguments = args
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, textFragment)
                    .commit()

            }
            R.id.navigation_comment -> {

                //supportFragmentManager.beginTransaction()
                  //  .replace(R.id.fragment_layout, CommentFragment())
                    //.commit()

            }
            R.id.navigation_author -> {

                val authorFragment = AuthorFragment()
                val args = Bundle()
                args.putString("AuthorName",user.name)
                args.putString("AuthorUsername",user.username)
                args.putString("AuthorEmail",user.email)
                args.putString("AuthorStreet",user.address.street)
                args.putString("AuthorSuite",user.address.suite)
                args.putString("AuthorCity",user.address.city)
                args.putString("AuthorZipcode",user.address.zipcode)
                args.putString("AuthorLat",user.address.geo.lat)
                args.putString("AuthorLng",user.address.geo.lng)
                args.putString("AuthorPhone",user.phone)
                args.putString("AuthorWebSite",user.website)
                args.putString("AuthorCompany",user.company.name)
                args.putString("AuthorCompanyCatchPhrase",user.company.catchPhrase)
                args.putString("AuthorCompanyTeamBS",user.company.bs)

                authorFragment.arguments = args
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, authorFragment)
                    .commit()

            }
        }
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        post = intent.getSerializableExtra("post") as Post
        user = intent.getSerializableExtra("user") as User

        setContentView(R.layout.activity_post)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)


        val textFragment = TextFragment()
        val args = Bundle()
        args.putString("text", post.body)
        textFragment.arguments = args
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_layout, textFragment)
            .commit()

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
