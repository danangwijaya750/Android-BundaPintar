package com.dngwjy.bundapintar.ui.status_gizi

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import com.dngwjy.bundapintar.data.BulanModel
import com.dngwjy.bundapintar.data.TbModel
import com.dngwjy.bundapintar.utils.JsonReader
import com.dngwjy.bundapintar.utils.logE
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_calculator.btn_hitung
import kotlinx.android.synthetic.main.activity_calculator.et_bb
import kotlinx.android.synthetic.main.activity_calculator.et_nama
import kotlinx.android.synthetic.main.activity_calculator.et_tb
import kotlinx.android.synthetic.main.activity_calculator.et_usia
import kotlinx.android.synthetic.main.activity_calculator.iv_back
import kotlinx.android.synthetic.main.activity_calculator.sp_jenis_kelamin
import kotlinx.android.synthetic.main.activity_calculator.sp_kategori
import org.joda.time.LocalDate
import org.joda.time.Months
import java.text.SimpleDateFormat
import java.util.*

class CalculatorActivity : BaseActivity() {
    private var bulan = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        iv_back.setOnClickListener {
            onBackPressed()
        }
        et_usia.setOnClickListener {
            val currentDateTime = Calendar.getInstance()
            val startYear = currentDateTime.get(Calendar.YEAR)
            val startMonth = currentDateTime.get(Calendar.MONTH)
            val startDay = currentDateTime.get(Calendar.DAY_OF_MONTH)

            DatePickerDialog(
                this, { _, year, month, day ->
                    val pickedDateTime = Calendar.getInstance()
                    pickedDateTime.set(year, month, day)
                    val sdf = SimpleDateFormat("yyyy-MM-dd")
                    val pickedStr = sdf.format(pickedDateTime.time)
                    val age =
                        Months.monthsBetween(LocalDate.parse(pickedStr), LocalDate.now()).months
                    bulan = age
                    et_usia.setText("$pickedStr ($age Bulan)")
                },
                startYear,
                startMonth,
                startDay
            ).show()
        }
        btn_hitung.setOnClickListener {
            if(et_nama.text.toString()==""||et_bb.text.toString()==""||et_tb.text.toString()==""||et_usia.text.toString()==""){
                Toast.makeText(this, "Isikan Data Dengan Lengkap", Toast.LENGTH_SHORT).show()
            }else {
                if(et_tb.text.toString().toDouble()<45){
                    Toast.makeText(this,"Tinggi Badan Minimal 45cm", Toast.LENGTH_SHORT).show()
                }else{
                    when (sp_kategori.selectedItemPosition) {
                        0 -> {
                            Toast.makeText(this, "Pilih Kategori", Toast.LENGTH_SHORT).show()
                        }
                        1 -> {
                            when (sp_jenis_kelamin.selectedItemPosition) {
                                0 -> {
                                    Toast.makeText(this, "Pilih Jenis Kategori", Toast.LENGTH_SHORT)
                                        .show()
                                }
                                1 -> {
                                    if (bulan < 24) {
                                        val data1 = JsonReader.readBulan(this, R.raw.pb_u_lk)
                                        val data2 = JsonReader.readBulan(this, R.raw.bb_u_lk)
                                        val data3 = JsonReader.readTb(this, R.raw.pb_bb_lk)
                                        processData(data1, data2, data3)
                                    } else {
                                        val data1 = JsonReader.readBulan(this, R.raw.tb_u_lk)
                                        val data2 = JsonReader.readBulan(this, R.raw.bb_u_lk)
                                        val data3 = JsonReader.readTb(this, R.raw.tb_bb_lk)
                                        processData(data1, data2, data3)
                                    }
                                }
                                2 -> {
                                    if (bulan < 24) {
                                        val data1 = JsonReader.readBulan(this, R.raw.pb_u_pr)
                                        val data2 = JsonReader.readBulan(this, R.raw.bb_u_pr)
                                        val data3 = JsonReader.readTb(this, R.raw.pb_bb_pr)
                                        processData(data1, data2, data3)
                                    } else {
                                        val data1 = JsonReader.readBulan(this, R.raw.tb_u_pr)
                                        val data2 = JsonReader.readBulan(this, R.raw.bb_u_pr)
                                        val data3 = JsonReader.readTb(this, R.raw.tb_bb_pr)
                                        processData(data1, data2, data3)
                                    }
                                }
                            }
                        }
                        2 -> {
                            when (sp_jenis_kelamin.selectedItemPosition) {
                                0 -> {
                                    Toast.makeText(this, "Pilih Jenis Kategori", Toast.LENGTH_SHORT)
                                        .show()
                                }
                                1 -> {
                                    val data1 = JsonReader.readBulan(this, R.raw.tb_u_lk)
                                    val data2 = JsonReader.readBulan(this, R.raw.bb_u_lk)
                                    val data3 = JsonReader.readTb(this, R.raw.tb_bb_lk)
                                    processData(data1, data2, data3)

                                }
                                2 -> {
                                    val data1 = JsonReader.readBulan(this, R.raw.tb_u_pr)
                                    val data2 = JsonReader.readBulan(this, R.raw.bb_u_pr)
                                    val data3 = JsonReader.readTb(this, R.raw.tb_bb_pr)
                                    processData(data1, data2, data3)
                                }
                            }
                        }
                        3 -> {
                            when (sp_jenis_kelamin.selectedItemPosition) {
                                0 -> {
                                    Toast.makeText(this, "Pilih Jenis Kategori", Toast.LENGTH_SHORT)
                                        .show()
                                }
                                1 -> {

                                    val data1 = JsonReader.readBulan(this, R.raw.tb_u_lk)
                                    val data2 = JsonReader.readBulan(this, R.raw.bb_u_lk)
                                    val data3 = JsonReader.readTb(this, R.raw.tb_bb_lk)
                                    processData(data1, data2, data3)

                                }
                                2 -> {
                                    val data1 = JsonReader.readBulan(this, R.raw.tb_u_pr)
                                    val data2 = JsonReader.readBulan(this, R.raw.bb_u_pr)
                                    val data3 = JsonReader.readTb(this, R.raw.tb_bb_pr)
                                    processData(data1, data2, data3)

                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private fun processData(data1: BulanModel, data2: BulanModel, data3: TbModel) {
        val filtered = data2.data.filter { it.bulan == bulan }
        val median = filtered[0].median
        val diff = et_bb.text.toString().toDouble() - median
        var simpangan = if (diff >= 0) {
            filtered[0].plus1 - median
        } else {
            median - filtered[0].min1
        }
        val zScoreBB = diff / simpangan
        val statusGizi =
            if (zScoreBB < -3.0) {
                "Berat Badan Sangat Kurang"
            } else if (zScoreBB < -2.0 && zScoreBB >= -3.0) {
                "Berat Badan Kurang"
            } else if (zScoreBB <= 1.0 && zScoreBB >= -2.0) {
                "Berat Badan Normal"
            } else {
                "Resiko Berat Badan Lebih"
            }
        val filteredData1=data1.data.filter { it.bulan==bulan }
        val medianData1=filteredData1[0].median
        val diffData1=et_tb.text.toString().toDouble() - medianData1
        var simpanganData1=if(diffData1>=0){
            filteredData1[0].plus1-medianData1
        }else{
            medianData1 - filteredData1[0].min1
        }
        val zScoreTB=diffData1/simpanganData1
        val statusTB =
            if (zScoreTB < -3.0) {
                "Sangat Pendek"
            } else if (zScoreTB < -2.0 && zScoreTB >= -3.0) {
                "Pendek"
            } else if (zScoreTB <= 3.0 && zScoreTB >= -2.0) {
                "Normal"
            } else {
                "Tinggi"
            }
        val tb = et_tb.text.toString().toDouble()
        logE("tb = $tb")
        val filteredData3=data3.data.filter { it.tb == tb }
        val medianData3=filteredData3[0].median
        val diffData3=et_tb.text.toString().toDouble() - medianData3
        val simpanganData3=if(diffData3>=0){
            filteredData3[0].plus1-medianData3
        }else{
            medianData3 - filteredData3[0].min1
        }
        val zScoreBBTB = diffData3/simpanganData3
        val statusBBTB =
            if (zScoreBBTB < -3.0) {
                "Gizi Buruk"
            } else if (zScoreBBTB < -2.0 && zScoreBBTB >= -3.0) {
                "Gizi Kurang"
            } else if (zScoreBBTB <= 1.0 && zScoreBBTB >= -2.0) {
                "Gizi Normal"
            } else if (zScoreBBTB <= 2.0 && zScoreBBTB > 1.0) {
                "Beresiko Gizi Lebih"
            }  else if (zScoreBBTB <= 3.0 && zScoreBBTB > 2.0) {
                "Gizi Lebih"
            } else {
                "Obesitas"
            }
        showDialog(statusGizi,statusTB,statusBBTB)
    }
    private fun showDialog(statusTB:String,statusBB:String,statusBBTB:String){
        val view= layoutInflater.inflate(R.layout.layout_status_gizi,null)
        val tvNama=view.findViewById<TextView>(R.id.tv_nama)
        val tvTtl=view.findViewById<TextView>(R.id.tv_ttl)
        val tvTb=view.findViewById<TextView>(R.id.tv_tb)
        val tvBb=view.findViewById<TextView>(R.id.tv_bb)
        val tvStatusTb=view.findViewById<TextView>(R.id.tv_status_tb)
        val tvStatusBb=view.findViewById<TextView>(R.id.tv_status_bb)
        val tvStatusBbtb=view.findViewById<TextView>(R.id.tv_status_bb_tb)
        tvNama.text="${et_nama.text.toString()}"
        tvTtl.text="${et_usia.text.toString()}"
        tvTb.text="${et_tb.text.toString()} cm"
        tvBb.text="${et_bb.text.toString()} Kg"
        tvStatusBb.text="$statusBB"
        tvStatusTb.text="$statusTB"
        tvStatusBbtb.text="$statusBBTB"
        val builder= AlertDialog.Builder(this)
        builder.setView(view)
        builder.apply {
            setCancelable(false)
            setPositiveButton("Ok") { dialog, it ->
                dialog.dismiss()
            }
            setNegativeButton("Kembali"){dialog,it->
                dialog.dismiss()
            }
        }
        builder.create().show()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}