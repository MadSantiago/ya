package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۥؙؖۦِ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0744 implements InterfaceC3077 {

    /* JADX INFO: renamed from: ۥْ */
    public Object f2702;

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile boolean f2703;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile InterfaceC3077 f2704;

    @Override // p000.InterfaceC3077
    public final Object get() {
        if (!this.f2703) {
            synchronized (this) {
                try {
                    if (!this.f2703) {
                        InterfaceC3077 interfaceC3077 = this.f2704;
                        Objects.requireNonNull(interfaceC3077);
                        Object obj = interfaceC3077.get();
                        this.f2702 = obj;
                        this.f2703 = true;
                        this.f2704 = null;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f2702;
    }

    public final String toString() {
        Object string = this.f2704;
        if (string == null) {
            String strValueOf = String.valueOf(this.f2702);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
