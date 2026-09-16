package p000;

/* JADX INFO: renamed from: ۦؖؓؔٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3341 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f11174;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f11175;

    /* JADX INFO: renamed from: ۥّ */
    public C3341 f11176;

    /* JADX INFO: renamed from: ۥۗ */
    public int f11177;

    /* JADX INFO: renamed from: ۥۣ */
    public final byte[] f11178;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f11179;

    /* JADX INFO: renamed from: ۦۙ */
    public C3341 f11180;

    public C3341() {
        this.f11178 = new byte[8192];
        this.f11175 = true;
        this.f11179 = false;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C3341 m6101() {
        this.f11179 = true;
        return new C3341(this.f11178, this.f11177, this.f11174, true);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6102(C3341 c3341) {
        c3341.f11180 = this;
        c3341.f11176 = this.f11176;
        this.f11176.f11180 = c3341;
        this.f11176 = c3341;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3341 m6103() {
        C3341 c3341 = this.f11176;
        C3341 c3342 = c3341 != this ? c3341 : null;
        C3341 c3343 = this.f11180;
        c3343.f11176 = c3341;
        this.f11176.f11180 = c3343;
        this.f11176 = null;
        this.f11180 = null;
        return c3342;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6104(C3341 c3341, int i) {
        byte[] bArr = c3341.f11178;
        if (!c3341.f11175) {
            C1078.m2276("only owner can write");
            return;
        }
        int i2 = c3341.f11174;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c3341.f11179) {
                C0178.m393();
                return;
            }
            int i4 = c3341.f11177;
            if (i3 - i4 > 8192) {
                C0178.m393();
                return;
            }
            AbstractC0246.m512(bArr, bArr, i4, i2);
            i2 = c3341.f11174 - c3341.f11177;
            c3341.f11174 = i2;
            c3341.f11177 = 0;
        }
        int i5 = this.f11177;
        System.arraycopy(this.f11178, i5, bArr, i2, (i5 + i) - i5);
        c3341.f11174 += i;
        this.f11177 += i;
    }

    public C3341(byte[] bArr, int i, int i2, boolean z) {
        this.f11178 = bArr;
        this.f11177 = i;
        this.f11174 = i2;
        this.f11179 = z;
        this.f11175 = false;
    }
}
