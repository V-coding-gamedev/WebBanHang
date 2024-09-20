plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.appbanhang"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.appbanhang"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
//    thư viện dùng để tải và hiển thị hình ảnh từ URL vào dự án Android
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    // Thư viện core giúp lập trình phản ứng (reactive) bằng cách cung cấp công cụ để xử lý dữ liệu theo cách bất đồng bộ và sự kiện không đồng bộ.
    implementation ("io.reactivex.rxjava3:rxjava:3.0.0")

    // Một phần mở rộng của RxJava giúp dễ dàng sử dụng RxJava với các thành phần Android, như chuyển đổi giữa các thread (luồng) và tương tác với UI.
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.0")

    // Retrofit: một thư viện của Square giúp dễ dàng thực hiện các cuộc gọi HTTP và REST API
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")

    //  giúp Retrofit chuyển đổi (convert) dữ liệu từ định dạng JSON sang các đối tượng Java sử dụng thư viện Gson.
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    // Đây là Retrofit RxJava3 Adapter, một adapter cho phép Retrofit tương thích với RxJava3.
    implementation ("com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0")


    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}