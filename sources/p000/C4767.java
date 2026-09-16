package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦٖٝؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4767 implements InterfaceC3077, Serializable {

    /* JADX INFO: renamed from: ۥْ */
    public transient Object f15718;

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile transient boolean f15719;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3077 f15720;

    public C4767(InterfaceC3077 interfaceC3077) {
        interfaceC3077.getClass();
        this.f15720 = interfaceC3077;
    }

    @Override // p000.InterfaceC3077
    public final Object get() {
        if (!this.f15719) {
            synchronized (this) {
                try {
                    if (!this.f15719) {
                        Object obj = this.f15720.get();
                        this.f15718 = obj;
                        this.f15719 = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f15718;
    }

    public final String toString() {
        Object string;
        if (this.f15719) {
            String strValueOf = String.valueOf(this.f15718);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f15720;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
