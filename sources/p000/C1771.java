package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥۣٛؔۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1771 {

    /* JADX INFO: renamed from: ۥؗ */
    public List f5903;

    /* JADX INFO: renamed from: ۥُ */
    public AbstractC1355 f5904;

    /* JADX INFO: renamed from: ۥّ */
    public List f5905;

    /* JADX INFO: renamed from: ۥۗ */
    public List f5906;

    /* JADX INFO: renamed from: ۥۜ */
    public byte f5907;

    /* JADX INFO: renamed from: ۥۣ */
    public AbstractC4467 f5908;

    /* JADX INFO: renamed from: ۦؑ */
    public Boolean f5909;

    /* JADX INFO: renamed from: ۦۙ */
    public int f5910;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2701 m3562() {
        AbstractC4467 abstractC4467;
        if (this.f5907 == 1 && (abstractC4467 = this.f5908) != null) {
            return new C2701(abstractC4467, this.f5906, this.f5903, this.f5909, this.f5904, this.f5905, this.f5910);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5908 == null) {
            sb.append(" execution");
        }
        if ((this.f5907 & 1) == 0) {
            sb.append(" uiOrientation");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
