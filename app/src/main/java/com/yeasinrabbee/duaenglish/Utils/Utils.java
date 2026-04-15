package com.yeasinrabbee.duaenglish.Utils;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Utils {


    public static String getJson(int type) {

        if (type == Constant.Constant1) {
            return "json1.json";
        }
        if (type == Constant.Constant2) {
            return "json2.json";

        }
        if (type == Constant.Constant3) {
            return "json3.json";
        }
        if (type == Constant.Constant4) {
            return "json4.json";
        }
        if (type == Constant.Constant5) {
            return "json5.json";

        }
        if (type == Constant.Constant6) {
            return "json6.json";
        }
        if (type == Constant.Constant7) {
            return "json7.json";
        }
        if (type == Constant.Constant8) {
            return "json8.json";
        }
        if (type == Constant.Constant9) {
            return "json9.json";
        }
        if (type == Constant.Constant10) {
            return "json10.json";
        }
        if (type == Constant.Constant11) {
            return "json11.json";
        }

        return null;
    }


    public static String conNum(String num) {

        String n = "";

        for (int i = 0; i < num.length(); i++) {

            n = n + bangla(num.charAt(i));
        }

        return n;

    }

    static String bangla(char c) {

        if (c == '1') return "১";
        if (c == '2') return "২";
        if (c == '3') return "৩";
        if (c == '4') return "৪";
        if (c == '5') return "৫";
        if (c == '6') return "৬";
        if (c == '7') return "৭";
        if (c == '8') return "৮";
        if (c == '9') return "৯";
        if (c == '0') return "০";

        return "0";

    }

    /* // Load json From Assets
  public static String loadJsonfromcachdir(Context context, String file_name) {
      String json = null;
      try {
          InputStream is = context.getAssets().open(file_name);
          int size = is.available();
          byte[] buffer = new byte[size];
          is.read(buffer);
          is.close();
          json = new String(buffer, "UTF-8");
      } catch (IOException ex) {
          ex.printStackTrace();
          return null;
      }
      return json;
  }
*/
    public static File createFileFromInputStream(Context context) {

        File newF = new File("/data/data/"+context.getPackageName(),"databases");
        if (!newF.exists()) newF.mkdir();



        AssetManager am = context.getAssets();
        InputStream inputStream = null;
        try {
            inputStream = am.open("hisnul.db");
            File f = new File(newF,"hisnul.db");
            OutputStream outputStream = new FileOutputStream(f);
            byte buffer[] = new byte[1024];
            int length = 0;

            while((length=inputStream.read(buffer)) > 0) {
                outputStream.write(buffer,0,length);
            }

            outputStream.close();
            inputStream.close();

            return f;
        } catch (IOException e) {
           return null;
        }


    }

    public interface  OnComplete{
        void done(String name);
    }




}
