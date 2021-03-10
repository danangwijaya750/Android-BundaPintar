package com.dngwjy.bundapintar.data

data class BulanModel(
    var data: List<DataBulan>
)

data class DataBulan(
    var bulan: Int,
    var min3: Double,
    var min2: Double,
    var min1: Double,
    var median: Double,
    var plus1: Double,
    var plus2: Double,
    var plus3: Double
)