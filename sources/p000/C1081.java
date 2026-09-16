package p000;

/* JADX INFO: renamed from: ۥِْؑٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1081 extends AbstractC0410 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f3773;

    /* JADX INFO: renamed from: ۥُ */
    public final String f3774;

    /* JADX INFO: renamed from: ۥّ */
    public final String f3775;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f3776;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f3777;

    /* JADX INFO: renamed from: ۥۣ */
    public final Integer f3778;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f3779;

    /* JADX INFO: renamed from: ۦؚ */
    public final String f3780;

    /* JADX INFO: renamed from: ۦِ */
    public final String f3781;

    /* JADX INFO: renamed from: ۦٛ */
    public final String f3782;

    /* JADX INFO: renamed from: ۦۗ */
    public final String f3783;

    /* JADX INFO: renamed from: ۦۙ */
    public final String f3784;

    public C1081(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f3778 = num;
        this.f3776 = str;
        this.f3773 = str2;
        this.f3779 = str3;
        this.f3774 = str4;
        this.f3775 = str5;
        this.f3784 = str6;
        this.f3777 = str7;
        this.f3782 = str8;
        this.f3781 = str9;
        this.f3783 = str10;
        this.f3780 = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0410)) {
            return false;
        }
        AbstractC0410 abstractC0410 = (AbstractC0410) obj;
        if (!this.f3778.equals(((C1081) abstractC0410).f3778)) {
            return false;
        }
        if (!this.f3776.equals(((C1081) abstractC0410).f3776)) {
            return false;
        }
        if (!this.f3773.equals(((C1081) abstractC0410).f3773)) {
            return false;
        }
        if (!this.f3779.equals(((C1081) abstractC0410).f3779)) {
            return false;
        }
        if (!this.f3774.equals(((C1081) abstractC0410).f3774)) {
            return false;
        }
        if (!this.f3775.equals(((C1081) abstractC0410).f3775)) {
            return false;
        }
        if (!this.f3784.equals(((C1081) abstractC0410).f3784)) {
            return false;
        }
        if (!this.f3777.equals(((C1081) abstractC0410).f3777)) {
            return false;
        }
        if (!this.f3782.equals(((C1081) abstractC0410).f3782)) {
            return false;
        }
        if (!this.f3781.equals(((C1081) abstractC0410).f3781)) {
            return false;
        }
        if (this.f3783.equals(((C1081) abstractC0410).f3783)) {
            return this.f3780.equals(((C1081) abstractC0410).f3780);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3780.hashCode() ^ ((((((((((((((((((((((this.f3778.hashCode() ^ 1000003) * 1000003) ^ this.f3776.hashCode()) * 1000003) ^ this.f3773.hashCode()) * 1000003) ^ this.f3779.hashCode()) * 1000003) ^ this.f3774.hashCode()) * 1000003) ^ this.f3775.hashCode()) * 1000003) ^ this.f3784.hashCode()) * 1000003) ^ this.f3777.hashCode()) * 1000003) ^ this.f3782.hashCode()) * 1000003) ^ this.f3781.hashCode()) * 1000003) ^ this.f3783.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f3778);
        sb.append(", model=");
        sb.append(this.f3776);
        sb.append(", hardware=");
        sb.append(this.f3773);
        sb.append(", device=");
        sb.append(this.f3779);
        sb.append(", product=");
        sb.append(this.f3774);
        sb.append(", osBuild=");
        sb.append(this.f3775);
        sb.append(", manufacturer=");
        sb.append(this.f3784);
        sb.append(", fingerprint=");
        sb.append(this.f3777);
        sb.append(", locale=");
        sb.append(this.f3782);
        sb.append(", country=");
        sb.append(this.f3781);
        sb.append(", mccMnc=");
        sb.append(this.f3783);
        sb.append(", applicationBuild=");
        return AbstractC3761.m6621(sb, this.f3780, "}");
    }
}
