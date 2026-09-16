package p000;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: ۦًٌۚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5159 extends AbstractC0028 {

    /* JADX INFO: renamed from: ۥَ */
    public C3110 f17089;

    /* JADX INFO: renamed from: ۥْ */
    public final C4250 f17090;

    /* JADX INFO: renamed from: ۥٓ */
    public int f17091;

    /* JADX INFO: renamed from: ۥٖ */
    public int f17092;

    public C5159(C4250 c4250, int i) {
        super(i, c4250.f14089);
        this.f17090 = c4250;
        this.f17091 = c4250.m7532();
        this.f17092 = -1;
        m8753();
    }

    @Override // p000.AbstractC0028, java.util.ListIterator
    public final void add(Object obj) {
        m8754();
        int i = this.f5661;
        C4250 c4250 = this.f17090;
        c4250.add(i, obj);
        this.f5661++;
        this.f5660 = c4250.mo1859();
        this.f17091 = c4250.m7532();
        this.f17092 = -1;
        m8753();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m8754();
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        int i = this.f5661;
        this.f17092 = i;
        C3110 c3110 = this.f17089;
        C4250 c4250 = this.f17090;
        if (c3110 == null) {
            Object[] objArr = c4250.f14088;
            this.f5661 = i + 1;
            return objArr[i];
        }
        if (c3110.hasNext()) {
            this.f5661++;
            return c3110.next();
        }
        Object[] objArr2 = c4250.f14088;
        int i2 = this.f5661;
        this.f5661 = i2 + 1;
        return objArr2[i2 - c3110.f5660];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m8754();
        if (!hasPrevious()) {
            C0178.m381();
            return null;
        }
        int i = this.f5661;
        this.f17092 = i - 1;
        C3110 c3110 = this.f17089;
        C4250 c4250 = this.f17090;
        if (c3110 == null) {
            Object[] objArr = c4250.f14088;
            int i2 = i - 1;
            this.f5661 = i2;
            return objArr[i2];
        }
        int i3 = c3110.f5660;
        if (i <= i3) {
            this.f5661 = i - 1;
            return c3110.previous();
        }
        Object[] objArr2 = c4250.f14088;
        int i4 = i - 1;
        this.f5661 = i4;
        return objArr2[i4 - i3];
    }

    @Override // p000.AbstractC0028, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m8754();
        int i = this.f17092;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C4250 c4250 = this.f17090;
        c4250.mo1860(i);
        int i2 = this.f17092;
        if (i2 < this.f5661) {
            this.f5661 = i2;
        }
        this.f5660 = c4250.mo1859();
        this.f17091 = c4250.m7532();
        this.f17092 = -1;
        m8753();
    }

    @Override // p000.AbstractC0028, java.util.ListIterator
    public final void set(Object obj) {
        m8754();
        int i = this.f17092;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C4250 c4250 = this.f17090;
        c4250.set(i, obj);
        this.f17091 = c4250.m7532();
        m8753();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: ۥۗ */
    public final void m8753() {
        C4250 c4250 = this.f17090;
        Object[] objArr = c4250.f14087;
        if (objArr == null) {
            this.f17089 = null;
            return;
        }
        int i = (c4250.f14089 - 1) & (-32);
        int i2 = this.f5661;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (c4250.f14086 / 5) + 1;
        C3110 c3110 = this.f17089;
        if (c3110 == null) {
            this.f17089 = new C3110(objArr, i2, i, i3);
            return;
        }
        c3110.f5661 = i2;
        c3110.f5660 = i;
        c3110.f10426 = i3;
        Object[] objArr2 = c3110.f10427;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            c3110.f10427 = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        c3110.f10425 = r0;
        c3110.m5693(i2 - r0, 1);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8754() {
        if (this.f17091 != this.f17090.m7532()) {
            throw new ConcurrentModificationException();
        }
    }
}
