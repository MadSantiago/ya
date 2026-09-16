package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۥٖۣؑۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1440 extends CancellationException {

    /* JADX INFO: renamed from: ۦۨ */
    public final transient AbstractC0386 f4935;

    public C1440(String str, Throwable th, AbstractC0386 abstractC0386) {
        super(str);
        this.f4935 = abstractC0386;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1440)) {
            return false;
        }
        C1440 c1440 = (C1440) obj;
        if (!AbstractC3831.m6874(c1440.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c1440.f4935;
        if (obj2 == null) {
            obj2 = C4816.f15876;
        }
        Object obj3 = this.f4935;
        if (obj3 == null) {
            obj3 = C4816.f15876;
        }
        return obj2.equals(obj3) && AbstractC3831.m6874(c1440.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Object obj = this.f4935;
        if (obj == null) {
            obj = C4816.f15876;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f4935;
        if (obj == null) {
            obj = C4816.f15876;
        }
        sb.append(obj);
        return sb.toString();
    }
}
