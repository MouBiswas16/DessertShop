//package com.example.dessertshop;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//
//import com.example.dessertshop.databinding.ActivityDetailsCakesBinding;
//
//public class DetailsCakes extends AppCompatActivity {
//    ActivityDetailsCakesBinding binding;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_details_cakes);
//        binding = ActivityDetailsCakesBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        Intent intent = this.getIntent();
//        if (intent != null) {
//            String name = intent.getStringExtra("name");
//            String title = intent.getStringExtra("title");
//            String details = intent.getStringExtra("details");
//            int image = intent.getIntExtra("image", R.drawable.vanilla_cake);
////            int id = intent.getIntExtra("id", R.string.vanillaCakeId);
//
//            binding.detailsNameCakes.setText(name);
//            binding.CakeDetailsTitle.setText(title);
//            binding.cakeDetails.setText(details);
//            binding.detailsImageCakes.setImageResource(image);
////            binding.detailId.setInt(id);
//        }
//    }
//}