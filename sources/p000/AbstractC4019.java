package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦّؓۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4019 {
    /* JADX INFO: renamed from: ۥؗ */
    private static final void m7188(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    /* JADX INFO: renamed from: ۥُ */
    private static final void m7189(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    /* JADX INFO: renamed from: ۥّ */
    private static final void m7190(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m7191(List list, int i, int i2) {
        if (i > i2) {
            m7190(i, i2);
        }
        if (i < 0) {
            m7193(i);
        }
        if (i2 > list.size()) {
            m7189(i2, list.size());
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m7192(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            m7188(i, size);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    private static final void m7193(int i) {
        throw new IndexOutOfBoundsException(AbstractC5078.m8681(i, "fromIndex (", ") is less than 0."));
    }
}
