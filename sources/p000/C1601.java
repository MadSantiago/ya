package p000;

/* JADX INFO: renamed from: ۥ٘ؖۖٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1601 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥؗ */
    public final StringBuilder f5373;

    /* JADX INFO: renamed from: ۥۗ */
    public String f5374;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4456 f5375;

    public C1601(char c, int i, int i2) {
        C4456 c4456 = new C4456();
        this.f5375 = c4456;
        this.f5373 = new StringBuilder();
        c4456.f14700 = c;
        c4456.f14696 = i;
        c4456.f14698 = i2;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        return this.f5375;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        int i = c1753.f5829;
        int i2 = c1753.f5831;
        CharSequence charSequence = c1753.f5833;
        int i3 = c1753.f5840;
        C4456 c4456 = this.f5375;
        if (i3 < 4) {
            char c = c4456.f14700;
            int i4 = c4456.f14696;
            int iM7886 = AbstractC4554.m7886(c, i, charSequence.length(), charSequence) - i;
            if (iM7886 >= i4 && AbstractC4554.m7885(charSequence, i + iM7886, charSequence.length()) == charSequence.length()) {
                return new C3714(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = c4456.f14698; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return C3714.m6571(i2);
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2294(CharSequence charSequence) {
        if (this.f5374 == null) {
            this.f5374 = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f5373;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2295() {
        String strM1877 = AbstractC0883.m1877(this.f5374.trim());
        C4456 c4456 = this.f5375;
        c4456.f14697 = strM1877;
        c4456.f14699 = this.f5373.toString();
    }
}
