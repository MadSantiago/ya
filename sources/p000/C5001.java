package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦِۘؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5001 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC2601 f16544;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5002 f16545;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f16546;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f16547;

    public C5001(C5002 c5002, InterfaceC2601 interfaceC2601, String str) {
        this.f16545 = c5002;
        this.f16544 = interfaceC2601;
        this.f16547 = str;
        this.f16546 = Arrays.hashCode(new Object[]{c5002, interfaceC2601, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5001)) {
            return false;
        }
        C5001 c5001 = (C5001) obj;
        return AbstractC2164.m4207(this.f16545, c5001.f16545) && AbstractC2164.m4207(this.f16544, c5001.f16544) && AbstractC2164.m4207(this.f16547, c5001.f16547);
    }

    public final int hashCode() {
        return this.f16546;
    }
}
