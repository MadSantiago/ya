package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۦٌٜٝؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4744 extends AbstractC4586 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Throwable f15671;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0834 f15672;

    /* JADX INFO: renamed from: ۥۣ */
    public final Drawable f15673;

    public C4744(Drawable drawable, C0834 c0834, Throwable th) {
        this.f15673 = drawable;
        this.f15672 = c0834;
        this.f15671 = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4744)) {
            return false;
        }
        C4744 c4744 = (C4744) obj;
        return AbstractC3831.m6874(this.f15673, c4744.f15673) && AbstractC3831.m6874(this.f15672, c4744.f15672) && this.f15671.equals(c4744.f15671);
    }

    public final int hashCode() {
        Drawable drawable = this.f15673;
        int iHashCode = drawable != null ? drawable.hashCode() : 0;
        return this.f15671.hashCode() + ((this.f15672.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // p000.AbstractC4586
    /* JADX INFO: renamed from: ۥۣ */
    public final C0834 mo7264() {
        return this.f15672;
    }
}
