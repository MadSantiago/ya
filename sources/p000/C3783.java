package p000;

import android.net.NetworkRequest;

/* JADX INFO: renamed from: ۦٍؔٛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3783 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final String f12571 = C1984.m3875("NetworkRequestCompat");

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f12572;

    public C3783(NetworkRequest networkRequest) {
        this.f12572 = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3783) && AbstractC3831.m6874(this.f12572, ((C3783) obj).f12572);
    }

    public final int hashCode() {
        Object obj = this.f12572;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f12572 + ')';
    }
}
