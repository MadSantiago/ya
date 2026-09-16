package p000;

/* JADX INFO: renamed from: ۦۨؒٞ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5863 {

    /* JADX INFO: renamed from: ۥؗ */
    public C4356 f19360;

    /* JADX INFO: renamed from: ۥُ */
    public int f19361;

    /* JADX INFO: renamed from: ۥّ */
    public C1254 f19362;

    /* JADX INFO: renamed from: ۥۗ */
    public int f19363;

    /* JADX INFO: renamed from: ۥۣ */
    public C1946 f19364;

    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC5731 f19365;

    /* JADX INFO: renamed from: ۦۙ */
    public C3262 f19366;

    public C5863(C1946 c1946) {
        this.f19364 = c1946;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9681() {
        C1946 c1946 = this.f19364;
        if (c1946 != null) {
            c1946.f6417 = true;
            c1946.f6428.m7502();
        }
        this.f19364 = null;
        this.f19362 = null;
        this.f19366 = null;
        this.f19365 = null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m9682(Object obj) {
        int iM3812;
        C1946 c1946 = this.f19364;
        if (c1946 == null || (iM3812 = c1946.m3812(this, obj)) == 0) {
            return 1;
        }
        return iM3812;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m9683() {
        if (this.f19364 != null) {
            C4356 c4356 = this.f19360;
            if (c4356 != null ? c4356.m7647() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m9684(boolean z) {
        int i = this.f19363;
        this.f19363 = z ? i | 32 : i & (-33);
    }
}
