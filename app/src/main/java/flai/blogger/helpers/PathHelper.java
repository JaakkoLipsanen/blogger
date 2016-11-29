package flai.blogger.helpers;

import android.os.Environment;

/**
 * Created by Jaakko on 11.11.2016.
 */
public class PathHelper {
    public static final String FlaiFolderName = Environment.getExternalStorageDirectory() + "/flai";
    public static final String ImageFolderName = PathHelper.FlaiFolderName + "/images_all";
    public static final String ThumbnailCacheFolder = PathHelper.ImageFolderName + "/thumbnails"; // holding the thumbnail
    public static final String HighQualityImageCacheFolder = PathHelper.ImageFolderName + "/1080p"; // holding the 1080p images
    public static final String TempFolderName = PathHelper.FlaiFolderName + "/temp_folder";

    /*
  * gets the last path component
  *
  * Example: getLastPathComponent("downloads/example/fileToZip");
  * Result: "fileToZip"
  */
    public static String getLastComponentOfPath(String filePath) {
        String[] segments = filePath.split("/");
        String lastPathComponent = segments[segments.length - 1];
        return lastPathComponent;
    }
}
