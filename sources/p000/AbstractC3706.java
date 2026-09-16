package p000;

import java.io.File;

/* JADX INFO: renamed from: ۦٌؙٖؒ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3706 extends AbstractC3831 {
    /* JADX INFO: renamed from: ۥِ */
    public static File m6566(File file) {
        int iM1521;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        char c = File.separatorChar;
        int iM1522 = AbstractC0684.m1521(c, 0, 4, path);
        int length = 1;
        if (iM1522 == 0) {
            if (path.length() > 1 && path.charAt(1) == c && (iM1521 = AbstractC0684.m1521(c, 2, 4, path)) >= 0) {
                int iM1523 = AbstractC0684.m1521(c, iM1521 + 1, 4, path);
                length = iM1523 >= 0 ? 1 + iM1523 : path.length();
            }
        } else if (iM1522 <= 0 || path.charAt(iM1522 - 1) != ':') {
            length = (iM1522 == -1 && path.length() > 0 && AbstractC2133.m4157(path.charAt(AbstractC0684.m1529(path)), ':', false)) ? path.length() : 0;
        } else {
            length = 1 + iM1522;
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        if (string.length() == 0 || (string.length() > 0 && AbstractC2133.m4157(string.charAt(AbstractC0684.m1529(string)), c, false))) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }
}
