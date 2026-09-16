package p000;

/* JADX INFO: renamed from: ۦُۙؗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5127 {

    /* JADX INFO: renamed from: ۥۗ */
    public final String f16995;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3990 f16996;

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3637 f16992 = new C3637("|S||P|");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C3637 f16994 = new C3637("|S|id");

    /* JADX INFO: renamed from: ۥُ */
    public static final String[] f16993 = {"*", "FCM", "GCM", ""};

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public C5127(C0377 c0377) {
        c0377.m825();
        this.f16996 = new C3990(c0377.f1410, "com.google.android.gms.appid");
        c0377.m825();
        C2780 c2780 = c0377.f1405;
        String str = c2780.f9264;
        if (str == null) {
            c0377.m825();
            str = c2780.f9266;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f16995 = str;
    }
}
