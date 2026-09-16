package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۥْۛؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2316 {
    /* JADX INFO: renamed from: ۥؗ */
    public static /* synthetic */ void m4357(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: ۥُ */
    public static /* synthetic */ void m4358(String str) throws C5463 {
        throw new C5463(str);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static /* synthetic */ void m4359(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static /* synthetic */ void m4360(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static /* synthetic */ void m4361() throws C1306 {
        throw new C1306();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static /* synthetic */ void m4362(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static /* synthetic */ void m4363(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }
}
