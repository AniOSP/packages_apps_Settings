
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getAniospVersion(){
        return SystemProperties.get("org.aniosp.version.display","");
    }
}
