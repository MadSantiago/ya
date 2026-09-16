package p000;

import java.util.Locale;

/* JADX INFO: renamed from: ۥؗؖۖٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0620 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Locale f2309;

    public C0620(Locale locale) {
        this.f2309 = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0620)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC3831.m6874(this.f2309.toLanguageTag(), ((C0620) obj).f2309.toLanguageTag());
    }

    public final int hashCode() {
        return this.f2309.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f2309.toLanguageTag();
    }
}
