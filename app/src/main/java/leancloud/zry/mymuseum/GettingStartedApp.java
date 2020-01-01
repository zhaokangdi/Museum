package leancloud.zry.mymuseum;

import android.app.Application;

import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVOSCloud;

public class GettingStartedApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    AVOSCloud.initialize(this,"ATjSteU8rtNJsXBq96FBzhoS-gzGzoHsz", "MkBHGzglYPOh53UhnGJVFJ5H");
    AVOSCloud.setDebugLogEnabled(true);
    AVAnalytics.enableCrashReport(this, true);
  }
}
