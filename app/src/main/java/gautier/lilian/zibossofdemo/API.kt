package gautier.lilian.zibossofdemo


import gautier.lilian.zibossofdemo.User
import gautier.lilian.zibossofdemo.Post
import retrofit2.Call
import retrofit2.http.GET

interface API {

    @GET("/posts")
    fun getPosts(): Call<List<Post>>

    @GET("/users")
    fun getUsers(): Call<List<User>>
}