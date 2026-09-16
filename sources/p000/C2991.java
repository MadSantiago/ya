package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ۦؚؐؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2991 {

    /* JADX INFO: renamed from: ۥؗ */
    public C2991 f10057;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f10058;

    /* JADX INFO: renamed from: ۥۣ */
    public int f10059;

    /* JADX INFO: renamed from: ۦؑ */
    public final HashMap f10060 = new HashMap(0);

    public C2991(int i, int i2) {
        if (i > i2) {
            C0178.m393();
            throw null;
        }
        this.f10059 = i;
        this.f10058 = i2;
        this.f10057 = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return AbstractC5078.m8673(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
