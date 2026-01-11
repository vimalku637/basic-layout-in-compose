package com.vk.basiclayoutsincompose.apis

import com.vk.basiclayoutsincompose.data.AlignYourBodyDto
import retrofit2.http.GET

interface SootheApi {
    @GET("products") // e.g. https://api.example.com/products
    suspend fun getAlignYourBody(): List<AlignYourBodyDto>
}
