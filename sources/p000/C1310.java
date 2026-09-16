package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٟٔؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1310 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f4495;

    /* JADX INFO: renamed from: ۥُ */
    public long f4496;

    /* JADX INFO: renamed from: ۥّ */
    public long f4497;

    /* JADX INFO: renamed from: ۥۗ */
    public String f4498;

    /* JADX INFO: renamed from: ۥۜ */
    public String f4499;

    /* JADX INFO: renamed from: ۥۣ */
    public int f4500;

    /* JADX INFO: renamed from: ۦؑ */
    public int f4501;

    /* JADX INFO: renamed from: ۦِ */
    public byte f4502;

    /* JADX INFO: renamed from: ۦٛ */
    public List f4503;

    /* JADX INFO: renamed from: ۦۙ */
    public long f4504;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5455 m2775() {
        String str;
        if (this.f4502 == 63 && (str = this.f4498) != null) {
            return new C5455(this.f4500, str, this.f4495, this.f4501, this.f4496, this.f4497, this.f4504, this.f4499, this.f4503);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f4502 & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f4498 == null) {
            sb.append(" processName");
        }
        if ((this.f4502 & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f4502 & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f4502 & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f4502 & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.f4502 & 32) == 0) {
            sb.append(" timestamp");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
