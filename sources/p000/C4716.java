package p000;

import android.app.Notification;

/* JADX INFO: renamed from: ۦًٜٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4716 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Notification f15546;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f15547;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f15548;

    public C4716(int i, Notification notification, int i2) {
        this.f15548 = i;
        this.f15546 = notification;
        this.f15547 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4716.class != obj.getClass()) {
            return false;
        }
        C4716 c4716 = (C4716) obj;
        if (this.f15548 == c4716.f15548 && this.f15547 == c4716.f15547) {
            return this.f15546.equals(c4716.f15546);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15546.hashCode() + (((this.f15548 * 31) + this.f15547) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f15548 + ", mForegroundServiceType=" + this.f15547 + ", mNotification=" + this.f15546 + '}';
    }
}
