package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦٌۣؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3703 implements Iterator {

    /* JADX INFO: renamed from: ۥْ */
    public final int f12341;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f12342;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12344 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f12343 = 0;

    public C3703(AbstractC4314 abstractC4314) {
        this.f12342 = abstractC4314;
        this.f12341 = abstractC4314.mo7605();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12344) {
            case 0:
                return this.f12343 < this.f12341;
            default:
                return this.f12343 < this.f12341;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12344;
        Object obj = this.f12342;
        int i2 = this.f12341;
        switch (i) {
            case 0:
                int i3 = this.f12343;
                if (i3 < i2) {
                    this.f12343 = i3 + 1;
                    return Byte.valueOf(((C0533) obj).mo1189(i3));
                }
                C0178.m381();
                return null;
            default:
                int i4 = this.f12343;
                if (i4 < i2) {
                    this.f12343 = i4 + 1;
                    return Byte.valueOf(((AbstractC4314) obj).mo7603(i4));
                }
                C0178.m381();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12344) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C3703(C0533 c0533) {
        this.f12342 = c0533;
        this.f12341 = c0533.size();
    }
}
