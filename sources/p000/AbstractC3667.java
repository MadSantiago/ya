package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦًؔۨؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3667 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final Object[] f12261 = new Object[0];

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2730 f12260 = new C2730(0);

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m6537(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            AbstractC2552.m4814("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            AbstractC2552.m4812("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        AbstractC2552.m4812("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m6538(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            AbstractC2552.m4812("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }
}
