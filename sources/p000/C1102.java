package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥٌِٜؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1102 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f3873;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f3874;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f3875;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f3876;

    /* JADX INFO: renamed from: ۦۨ */
    public int f3877;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1102(C4461 c4461, int i) {
        this(c4461.f2862);
        this.f3875 = i;
        switch (i) {
            case 1:
                this.f3873 = c4461;
                this(c4461.f2862);
                break;
            default:
                this.f3873 = c4461;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3876 < this.f3877;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM1694;
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        int i = this.f3876;
        int i2 = this.f3875;
        Object obj = this.f3873;
        switch (i2) {
            case 0:
                objM1694 = ((C4461) obj).m1694(i);
                break;
            case 1:
                objM1694 = ((C4461) obj).m1697(i);
                break;
            default:
                objM1694 = ((C1821) obj).f6050[i];
                break;
        }
        this.f3876++;
        this.f3874 = true;
        return objM1694;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3874) {
            C1078.m2276("Call next() before removing an element.");
            return;
        }
        int i = this.f3876 - 1;
        this.f3876 = i;
        int i2 = this.f3875;
        Object obj = this.f3873;
        switch (i2) {
            case 0:
                ((C4461) obj).m1695(i);
                break;
            case 1:
                ((C4461) obj).m1695(i);
                break;
            default:
                ((C1821) obj).m3594(i);
                break;
        }
        this.f3877--;
        this.f3874 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1102(C1821 c1821) {
        this(c1821.f6049);
        this.f3875 = 2;
        this.f3873 = c1821;
    }

    public C1102(int i) {
        this.f3877 = i;
    }
}
