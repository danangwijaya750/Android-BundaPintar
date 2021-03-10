package com.dngwjy.bundapintar.data

data class TbModel(
    var data: List<DataTb>
)
data class DataTb(
    var tb: Double,
    var min3: Double,
    var min2: Double,
    var min1: Double,
    var median: Double,
    var plus1: Double,
    var plus2: Double,
    var plus3: Double
)
