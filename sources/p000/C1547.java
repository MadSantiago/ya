package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥٗؗۚٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1547 implements InterfaceC5130, Serializable {

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f5233;

    /* JADX INFO: renamed from: ۦۨ */
    public InterfaceC4448 f5234;

    @Override // p000.InterfaceC5130
    public final Object getValue() {
        Object obj = this.f5233;
        if (obj != C1397.f4779) {
            return obj;
        }
        Object objMo449 = this.f5234.mo449();
        this.f5233 = objMo449;
        this.f5234 = null;
        return objMo449;
    }

    public final String toString() {
        return this.f5233 != C1397.f4779 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
