package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۦؖؖٓؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3367 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC3077 f11245;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f11246;

    public C3367(Context context, InterfaceC3077 interfaceC3077) {
        this.f11246 = context;
        this.f11245 = interfaceC3077;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3367)) {
            return false;
        }
        C3367 c3367 = (C3367) obj;
        if (!this.f11246.equals(c3367.f11246)) {
            return false;
        }
        InterfaceC3077 interfaceC3077 = c3367.f11245;
        InterfaceC3077 interfaceC3078 = this.f11245;
        if (interfaceC3078 == null) {
            return interfaceC3077 == null;
        }
        return interfaceC3078.equals(interfaceC3077);
    }

    public final int hashCode() {
        int iHashCode = this.f11246.hashCode() ^ 1000003;
        InterfaceC3077 interfaceC3077 = this.f11245;
        return (interfaceC3077 == null ? 0 : interfaceC3077.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f11246.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f11245);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
