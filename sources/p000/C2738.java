package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۥۥِٟؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2738 extends AbstractC4731 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC5375 f9063;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5375 f9064;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f9065;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f9066;

    public C2738(Context context, InterfaceC5375 interfaceC5375, InterfaceC5375 interfaceC5376, String str) {
        if (context == null) {
            C0178.m387("Null applicationContext");
            throw null;
        }
        this.f9065 = context;
        if (interfaceC5375 == null) {
            C0178.m387("Null wallClock");
            throw null;
        }
        this.f9064 = interfaceC5375;
        if (interfaceC5376 == null) {
            C0178.m387("Null monotonicClock");
            throw null;
        }
        this.f9063 = interfaceC5376;
        if (str != null) {
            this.f9066 = str;
        } else {
            C0178.m387("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4731) {
            C2738 c2738 = (C2738) ((AbstractC4731) obj);
            if (this.f9065.equals(c2738.f9065) && this.f9064.equals(c2738.f9064) && this.f9063.equals(c2738.f9063) && this.f9066.equals(c2738.f9066)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9066.hashCode() ^ ((((((this.f9065.hashCode() ^ 1000003) * 1000003) ^ this.f9064.hashCode()) * 1000003) ^ this.f9063.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f9065);
        sb.append(", wallClock=");
        sb.append(this.f9064);
        sb.append(", monotonicClock=");
        sb.append(this.f9063);
        sb.append(", backendName=");
        return AbstractC3761.m6621(sb, this.f9066, "}");
    }
}
