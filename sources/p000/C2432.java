package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥ۟ؒۢٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2432 implements InterfaceC5130, Serializable {

    /* JADX INFO: renamed from: ۦۨ */
    public InterfaceC4448 f8098;

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile Object f8097 = C1397.f4779;

    /* JADX INFO: renamed from: ۥْ */
    public final Object f8096 = this;

    public C2432(InterfaceC4448 interfaceC4448) {
        this.f8098 = interfaceC4448;
    }

    @Override // p000.InterfaceC5130
    public final Object getValue() {
        Object objMo449;
        Object obj = this.f8097;
        C1397 c1397 = C1397.f4779;
        if (obj != c1397) {
            return obj;
        }
        synchronized (this.f8096) {
            objMo449 = this.f8097;
            if (objMo449 == c1397) {
                objMo449 = this.f8098.mo449();
                this.f8097 = objMo449;
                this.f8098 = null;
            }
        }
        return objMo449;
    }

    public final String toString() {
        return m4545() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m4545() {
        return this.f8097 != C1397.f4779;
    }
}
