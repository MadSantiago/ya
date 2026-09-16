package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٛ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4714 f15149;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Bitmap.Config f15150;

    static {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        f15150 = Bitmap.Config.HARDWARE;
        f15149 = new C4714((String[]) new ArrayList(20).toArray(new String[0]));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final boolean m7958(Uri uri) {
        return AbstractC3831.m6874(uri.getScheme(), "file") && AbstractC3831.m6874((String) AbstractC0973.m2058(uri.getPathSegments()), "android_asset");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final String m7959(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC0684.m1534(str)) {
            return null;
        }
        String strM9762 = AbstractC0684.m9762(AbstractC0684.m9762(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC0684.m1535('.', AbstractC0684.m1535('/', strM9762, strM9762), ""));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m7960(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final int m7961(AbstractC3831 abstractC3831, int i) {
        if (abstractC3831 instanceof C0189) {
            return ((C0189) abstractC3831).f704;
        }
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 == 0) {
            return Integer.MIN_VALUE;
        }
        if (iM6632 == 1) {
            return Integer.MAX_VALUE;
        }
        C1078.m2275();
        return 0;
    }
}
