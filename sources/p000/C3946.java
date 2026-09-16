package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦِؚؒٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3946 implements InterfaceC2601 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3946 f13180 = new C3946(null);

    /* JADX INFO: renamed from: ۥۗ */
    public final String f13181;

    public /* synthetic */ C3946(String str) {
        this.f13181 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3946) {
            return AbstractC2164.m4207(this.f13181, ((C3946) obj).f13181);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13181});
    }
}
