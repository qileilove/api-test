package api.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class LoadConfig {

    private static final String JsonPath = System.getProperty("user.dir") + File.separator + "src" + File.separator
            + "test" + File.separator + "resources" + File.separator + "properties" + File.separator
            + System.getenv("env") + ".json";

    public static String load(String key) {

        try {
            File jsonFile = new File(JsonPath);
            FileReader fileReader = new FileReader(jsonFile);
            Reader jsonReader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = jsonReader.read()) != -1) {

                sb.append((char) ch);

            }
            fileReader.close();
            jsonReader.close();
            JSONObject jobject = JSON.parseObject(sb.toString());
            return jobject.getString(key);
        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
    }

}