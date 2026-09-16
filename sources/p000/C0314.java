package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥٌؚؓؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0314 implements Iterator {

    /* JADX INFO: renamed from: ۥْ */
    public int f1160;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C4387 f1161;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f1162;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2632 f1163;

    public /* synthetic */ C0314(C4387 c4387, C2632 c2632, int i) {
        this.f1161 = c4387;
        this.f1163 = c2632;
        int i2 = i & 31;
        this.f1162 = i2;
        this.f1160 = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1162 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f1162;
        C4387 c4387 = this.f1161;
        AbstractC4489 abstractC4489 = c4387.f14458;
        int iMo1150 = abstractC4489.mo1150();
        Object objCast = this.f1163.f8743.cast(i >= iMo1150 ? c4387.f14456.mo1145(i - iMo1150) : abstractC4489.mo1145(i));
        int i2 = this.f1160;
        if (i2 == 0) {
            this.f1162 = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.f1160 >>>= iNumberOfTrailingZeros;
        this.f1162 += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
