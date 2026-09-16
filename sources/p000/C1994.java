package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥٟؓؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1994 implements InterfaceC3077, Serializable {

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f6575;

    public C1994(Object obj) {
        this.f6575 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1994) {
            return AbstractC2776.m5240(this.f6575, ((C1994) obj).f6575);
        }
        return false;
    }

    @Override // p000.InterfaceC3077
    public final Object get() {
        return this.f6575;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6575});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6575);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
