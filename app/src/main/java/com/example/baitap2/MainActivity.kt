package com.example.baitap2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emailAdapter: EmailAdapter
    private lateinit var emailList: MutableList<MyEmail>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        emailList = mutableListOf<MyEmail>()
        // Thêm dữ liệu
        emailList.add(MyEmail("Báo Cáo Hàng Tháng", "Nguyễn Văn K", "Đính kèm là báo cáo hàng tháng của chúng ta."))
        emailList.add(MyEmail("Yêu Cầu Hỗ Trợ", "Trần Thị L", "Xin vui lòng giúp tôi giải quyết vấn đề này."))
        emailList.add(MyEmail("Chúc Mừng", "Lê Văn M", "Chúc mừng bạn đã hoàn thành dự án thành công!"))
        emailList.add(MyEmail("Cập Nhật Dự Án", "Phạm Văn N", "Dự án đã được cập nhật, hãy kiểm tra chi tiết."))
        emailList.add(MyEmail("Thông Báo Nghỉ Lễ", "Nguyễn Thị O", "Chúng tôi xin thông báo về kỳ nghỉ lễ sắp tới."))
        emailList.add(MyEmail("Hướng Dẫn Sử Dụng", "Trần Văn P", "Xin hãy xem hướng dẫn sử dụng đính kèm."))
        emailList.add(MyEmail("Tổ Chức Sự Kiện", "Lê Thị Q", "Chúng ta cần tổ chức sự kiện vào cuối tháng này."))
        emailList.add(MyEmail("Kiểm Tra Đơn Hàng", "Vũ Văn R", "Xin hãy kiểm tra trạng thái đơn hàng của bạn."))
        emailList.add(MyEmail("Tình Hình Tài Chính", "Ngô Thị S", "Báo cáo tình hình tài chính đã được cập nhật."))
        emailList.add(MyEmail("Cập Nhật Về Nhân Sự", "Đặng Văn T", "Chúng tôi có một số cập nhật về nhân sự trong công ty."))
        emailList.add(MyEmail("Họp Nhóm", "Trần Thị U", "Họp nhóm vào thứ Hai tuần tới, hãy tham gia!"))
        emailList.add(MyEmail("Chia Sẻ Tài Liệu", "Lê Văn V", "Tôi đã chia sẻ tài liệu qua email trước đó."))
        // Thêm nhiều email hơn tùy ý

        emailAdapter = EmailAdapter(emailList)
        recyclerView.adapter = emailAdapter
    }
}