package p000;

import android.os.Trace;

/* JADX INFO: renamed from: ۦَٗؒۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4346 {
    /* JADX INFO: renamed from: ۥؗ */
    public static boolean m7639() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m7640(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m7641(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }
}
