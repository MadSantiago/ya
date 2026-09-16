package p000;

/* JADX INFO: renamed from: ۦؒؔؒٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3110 extends AbstractC0028 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f10425;

    /* JADX INFO: renamed from: ۥْ */
    public int f10426;

    /* JADX INFO: renamed from: ۥٓ */
    public Object[] f10427;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C3110(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f10426 = i3;
        Object[] objArr2 = new Object[i3];
        this.f10427 = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f10425 = r5;
        objArr2[0] = objArr;
        m5693(i - r5, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        Object objM5694 = m5694();
        int i = this.f5661 + 1;
        this.f5661 = i;
        if (i == this.f5660) {
            this.f10425 = true;
            return objM5694;
        }
        m5692(0);
        return objM5694;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0178.m381();
            return null;
        }
        this.f5661--;
        if (this.f10425) {
            this.f10425 = false;
            return m5694();
        }
        m5692(31);
        return m5694();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m5692(int i) {
        int i2 = 0;
        while (AbstractC2765.m5139(this.f5661, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m5693(this.f5661, ((this.f10426 - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5693(int i, int i2) {
        int i3 = (this.f10426 - i2) * 5;
        while (i2 < this.f10426) {
            Object[] objArr = this.f10427;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[AbstractC2765.m5139(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m5694() {
        return ((Object[]) this.f10427[this.f10426 - 1])[this.f5661 & 31];
    }
}
