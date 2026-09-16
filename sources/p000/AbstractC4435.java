package p000;

import java.util.Locale;

/* JADX INFO: renamed from: ۦً٘ؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4435 extends AbstractC4294 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f14615;

    /* JADX INFO: renamed from: ۥُ */
    public final StringBuilder f14616;

    /* JADX INFO: renamed from: ۥّ */
    public String f14617;

    /* JADX INFO: renamed from: ۥۗ */
    public String f14618;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f14619;

    /* JADX INFO: renamed from: ۦؑ */
    public String f14620;

    /* JADX INFO: renamed from: ۦِ */
    public C3108 f14621;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f14622;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f14623;

    public AbstractC4435(int i) {
        super(i);
        this.f14616 = new StringBuilder();
        this.f14623 = false;
        this.f14619 = false;
        this.f14622 = false;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m7728(char c) {
        String strValueOf = String.valueOf(c);
        String str = this.f14620;
        if (str != null) {
            strValueOf = str.concat(strValueOf);
        }
        this.f14620 = strValueOf;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m7729(String str) {
        this.f14619 = true;
        String str2 = this.f14617;
        StringBuilder sb = this.f14616;
        if (str2 != null) {
            sb.append(str2);
            this.f14617 = null;
        }
        if (sb.length() == 0) {
            this.f14617 = str;
        } else {
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m7730() {
        String string;
        if (this.f14621 == null) {
            this.f14621 = new C3108();
        }
        String str = this.f14620;
        StringBuilder sb = this.f14616;
        if (str != null) {
            String strTrim = str.trim();
            this.f14620 = strTrim;
            if (strTrim.length() > 0) {
                if (this.f14619) {
                    string = sb.length() > 0 ? sb.toString() : this.f14617;
                } else {
                    string = this.f14623 ? "" : null;
                }
                C3108 c3108 = this.f14621;
                String str2 = this.f14620;
                int iM5688 = c3108.m5688(str2);
                if (iM5688 != -1) {
                    c3108.f10421[iM5688] = string;
                } else {
                    int i = c3108.f10423;
                    int i2 = i + 1;
                    if (i2 < i) {
                        C1078.m2272("Must be true");
                        return;
                    }
                    String[] strArr = c3108.f10422;
                    int length = strArr.length;
                    if (length < i2) {
                        int i3 = length >= 4 ? i * 2 : 4;
                        if (i2 <= i3) {
                            i2 = i3;
                        }
                        String[] strArr2 = new String[i2];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
                        c3108.f10422 = strArr2;
                        String[] strArr3 = c3108.f10421;
                        String[] strArr4 = new String[i2];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
                        c3108.f10421 = strArr4;
                    }
                    String[] strArr5 = c3108.f10422;
                    int i4 = c3108.f10423;
                    strArr5[i4] = str2;
                    c3108.f10421[i4] = string;
                    c3108.f10423 = i4 + 1;
                }
            }
        }
        this.f14620 = null;
        this.f14623 = false;
        this.f14619 = false;
        AbstractC4294.m7586(sb);
        this.f14617 = null;
    }

    @Override // p000.AbstractC4294
    /* JADX INFO: renamed from: ۦٌ, reason: merged with bridge method [inline-methods] */
    public AbstractC4435 mo975() {
        this.f14618 = null;
        this.f14615 = null;
        this.f14620 = null;
        AbstractC4294.m7586(this.f14616);
        this.f14617 = null;
        this.f14623 = false;
        this.f14619 = false;
        this.f14622 = false;
        this.f14621 = null;
        return this;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m7732(String str) {
        String str2 = this.f14618;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f14618 = str;
        this.f14615 = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m7733(int[] iArr) {
        this.f14619 = true;
        String str = this.f14617;
        StringBuilder sb = this.f14616;
        if (str != null) {
            sb.append(str);
            this.f14617 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final String m7734() {
        String str = this.f14618;
        if (str != null && str.length() != 0) {
            return this.f14618;
        }
        C1078.m2272("Must be false");
        return null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m7735(char c) {
        this.f14619 = true;
        String str = this.f14617;
        StringBuilder sb = this.f14616;
        if (str != null) {
            sb.append(str);
            this.f14617 = null;
        }
        sb.append(c);
    }
}
