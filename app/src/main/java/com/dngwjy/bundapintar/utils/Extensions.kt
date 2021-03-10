package com.dngwjy.bundapintar.utils

import android.content.Context
import android.util.Log
import com.dngwjy.bundapintar.data.BulanModel
import com.dngwjy.bundapintar.data.TbModel
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader

inline fun <reified T>T.logE(msg:String)=msg.let {
    Log.e(T::class.java.simpleName,it)
}
inline fun<reified T>T.logD(msg: String)=msg.let{
    Log.d(T::class.java.simpleName,it)
}
object JsonReader{
    fun readBulan(ctx: Context,id:Int):BulanModel{
        val inStream=ctx.resources.openRawResource(id)
        val bufferedReader=BufferedReader(InputStreamReader(inStream))
        val read=bufferedReader.use { it.readText() }
        val data = Gson().fromJson(read,BulanModel::class.java)
        bufferedReader.close()
        return data
    }
    fun readTb(ctx: Context,id:Int):TbModel{
        val inStream=ctx.resources.openRawResource(id)
        val bufferedReader=BufferedReader(InputStreamReader(inStream))
        val read=bufferedReader.use { it.readText() }
        val data = Gson().fromJson(read,TbModel::class.java)
        bufferedReader.close()
        return data
    }
}
