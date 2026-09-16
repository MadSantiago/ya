package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥّ٘ؔٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1572 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f5298;

    /* JADX INFO: renamed from: ۥُ */
    public Long f5299;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f5300;

    /* JADX INFO: renamed from: ۥۗ */
    public String f5301;

    /* JADX INFO: renamed from: ۥۜ */
    public AbstractC3029 f5302;

    /* JADX INFO: renamed from: ۥۣ */
    public String f5303;

    /* JADX INFO: renamed from: ۦؑ */
    public long f5304;

    /* JADX INFO: renamed from: ۦؚ */
    public int f5305;

    /* JADX INFO: renamed from: ۦٌ */
    public byte f5306;

    /* JADX INFO: renamed from: ۦِ */
    public AbstractC3054 f5307;

    /* JADX INFO: renamed from: ۦٛ */
    public AbstractC0895 f5308;

    /* JADX INFO: renamed from: ۦۗ */
    public List f5309;

    /* JADX INFO: renamed from: ۦۙ */
    public AbstractC2952 f5310;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4113 m3321() {
        String str;
        String str2;
        AbstractC2952 abstractC2952;
        if (this.f5306 == 7 && (str = this.f5303) != null && (str2 = this.f5301) != null && (abstractC2952 = this.f5310) != null) {
            return new C4113(str, str2, this.f5298, this.f5304, this.f5299, this.f5300, abstractC2952, this.f5302, this.f5308, this.f5307, this.f5309, this.f5305);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5303 == null) {
            sb.append(" generator");
        }
        if (this.f5301 == null) {
            sb.append(" identifier");
        }
        if ((this.f5306 & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f5306 & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f5310 == null) {
            sb.append(" app");
        }
        if ((this.f5306 & 4) == 0) {
            sb.append(" generatorType");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
