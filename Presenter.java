//package com.example.unreallover.meiriyiweng;
//
//import android.support.v4.view.PagerAdapter;
//import android.util.Log;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.List;
//
///**
// * Created by Unreal Lover on 2017/7/17.
// */
//
//public class Presenter {
//    public void sendRequestWithHttpURLConnection(final String rand){
//        String response;
//        String url;
//        String line;
//       new Thread(new Runnable() {
//        @Override
//        public void run() {
//            HttpURLConnection connection = null;
//            BufferedReader reader = null;
//            try {
//                url= new URL(rand);
//                connection = (HttpURLConnection) url.openConnection();
//                connection.setRequestMethod("GET");
//                connection.setConnectTimeout(8000);
//                connection.setReadTimeout(8000);
//                InputStream in = connection.getInputStream();
//                // 下面对获取到的输入流进行读取
//                reader = new BufferedReader(new InputStreamReader(in));
//                response = new StringBuilder();
//                while ((line = reader.readLine()) != null) {
//                    response.append(line);
//                }
//                showResponse(response.toString());
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                if (reader != null) {
//                    try {
//                        reader.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                if (connection != null) {
//                    connection.disconnect();
//                }
//            }
//        }
//    }).start();}
//
//
//    public void showResponse(final String response) {
//
//        TextView responseText;
//        TextView responseTitle;
//        TextView responseAuthor;
//        /*开始提取标题*/
//        Log.e("Showres","shoudao");
//        int t1 = response.indexOf("title", 0);
//        int t2 = response.indexOf("-", t1);
//        int t3 = response.indexOf("-", t2 + 1);
//        int t4 = response.indexOf("<p>", t3);
//        int t5 = response.lastIndexOf("</p>");//括号里再加上  ，t4  会有神奇的事情发生
//        final String title1 = response.substring(t1 + 6, t2);
//        final String title = title1 + "";
//        final String author1 = response.substring(t2 + 1, t3);
//        final String author = " \n" + author1 + " \n";
//        final String text3 = response.substring(t4 + 3, t5);
//        final String text2 = text3.replaceAll("<p>", "");
//        final String text1 = text2.replaceAll("</p>", "\n\n        ");
//        final String text = "        " + text1;
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//// 在这里进行 UI 操作，将结果显示到界面上
//                responseText.setText(text);
//                responseAuthor.setText(author);
//                responseTitle.setText(title);
//                Log.e("PAQ","yichuandi");
//            }
//        });
//    }
//}
