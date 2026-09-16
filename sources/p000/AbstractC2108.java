package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥۗؔؔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2108 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f6930 = true;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f6931;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC5848[] f6932;

    public AbstractC2108(C1205 c1205, AbstractC5848[] abstractC5848Arr) {
        this.f6932 = abstractC5848Arr;
        abstractC5848Arr[0].m9668(c1205.f4150, Integer.bitCount(c1205.f4149) * 2, 0);
        this.f6931 = 0;
        m4089();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6930;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f6930) {
            C0178.m381();
            return null;
        }
        Object next = this.f6932[this.f6931].next();
        m4089();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m4088(int i) {
        AbstractC5848[] abstractC5848Arr = this.f6932;
        AbstractC5848 abstractC5848 = abstractC5848Arr[i];
        int i2 = abstractC5848.f19273;
        if (i2 < abstractC5848.f19274) {
            return i;
        }
        Object[] objArr = abstractC5848.f19275;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        C1205 c1205 = (C1205) objArr[i2];
        if (i == 6) {
            AbstractC5848 abstractC5849 = abstractC5848Arr[i + 1];
            Object[] objArr2 = c1205.f4150;
            abstractC5849.m9668(objArr2, objArr2.length, 0);
        } else {
            abstractC5848Arr[i + 1].m9668(c1205.f4150, Integer.bitCount(c1205.f4149) * 2, 0);
        }
        return m4088(i + 1);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4089() {
        int i = this.f6931;
        AbstractC5848[] abstractC5848Arr = this.f6932;
        AbstractC5848 abstractC5848 = abstractC5848Arr[i];
        if (abstractC5848.f19273 < abstractC5848.f19274) {
            return;
        }
        while (-1 < i) {
            int iM4088 = m4088(i);
            if (iM4088 == -1) {
                AbstractC5848 abstractC5849 = abstractC5848Arr[i];
                int i2 = abstractC5849.f19273;
                Object[] objArr = abstractC5849.f19275;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    abstractC5849.f19273 = i2 + 1;
                    iM4088 = m4088(i);
                }
            }
            if (iM4088 != -1) {
                this.f6931 = iM4088;
                return;
            }
            if (i > 0) {
                AbstractC5848 abstractC58410 = abstractC5848Arr[i - 1];
                int i3 = abstractC58410.f19273;
                int length2 = abstractC58410.f19275.length;
                abstractC58410.f19273 = i3 + 1;
            }
            abstractC5848Arr[i].m9668(C1205.f4146.f4150, 0, 0);
            i--;
        }
        this.f6930 = false;
    }
}
