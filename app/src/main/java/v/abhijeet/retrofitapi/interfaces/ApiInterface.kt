package v.abhijeet.retrofitapi.interfaces

import retrofit2.Call
import retrofit2.http.GET
import v.abhijeet.retrofitapi.data.MyDataItem

interface ApiInterface {

    @GET("posts")
    fun getData(): Call<List<MyDataItem>>
}