package p000;

/* JADX INFO: renamed from: ۥِؔؑٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0368 extends AbstractC5679 {

    /* JADX INFO: renamed from: ۥۗ */
    public final String f1355;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f1356;

    public C0368(String str, String str2) {
        this.f1356 = str;
        this.f1355 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5679)) {
            return false;
        }
        C0368 c0368 = (C0368) ((AbstractC5679) obj);
        return this.f1356.equals(c0368.f1356) && this.f1355.equals(c0368.f1355);
    }

    public final int hashCode() {
        return this.f1355.hashCode() ^ ((this.f1356.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f1356);
        sb.append(", value=");
        return AbstractC3761.m6621(sb, this.f1355, "}");
    }
}
