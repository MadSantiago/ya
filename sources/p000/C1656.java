package p000;

/* JADX INFO: renamed from: ۥٜٙؔٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1656 implements InterfaceC2218 {

    /* JADX INFO: renamed from: ۦۨ */
    public final ThreadLocal f5509;

    public C1656(ThreadLocal threadLocal) {
        this.f5509 = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1656) && this.f5509.equals(((C1656) obj).f5509);
    }

    public final int hashCode() {
        return this.f5509.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f5509 + ')';
    }
}
