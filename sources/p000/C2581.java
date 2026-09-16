package p000;

import android.view.KeyEvent;

/* JADX INFO: renamed from: ۥٜۡؗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2581 {

    /* JADX INFO: renamed from: ۥۣ */
    public final KeyEvent f8625;

    public final boolean equals(Object obj) {
        if (obj instanceof C2581) {
            return AbstractC3831.m6874(this.f8625, ((C2581) obj).f8625);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8625.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f8625 + ')';
    }
}
