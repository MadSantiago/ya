package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥّۤؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2692 implements Iterator {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Iterable f8933;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f8934 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8935;

    public /* synthetic */ C2692(Iterable iterable, int i) {
        this.f8935 = i;
        this.f8933 = iterable;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f8935;
        Iterable iterable = this.f8933;
        switch (i) {
            case 0:
                return this.f8934 < ((C3108) iterable).f10423;
            case 1:
                C1354 c1354 = (C1354) iterable;
                return this.f8934 < c1354.m2863() - c1354.m2862();
            default:
                return this.f8934 < ((C4387) ((C3839) iterable).f12783).f14457;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f8935;
        Iterable iterable = this.f8933;
        switch (i) {
            case 0:
                C3108 c3108 = (C3108) iterable;
                String[] strArr = c3108.f10421;
                int i2 = this.f8934;
                String str = strArr[i2];
                String str2 = c3108.f10422[i2];
                if (str == null) {
                    str = "";
                }
                C0212 c0212 = new C0212();
                if (str2 == null) {
                    C1078.m2272("Object must not be null");
                    return null;
                }
                c0212.f799 = str2.trim();
                if (str2.length() == 0) {
                    C1078.m2272("String must not be empty");
                    return null;
                }
                c0212.f798 = str;
                c0212.f797 = c3108;
                this.f8934++;
                return c0212;
            case 1:
                int i3 = this.f8934;
                C1354 c1354 = (C1354) iterable;
                if (i3 >= c1354.m2863() - c1354.m2862()) {
                    C0178.m381();
                    return null;
                }
                Object obj = c1354.f4658.f17957[c1354.m2862() + i3];
                this.f8934 = i3 + 1;
                return obj;
            default:
                int i4 = this.f8934;
                this.f8934 = i4 + 1;
                C4387 c4387 = (C4387) ((C3839) iterable).f12783;
                return c4387.m7686(c4387.f14459[i4] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8935) {
            case 0:
                C3108 c3108 = (C3108) this.f8933;
                int i = this.f8934;
                int i2 = i - 1;
                this.f8934 = i2;
                int i3 = c3108.f10423;
                if (i2 >= i3) {
                    C1078.m2272("Must be false");
                    return;
                }
                int i4 = (i3 - i2) - 1;
                if (i4 > 0) {
                    String[] strArr = c3108.f10422;
                    System.arraycopy(strArr, i, strArr, i2, i4);
                    String[] strArr2 = c3108.f10421;
                    System.arraycopy(strArr2, i, strArr2, i2, i4);
                }
                int i5 = c3108.f10423 - 1;
                c3108.f10423 = i5;
                c3108.f10422[i5] = null;
                c3108.f10421[i5] = null;
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
