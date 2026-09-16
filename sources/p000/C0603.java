package p000;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: ۥؗؔۖۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0603 extends AbstractC2108 {

    /* JADX INFO: renamed from: ۥَ */
    public Object f2228;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3881 f2229;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f2230;

    /* JADX INFO: renamed from: ۦٗ */
    public int f2231;

    public C0603(C3881 c3881, AbstractC5848[] abstractC5848Arr) {
        super(c3881.f12970, abstractC5848Arr);
        this.f2229 = c3881;
        this.f2231 = c3881.f12968;
    }

    @Override // p000.AbstractC2108, java.util.Iterator
    public final Object next() {
        if (this.f2229.f12968 != this.f2231) {
            throw new ConcurrentModificationException();
        }
        if (!this.f6930) {
            C0178.m381();
            return null;
        }
        AbstractC5848 abstractC5848 = this.f6932[this.f6931];
        this.f2228 = abstractC5848.f19275[abstractC5848.f19273];
        this.f2230 = true;
        return super.next();
    }

    @Override // p000.AbstractC2108, java.util.Iterator
    public final void remove() {
        if (!this.f2230) {
            throw new IllegalStateException();
        }
        boolean z = this.f6930;
        C3881 c3881 = this.f2229;
        if (!z) {
            AbstractC3801.m6785(c3881).remove(this.f2228);
        } else {
            if (!z) {
                C0178.m381();
                return;
            }
            AbstractC5848 abstractC5848 = this.f6932[this.f6931];
            Object obj = abstractC5848.f19275[abstractC5848.f19273];
            AbstractC3801.m6785(c3881).remove(this.f2228);
            m1310(obj != null ? obj.hashCode() : 0, c3881.f12970, obj, 0);
        }
        this.f2228 = null;
        this.f2230 = false;
        this.f2231 = c3881.f12968;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m1310(int i, C1205 c1205, Object obj, int i2) {
        int i3 = i2 * 5;
        AbstractC5848[] abstractC5848Arr = this.f6932;
        if (i3 <= 30) {
            int iM3364 = 1 << AbstractC1605.m3364(i, i3);
            if (c1205.m2539(iM3364)) {
                abstractC5848Arr[i2].m9668(c1205.f4150, Integer.bitCount(c1205.f4149) * 2, c1205.m2533(iM3364));
                this.f6931 = i2;
                return;
            } else {
                int iM2536 = c1205.m2536(iM3364);
                C1205 c1205M2531 = c1205.m2531(iM2536);
                abstractC5848Arr[i2].m9668(c1205.f4150, Integer.bitCount(c1205.f4149) * 2, iM2536);
                m1310(i, c1205M2531, obj, i2 + 1);
                return;
            }
        }
        AbstractC5848 abstractC5848 = abstractC5848Arr[i2];
        Object[] objArr = c1205.f4150;
        abstractC5848.m9668(objArr, objArr.length, 0);
        while (true) {
            AbstractC5848 abstractC5849 = abstractC5848Arr[i2];
            if (AbstractC3831.m6874(abstractC5849.f19275[abstractC5849.f19273], obj)) {
                this.f6931 = i2;
                return;
            } else {
                abstractC5848Arr[i2].f19273 += 2;
            }
        }
    }
}
