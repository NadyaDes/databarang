package com.informatika.databarang.network

import ...

interface ApiService {
    @Get( value: "users")
    fun getUser(): Call<List<ResponseUserItem?>>
}