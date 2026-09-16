package p000;

import android.graphics.Insets;

/* JADX INFO: renamed from: ۦ۟ؗۛ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5364 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C5364 f17692 = new C5364(0, 0, 0, 0);

    /* JADX INFO: renamed from: ۥؗ */
    public final int f17693;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f17694;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f17695;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f17696;

    public C5364(int i, int i2, int i3, int i4) {
        this.f17695 = i;
        this.f17694 = i2;
        this.f17693 = i3;
        this.f17696 = i4;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C5364 m9014(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f17692 : new C5364(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C5364 m9015(C5364 c5364, C5364 c5365) {
        return m9014(Math.min(c5364.f17695, c5365.f17695), Math.min(c5364.f17694, c5365.f17694), Math.min(c5364.f17693, c5365.f17693), Math.min(c5364.f17696, c5365.f17696));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5364 m9016(C5364 c5364, C5364 c5365) {
        return m9014(Math.max(c5364.f17695, c5365.f17695), Math.max(c5364.f17694, c5365.f17694), Math.max(c5364.f17693, c5365.f17693), Math.max(c5364.f17696, c5365.f17696));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static C5364 m9017(Insets insets) {
        return m9014(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5364.class != obj.getClass()) {
            return false;
        }
        C5364 c5364 = (C5364) obj;
        return this.f17696 == c5364.f17696 && this.f17695 == c5364.f17695 && this.f17693 == c5364.f17693 && this.f17694 == c5364.f17694;
    }

    public final int hashCode() {
        return (((((this.f17695 * 31) + this.f17694) * 31) + this.f17693) * 31) + this.f17696;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f17695);
        sb.append(", top=");
        sb.append(this.f17694);
        sb.append(", right=");
        sb.append(this.f17693);
        sb.append(", bottom=");
        return AbstractC3761.m6638(sb, this.f17696, '}');
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Insets m9018() {
        return AbstractC5183.m8794(this.f17695, this.f17694, this.f17693, this.f17696);
    }
}
