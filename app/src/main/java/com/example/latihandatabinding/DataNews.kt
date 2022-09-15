package com.example.latihandatabinding

import java.io.Serializable

data class DataNews(val judul : String, val tanggal : String, val penulis : String, val gambar : Int, val isiBerita : String) :
    Serializable
