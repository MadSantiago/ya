package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦُۚؑۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5148 {

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f17057;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f17058;

    public C5148(String str, boolean z) {
        AbstractC0487.m1090(str);
        this.f17058 = str;
        AbstractC0487.m1090("com.google.android.gms");
        this.f17057 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5148)) {
            return false;
        }
        C5148 c5148 = (C5148) obj;
        return AbstractC2164.m4207(this.f17058, c5148.f17058) && AbstractC2164.m4207("com.google.android.gms", "com.google.android.gms") && AbstractC2164.m4207(null, null) && this.f17057 == c5148.f17057;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17058, "com.google.android.gms", null, 4225, Boolean.valueOf(this.f17057)});
    }

    public final String toString() {
        String str = this.f17058;
        if (str != null) {
            return str;
        }
        AbstractC0487.m1047(null);
        throw null;
    }
}
