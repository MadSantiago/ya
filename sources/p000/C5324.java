package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۦٜ۟ؒؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5324 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5324 f17568;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1206 f17569 = new C1206(17);

    /* JADX INFO: renamed from: ۥۣ */
    public final C5441 f17570;

    static {
        List list = Collections.EMPTY_LIST;
        f17568 = new C5324(new C5441());
    }

    public C5324(C5441 c5441) {
        this.f17570 = c5441;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5324) && ((C5324) obj).f17570.equals(this.f17570);
    }

    public final int hashCode() {
        return ~this.f17570.hashCode();
    }

    public final String toString() {
        return this.f17570.toString();
    }
}
