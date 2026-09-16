package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥٍؕٝۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0960 extends AbstractC4479 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f3401;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f3402;

    /* JADX INFO: renamed from: ۥۣ */
    public final Drawable f3403;

    public C0960(Drawable drawable, boolean z, int i) {
        this.f3403 = drawable;
        this.f3402 = z;
        this.f3401 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0960)) {
            return false;
        }
        C0960 c0960 = (C0960) obj;
        return AbstractC3831.m6874(this.f3403, c0960.f3403) && this.f3402 == c0960.f3402 && this.f3401 == c0960.f3401;
    }

    public final int hashCode() {
        return AbstractC3761.m6632(this.f3401) + AbstractC5078.m8672(this.f3403.hashCode() * 31, 31, this.f3402);
    }
}
