# WebviewSampleUsingAppBajarLib

Someone asked to me to make a simple tutorial to load the webpage properly into the Android Webview. 
He tried several times by own but didn't able to load all images properly. 
So I decided to make a YouTube tutorial about creating an Android WebView project using AppBajar Library to make the things effective and easier.


 private void initUI() {

        myWebview=(WebView)findViewById(R.id.mywebview);

        WebViewFormatter.formatWebViewWithClient(myWebview,true,true); // That is the MAGIC line to make the program easier.

        myWebview.loadUrl("http://weeklyaraihazar.com/");


    }

Please use the code if needed and check the video from YouTube. Don't forget to subscribe my channel to get more updates about Android programming.

