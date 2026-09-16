package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦٚؒٝ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4535 implements Serializable {

    /* JADX INFO: renamed from: ۦۨ */
    public final Throwable f14986;

    public C4535(Throwable th) {
        this.f14986 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4535) {
            return AbstractC3831.m6874(this.f14986, ((C4535) obj).f14986);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14986.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f14986 + ')';
    }
}
