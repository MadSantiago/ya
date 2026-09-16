package p000;

/* JADX INFO: renamed from: ۥٖؑۖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1439 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f4930;

    /* JADX INFO: renamed from: ۥُ */
    public final Object f4931;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1626 f4932;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0903 f4933;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f4934;

    public C1439(AbstractC0903 abstractC0903, C1626 c1626, int i, int i2, Object obj) {
        this.f4933 = abstractC0903;
        this.f4932 = c1626;
        this.f4930 = i;
        this.f4934 = i2;
        this.f4931 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1439)) {
            return false;
        }
        C1439 c1439 = (C1439) obj;
        return AbstractC3831.m6874(this.f4933, c1439.f4933) && AbstractC3831.m6874(this.f4932, c1439.f4932) && this.f4930 == c1439.f4930 && this.f4934 == c1439.f4934 && AbstractC3831.m6874(this.f4931, c1439.f4931);
    }

    public final int hashCode() {
        AbstractC0903 abstractC0903 = this.f4933;
        int iM3999 = AbstractC2049.m3999(this.f4934, AbstractC2049.m3999(this.f4930, (((abstractC0903 == null ? 0 : abstractC0903.hashCode()) * 31) + this.f4932.f5444) * 31, 31), 31);
        Object obj = this.f4931;
        return iM3999 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f4933);
        sb.append(", fontWeight=");
        sb.append(this.f4932);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.f4930;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.f4934;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f4931);
        sb.append(')');
        return sb.toString();
    }
}
