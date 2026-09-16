package p000;

/* JADX INFO: renamed from: ۦًؘۧؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5847 extends AbstractC2765 {

    /* JADX INFO: renamed from: ۥۤ */
    public final C3915 f19272;

    public C5847(C3915 c3915, C0971 c0971) {
        this.f19272 = c3915;
        C4036 c4036 = AbstractC2164.f7138;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥؖ */
    public final short mo4104() {
        C2866 c2866;
        C3915 c3915 = this.f19272;
        String strM7010 = c3915.m7010();
        try {
            C5706 c5706M1923 = AbstractC0949.m1923(strM7010);
            if (c5706M1923 != null) {
                int i = c5706M1923.f18790;
                c2866 = Integer.compareUnsigned(i, 65535) > 0 ? null : new C2866((short) i);
            }
            if (c2866 != null) {
                return c2866.f9577;
            }
            AbstractC4981.m8359(strM7010);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3915.m6997(c3915, AbstractC5078.m8669('\'', "Failed to parse type 'UShort' for input '", strM7010), 0, null, 6);
            throw null;
        }
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥٖ */
    public final C4036 mo6288() {
        return AbstractC2164.f7138;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۗ */
    public final long mo4108() {
        C3915 c3915 = this.f19272;
        String strM7010 = c3915.m7010();
        try {
            C4462 c4462M1965 = AbstractC0949.m1965(strM7010);
            if (c4462M1965 != null) {
                return c4462M1965.f14714;
            }
            AbstractC4981.m8359(strM7010);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3915.m6997(c3915, AbstractC5078.m8669('\'', "Failed to parse type 'ULong' for input '", strM7010), 0, null, 6);
            throw null;
        }
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo6291(InterfaceC0103 interfaceC0103) {
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦۛ */
    public final byte mo4115() {
        C2513 c2513;
        C3915 c3915 = this.f19272;
        String strM7010 = c3915.m7010();
        try {
            C5706 c5706M1923 = AbstractC0949.m1923(strM7010);
            if (c5706M1923 != null) {
                int i = c5706M1923.f18790;
                c2513 = Integer.compareUnsigned(i, 255) > 0 ? null : new C2513((byte) i);
            }
            if (c2513 != null) {
                return c2513.f8338;
            }
            AbstractC4981.m8359(strM7010);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3915.m6997(c3915, AbstractC5078.m8669('\'', "Failed to parse type 'UByte' for input '", strM7010), 0, null, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo4116() {
        C3915 c3915 = this.f19272;
        String strM7010 = c3915.m7010();
        try {
            C5706 c5706M1923 = AbstractC0949.m1923(strM7010);
            if (c5706M1923 != null) {
                return c5706M1923.f18790;
            }
            AbstractC4981.m8359(strM7010);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3915.m6997(c3915, AbstractC5078.m8669('\'', "Failed to parse type 'UInt' for input '", strM7010), 0, null, 6);
            throw null;
        }
    }
}
