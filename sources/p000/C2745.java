package p000;

/* JADX INFO: renamed from: ۥۥؙؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2745 extends AbstractC4821 {

    /* JADX INFO: renamed from: ۥۖ */
    public static final Object[] f9079;

    /* JADX INFO: renamed from: ۦٕ */
    public static final C2745 f9080;

    /* JADX INFO: renamed from: ۥَ */
    public final transient int f9081;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient Object[] f9082;

    /* JADX INFO: renamed from: ۥٖ */
    public final transient Object[] f9083;

    /* JADX INFO: renamed from: ۦٗ */
    public final transient int f9084;

    /* JADX INFO: renamed from: ۦۛ */
    public final transient int f9085;

    static {
        Object[] objArr = new Object[0];
        f9079 = objArr;
        f9080 = new C2745(0, 0, 0, objArr, objArr);
    }

    public C2745(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f9082 = objArr;
        this.f9081 = i;
        this.f9083 = objArr2;
        this.f9084 = i2;
        this.f9085 = i3;
    }

    @Override // p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f9083;
        if (objArr.length == 0) {
            return false;
        }
        int iM4206 = AbstractC2164.m4206(obj.hashCode());
        while (true) {
            int i = iM4206 & this.f9084;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM4206 = i + 1;
        }
    }

    @Override // p000.AbstractC4821, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9081;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9085;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥُ */
    public final Object[] mo3022() {
        return this.f9082;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3023() {
        return this.f9085;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return false;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1603(Object[] objArr) {
        Object[] objArr2 = this.f9082;
        int i = this.f9085;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0219 iterator() {
        return mo4834().listIterator(0);
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo3024() {
        return 0;
    }

    @Override // p000.AbstractC4821
    /* JADX INFO: renamed from: ۦۚ */
    public final AbstractC4822 mo1605() {
        return AbstractC4822.m8197(this.f9085, this.f9082);
    }
}
