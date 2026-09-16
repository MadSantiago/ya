package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥۥَؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2761 {

    /* JADX INFO: renamed from: ۥۗ */
    public static C2761 f9142;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Pattern f9143 = Pattern.compile("\\AA[\\w-]{38}\\z");

    public C2761(C4452 c4452) {
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m5114(C2529 c2529) {
        return TextUtils.isEmpty(c2529.f8372) || c2529.f8374 + c2529.f8373 < (System.currentTimeMillis() / 1000) + 3600;
    }
}
