package p000;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: ۥۛؒٓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2307 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0512 f7642;

    static {
        String str = Build.FINGERPRINT;
        f7642 = (str == null || !str.toLowerCase(Locale.ROOT).equals("robolectric")) ? null : new C0512();
    }
}
