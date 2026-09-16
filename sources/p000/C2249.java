package p000;

/* JADX INFO: renamed from: ۥٖۚؑٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2249 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C2623 f7465 = new C2623();

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        return this.f7465;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        char cCharAt;
        int i = c1753.f5829;
        CharSequence charSequence = c1753.f5833;
        if (c1753.f5840 >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
            return null;
        }
        int i2 = c1753.f5828 + c1753.f5840;
        int i3 = i2 + 1;
        CharSequence charSequence2 = c1753.f5833;
        int i4 = i + 1;
        if (i4 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new C3714(-1, i3, false);
    }
}
