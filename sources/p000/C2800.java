package p000;

import java.util.RandomAccess;

/* JADX INFO: renamed from: ۥۦًؔ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2800 extends AbstractC0015 implements RandomAccess {

    /* JADX INFO: renamed from: ۦ۟ */
    public final int[] f9354;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1007[] f9355;

    public C2800(C1007[] c1007Arr, int[] iArr) {
        this.f9355 = c1007Arr;
        this.f9354 = iArr;
    }

    @Override // p000.AbstractC0096, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1007) {
            return super.contains((C1007) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f9355[i];
    }

    @Override // p000.AbstractC0015, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1007) {
            return super.indexOf((C1007) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0015, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1007) {
            return super.lastIndexOf((C1007) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f9355.length;
    }
}
