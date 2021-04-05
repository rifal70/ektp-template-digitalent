# ektp-template-digitalent
template resources layout file android studio (Group 1 Digitalent Telkom)

dependecies di build.gradle app
          ↓↓↓
           

dependencies {

    implementation 'androidx.appcompat:appcompat:1.2.0'
    implementation 'com.google.android.material:material:1.3.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    implementation 'com.google.android.gms:play-services-maps:17.0.0'
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'

    // OTP PIN View
    implementation 'com.chaos.view:pinview:1.4.4'

    // Navigation Components
    implementation "androidx.navigation:navigation-fragment-ktx:2.3.4"
    implementation "androidx.navigation:navigation-ui-ktx:2.3.4"

    implementation "androidx.recyclerview:recyclerview:1.1.0"
}
