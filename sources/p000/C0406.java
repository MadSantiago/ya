package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: ۥؔؖؗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0406 implements Comparator {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1491;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C0406 f1490 = new C0406(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final C0406 f1489 = new C0406(1);

    public /* synthetic */ C0406(int i) {
        this.f1491 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1491) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f1491) {
            case 0:
                return f1489;
            default:
                return f1490;
        }
    }
}
