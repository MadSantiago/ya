package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۦؘْؕ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4079 extends AbstractC4586 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f13595;

    /* JADX INFO: renamed from: ۥُ */
    public final String f13596;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f13597;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0834 f13598;

    /* JADX INFO: renamed from: ۥۣ */
    public final Drawable f13599;

    /* JADX INFO: renamed from: ۦؑ */
    public final C5772 f13600;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f13601;

    public C4079(Drawable drawable, C0834 c0834, int i, C5772 c5772, String str, boolean z, boolean z2) {
        this.f13599 = drawable;
        this.f13598 = c0834;
        this.f13595 = i;
        this.f13600 = c5772;
        this.f13596 = str;
        this.f13597 = z;
        this.f13601 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4079)) {
            return false;
        }
        C4079 c4079 = (C4079) obj;
        return AbstractC3831.m6874(this.f13599, c4079.f13599) && AbstractC3831.m6874(this.f13598, c4079.f13598) && this.f13595 == c4079.f13595 && AbstractC3831.m6874(this.f13600, c4079.f13600) && AbstractC3831.m6874(this.f13596, c4079.f13596) && this.f13597 == c4079.f13597 && this.f13601 == c4079.f13601;
    }

    public final int hashCode() {
        int iM6632 = (AbstractC3761.m6632(this.f13595) + ((this.f13598.hashCode() + (this.f13599.hashCode() * 31)) * 31)) * 31;
        C5772 c5772 = this.f13600;
        int iHashCode = (iM6632 + (c5772 != null ? c5772.hashCode() : 0)) * 31;
        String str = this.f13596;
        return Boolean.hashCode(this.f13601) + AbstractC5078.m8672((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f13597);
    }

    @Override // p000.AbstractC4586
    /* JADX INFO: renamed from: ۥۣ */
    public final C0834 mo7264() {
        return this.f13598;
    }
}
