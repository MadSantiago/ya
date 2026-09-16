package p000;

/* JADX INFO: renamed from: ۥٔٝؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1376 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f4706;

    /* JADX INFO: renamed from: ۥُ */
    public byte f4707;

    /* JADX INFO: renamed from: ۥۗ */
    public int f4708;

    /* JADX INFO: renamed from: ۥۣ */
    public String f4709;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f4710;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5498 m2913() {
        String str;
        if (this.f4707 == 7 && (str = this.f4709) != null) {
            return new C5498(this.f4708, this.f4706, str, this.f4710);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4709 == null) {
            sb.append(" processName");
        }
        if ((this.f4707 & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f4707 & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f4707 & 4) == 0) {
            sb.append(" defaultProcess");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
