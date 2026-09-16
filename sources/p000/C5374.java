package p000;

/* JADX INFO: renamed from: ۦۣ۠ؑٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5374 extends AbstractC0643 {

    /* JADX INFO: renamed from: ۥُ */
    public final C1955 f17747;

    /* JADX INFO: renamed from: ۥّ */
    public final long f17748;

    /* JADX INFO: renamed from: ۥۜ */
    public final long f17749;

    /* JADX INFO: renamed from: ۦِ */
    public C1516 f17750;

    /* JADX INFO: renamed from: ۦٛ */
    public float f17751;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f17752;

    public C5374(C1955 c1955) {
        int i;
        long width = (((long) c1955.f6452.getWidth()) << 32) | (((long) c1955.f6452.getHeight()) & 4294967295L);
        this.f17747 = c1955;
        this.f17748 = width;
        this.f17752 = 1;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > c1955.f6452.getWidth() || i > c1955.f6452.getHeight()) {
            C1078.m2272("Failed requirement.");
            throw null;
        }
        this.f17749 = width;
        this.f17751 = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5374)) {
            return false;
        }
        C5374 c5374 = (C5374) obj;
        return AbstractC3831.m6874(this.f17747, c5374.f17747) && C0873.m1863(0L, 0L) && C4207.m7431(this.f17748, c5374.f17748) && this.f17752 == c5374.f17752;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17752) + AbstractC3761.m6626(AbstractC3761.m6626(this.f17747.hashCode() * 31, 31, 0L), 31, this.f17748);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f17747);
        sb.append(", srcOffset=");
        sb.append((Object) C0873.m1864(0L));
        sb.append(", srcSize=");
        sb.append((Object) C4207.m7430(this.f17748));
        sb.append(", filterQuality=");
        int i = this.f17752;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    @Override // p000.AbstractC0643
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1461(InterfaceC2442 interfaceC2442) {
        int iRound = Math.round(Float.intBitsToFloat((int) (interfaceC2442.mo4567() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (interfaceC2442.mo4567() & 4294967295L)));
        float f = this.f17751;
        C1516 c1516 = this.f17750;
        int i = this.f17752;
        InterfaceC2442.m4559(interfaceC2442, this.f17747, this.f17748, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, c1516, i, 328);
    }

    @Override // p000.AbstractC0643
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1462(C1516 c1516) {
        this.f17750 = c1516;
    }

    @Override // p000.AbstractC0643
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1463(float f) {
        this.f17751 = f;
    }

    @Override // p000.AbstractC0643
    /* JADX INFO: renamed from: ۦؑ */
    public final long mo1464() {
        return AbstractC5537.m9235(this.f17749);
    }
}
